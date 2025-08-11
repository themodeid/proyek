import mysql.connector

# Koneksi ke database
db = mysql.connector.connect(
    host="localhost",
    user="root",
    password="",           # Ganti jika MySQL kamu ada password
    database="latihan"     # Ganti ke database kamu: latihan
)

cursor = db.cursor()

# Input dari user
username = input("Masukkan username: ")
password = input("Masukkan password: ")

# Query insert
sql = "INSERT INTO users (username, password) VALUES (%s, %s)"
val = (username, password)

try:
    cursor.execute(sql, val)
    db.commit()
    print(f"{cursor.rowcount} data berhasil dimasukkan.")
except Exception as e:
    print("Gagal menyimpan data:", e)
    db.rollback()

# Tutup koneksi
cursor.close()
db.close()
