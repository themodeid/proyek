ekspresi = []

while True:
    token = input("Masukkan angka/operator atau '=' untuk hasil: ")

    if token == "=":
        # Gabungkan list jadi string ekspresi: ['1', '*', '2'] → '1*2'
        ekspresi_str = ''.join(ekspresi)
        try:
            hasil = eval(ekspresi_str)
            print("Hasil:", hasil)
        except:
            print("Ekspresi tidak valid.")
        break
    else:
        ekspresi.append(token)
