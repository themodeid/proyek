while True:
    try:
        angka = float(input("input = "))
        hasil = 2 / angka
        print(hasil)
    except ZeroDivisionError:
        print("pembagian tidak bisa dibagi dengan 0")
    except ValueError:
        print("harap masukkan angka yang benar ")

    line = input("apakah anda ingin keluar (Y/T)= ")

    if (line == "Y"):
        break
    
