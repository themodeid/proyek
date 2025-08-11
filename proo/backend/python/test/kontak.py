kontak = []


#menambahkan kontak
def tambah_kontak():
    #list kontak
    global kontak
    nomor = (int(input("masukkan nomor telepon = ")))
    nama =  (input("masukkan nama = "))

    if not nama or not nomor:
        print("nama dan nomor tidak boleh kososng")
        return
    
    kontak.append([nama,nomor])
    print("kontak berhasil ditambahkan")


# untuk memperlihatkan kontak
def lihat_kontak():
    if not kontak:
        print("Tidak ada kontak yang disimpan.\n")
        return

    print("=== Daftar Kontak ===")
    kontak_urut = sorted(kontak)
    for data in kontak_urut:
        print(f"Nama: {data[0]}, Nomor: {data[1]}")
    print()

# cari kontak
def cari_kontak():
    cari = input("masukkan nama kontak yang ingin dicari = ")
    ditemukan = False

    for data in kontak:
        if cari.lower() in data[0].lower():
            print(f"nama = {data[0]}, nomor kontak = {data[1]}")
            ditemukan = True


#menghapus kontak
def hapus_kontak():
    global kontak
    if not kontak:
        print("tidak ada kontak yang dapat dihapus.\n")
        return

    hapus_nama = input("masukkan nama yang ingin dihapus = ")

    for i, data in enumerate(kontak):
        if data[0].lower() == hapus_nama.lower():
            kontak.pop(i)
            print(f"Kontak dengan nama '{hapus_nama}' telah dihapus.\n")
            return
        
while True:

    def menu():
        print("=== Aplikasi kontak Sederhana ===")
        print("1. Tambah kontak")
        print("2. Tampilkan kontak")
        print("3. Hapus kontak")
        print("4. cari kontak")
        print("5. Keluar\n")

    menu() 
    pilihan = input("masukkan perintah yang ada di menu = ")
    if pilihan == "1":
        tambah_kontak()
    elif pilihan == "2":
        lihat_kontak()
    elif pilihan == "3":
        hapus_kontak()
    elif pilihan == "4":
        cari_kontak()
    elif pilihan == "5":
        print("terima kasih")
        break
    else:
        print("pilihan tidak valid")
