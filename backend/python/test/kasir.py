import datetime

#menambahkan barang
def tambah_barang(daftar_belanja):
    
    nama = input("Nama barang: ")
    try:
        harga = float(input("Harga satuan: "))
        jumlah = int(input("Jumlah: "))
        daftar_belanja.append({"nama": nama, "harga": harga, "jumlah": jumlah})
    except ValueError:
        print("Input harga atau jumlah tidak valid. Ulangi.")

# menampilkan barang yang ada di daftar belanja
def tampilkan_struk(daftar_belanja):
    print("\n===== STRUK PEMBELIAN =====")
    total = 0
    for item in daftar_belanja:
        subtotal = item["harga"] * item["jumlah"]
        total += subtotal
        print(f"{item['nama']} x{item['jumlah']} = Rp{subtotal:,.2f}")
    print("---------------------------")
    pajak = total * 0.1  # 10% pajak
    total_bayar = total + pajak
    print(f"Subtotal     : Rp{total:,.2f}")
    print(f"Pajak (10%)  : Rp{pajak:,.2f}")
    print(f"Total Bayar  : Rp{total_bayar:,.2f}") 
    print("=====================================\n")
    return total_bayar

def simpan_struk(daftar_belanja, total_bayar):
    waktu = datetime.datetime.now().strftime("%Y-%m-%d_%H-%M-%S")
    nama_file = f"struk_{waktu}.txt"
    with open(nama_file, "w") as file:
        file.write("=== STRUK PEMBELIAN WRITE ===\n")
        for item in daftar_belanja:
            subtotal = item["harga"] * item["jumlah"]
            file.write(f"{item['nama']} x{item['jumlah']} = Rp{subtotal:,.2f}\n")
        pajak = sum(item["harga"] * item["jumlah"] for item in daftar_belanja) * 0.1
        file.write(f"\nSubtotal     : Rp{total_bayar - pajak:,.2f}")
        file.write(f"\nPajak (10%)  : Rp{pajak:,.2f}")
        file.write(f"\nTotal Bayar  : Rp{total_bayar:,.2f}\n")
    print(f"Struk telah disimpan di: {nama_file}")

def kasir():
    daftar_belanja = []
    while True:
        print("\n===SILAHKAN PILIH METODE===")
        print("\n1. Tambah Barang")
        print("2. Lihat & Cetak Struk")
        print("3. Keluar")
        pilihan = input("Pilih menu (1/2/3): ")

        if pilihan == '1':
            tambah_barang(daftar_belanja)
        elif pilihan == '2':
            if not daftar_belanja:
                print("Belum ada barang yang ditambahkan.")
                continue
            total_bayar = tampilkan_struk(daftar_belanja)
            try:
                bayar = float(input("Masukkan uang bayar: Rp"))
                if bayar >= total_bayar:
                    kembali = bayar - total_bayar
                    print(f"Kembalian: Rp{kembali:,.2f}")
                    simpan_struk(daftar_belanja, total_bayar)
                else:
                    print("Uang tidak cukup!")
            except ValueError:
                print("Input uang tidak valid.")
        elif pilihan == '3':
            print("Terima kasih telah menggunakan kasir sederhana!")
            break
        else:
            print("Menu tidak valid.")

# Jalankan program
kasir()
