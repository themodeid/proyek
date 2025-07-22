print ("program to do list sederhana")

task = []

# menambahkan tugas
def tambah_tugas():
    #meninput tuggas 
    tugas = input("masukkan tugas baru = ")
    #tugas dimasukkan ke dalam dictionary list
    task.append({"tugas" : tugas, "selesai" : False})
    print (f'tugas "{tugas}" berhasil ditambahkan. \n')

#menampilkan tugas yang sudah ditambah
def tampilkan_tugas():
    #kondisi jika tidak ada tugas
    if not task:
        print("tidak ada tugas. \n")
        return
    
    #menampilkan semua tugas
    print("daftar tugas:")
    for i, item in enumerate(task, start=1):
        status = "selesai" if item["selesai"] else "belum selesai"
        print(f"{i}. [{status}] {item ['tugas']}")
    print()

#menghapus tugas
def hapus_tugas():
    #menampilkan tugas yang sudah ada
    tampilkan_tugas()
    if not task:
        return
    
    #meninput nomor tugas yang ingin dihapus
    try:
        nomor = int(input("masukkan nomor tugas yang ingin dimasukkan"))
        #kondisi jika nomor yang diinput tidak kurang dari satu dan ebih dari jumlah tugas
        if 1 <= nomor <= len(task):
            # mengambil list dari dictionary 
            tugas = task.pop(nomor - 1)
            print(f'tugas "{tugas["tugas"]}" berhasil dihapus. \n')
        else:
            print("nomor tugas tidak valid. \n")
    except ValueError:
        print("input harus berupa angka. \n")

# menandai yang sudah selesai
def done():
    tampilkan_tugas()
    if not task:
        return
    try:
        nomor = int(input("masukkan nomor tugas yang sudah selesai"))
        if 1 <= nomor <= len(task):
            task[nomor - 1]["selesai"] = True
            print(f'tugas "{task[nomor - 1]["tugas"]}" berhasil ditandai selesai. \n')
    except ValueError:
        print("input harus berupa angka. \n")

# menu
def menu():
    print("=== Aplikasi To-Do List Sederhana ===")
    print("1. Tambah tugas")
    print("2. Tampilkan tugas")
    print("3. Hapus tugas")
    print("4. Tandai tugas selesai")
    print("5. Keluar")

while True:
    menu()
    pilihan = input("Pilih menu (1-5): ")
    if pilihan == "1":
        tambah_tugas()
    elif pilihan == "2":
        tampilkan_tugas()
    elif pilihan == "3":
        hapus_tugas()
    elif pilihan == "4":
        done()
    elif pilihan == "5":
        print("Terima kasih sudah menggunakan aplikasi ini!")
        break
    else:
        print("Pilihan tidak valid, coba lagi.\n")



