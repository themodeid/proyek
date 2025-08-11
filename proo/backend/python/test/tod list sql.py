import mysql.connector


#api ke database (mysql)
def connect_db():
    return mysql.connector.connect(
        host ="localhost",
        user = "root",
        database = "todos"
    )


#menambahkan tugas
def tambah_tugas():
    task = input("masukkan tugas maks 10 karakter) = ")
    if len(task) > 10:
        print("tugas terlalu panjang")
        return
    
    #menghubungkan databases
    db = connect_db()
    #mengambil perintah ke sql
    cursor = db.cursor()
    #perintah sql
    sql = "insert into list (list1) values (%s)"
    val = (task,)

    try:
        # menjalankan perintah dari sql dan data yang dimasukkan
        cursor.execute(sql, val)
        #menyimpan perubahan ke database
        db.commit()
        print("tugas berhasil dimasukkan.")
    except mysql.connector.errors.IntegrityError:
        print("gagal tugas sudah ada")
    cursor.close()
    db.close()

#menampilkan tugas
def tampilkan_tugas():
    #menghubungkan databases
    db = connect_db()
    #mengambil perintah ke sql
    cursor = db.cursor()
    #menjalankan perintah sql
    cursor.execute("select * from list")
    #mengambil hasil semua data
    results = cursor.fetchall()
    print("\n daftar tugas:")
    for row in results:
        print(f"- {row[0]}")
    cursor.close()
    db.close()

#mencari tugas
def cari_tugas():
    #mencari kata kunci tugas
    keyword = input("cari tugas = ")
    #menghubungkan databases
    db = connect_db()
    #mengambil perintah ke sql
    cursor = db.cursor()
    #perintah sql untuk memilih perintah sesuai dengan keyword
    sql = "select * from list where list1 like %s"
    #mengeksekusi perintah sql
    cursor.execute(sql , ('%' + keyword + '%',))
    #mengambil hasil semua data dari eksekusi data 
    results = cursor.fetchall()
    print("\n hasil pencarian = ")
    #menampilkan semua data yang ditemukan
    for row in results:
        print (f"- {row[0]}")
    cursor.close()
    db.close()

def hapus_tugas():
    #memasukkan semua data yang ingin dihapus
    nama_tugas = input("masukkan nama tugas yang ingin dihapus = ")
    #menghubungkan databases
    db = connect_db()
    #mengambil perintah ke sql
    cursor = db.cursor()
    #menghapus nama dengan nama yang ingin dihapus
    sql = "delete from list where list1 = %s"
    #mengeksekusi perintah sql
    cursor.execute(sql , (nama_tugas ,))
    #menyimpan perubahan ke dalam database
    db.commit() 
    #konsisi jika berhasil dihapus atau tidak 
    if cursor.rowcount > 0:
        print ("tugas berhasil dihapus.")
    else:
        print ("tugas tidak ditemukan.")
    cursor.close()
    db.close()

def menu():
    while True:
        print("\n=== Aplikasi To-Do List (Database: list.list1) ===")
        print("1. Tambah Tugas")
        print("2. Tampilkan Semua Tugas")
        print("3. Cari Tugas")
        print("4. Hapus Tugas")
        print("5. Keluar")

        pilihan = input("Pilih menu (1-5): ")

        if pilihan == "1":
            tambah_tugas()
        elif pilihan == "2":
            tampilkan_tugas()
        elif pilihan == "3":
            cari_tugas()
        elif pilihan == "4":
            hapus_tugas()
        elif pilihan == "5":
            print("👋 Terima kasih telah menggunakan To-Do List!")
            break
        else:
            print("❗ Pilihan tidak valid. Coba lagi.")

# Jalankan program
menu()
