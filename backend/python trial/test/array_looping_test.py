def main():
    #memasukkan jumlah data
    jumlah_data = int(input("masukkan jumlah data = "))

    #membuat list untuk menyimpan data
    data = []

    # input data oleh pengguna
    for i in range(jumlah_data):
        print(f"\nmasukkan data untuk mata kuliah ke- {i + 1}")
        nama_mk = input("masukkan nama mata kuliah = ")
        nilai_teori = int(input("nilai teori = "))
        nilai_praktik = int(input("nilai praktik = "))
        data.append([nama_mk, nilai_teori, nilai_praktik])

    print("\n----------------------------------------------")
    print(f"jumlah dta = {len(data)}")
    print("------------------------------------------------")

    # menampilkan data mata kuliah

    for item in data:
        print(f"mata kuliah = {item[0]}")
        print(f"nilai teori = {item[1]}")
        print(f"nilai praktik = {item[2]}\n")

def main():
    print ("-------------------------------------")
    print ("mata kuliah teori praktikum rata rata")
    print ("-------------------------------------")

    #menampilkkan tabel
    for item in data:
        rata_rata = (item[1] + item[2]) / 2
        print(f"{item[0]:<13} {item[1]:<7} {item[2]:<11} {rata_rata:.1f}")

if __name__ == "__main__":
    main()








