import mysql.connector

# Koneksi ke database
db = mysql.connector.connect(
    host="localhost",
    user="root",
    password="",
    database="latihan"
)

cursor = db.cursor()

# Menampilkan semua data dari tabel users
sql = "SELECT * FROM users"

try:
    cursor.execute(sql)
    hasil = cursor.fetchall()

    print("Data users:")
    for row in hasil:
        print(f"ID: {row[0]}, Username: {row[1]}, Password: {row[2]}")
except Exception as e:
    print("Gagal mengambil data:", e)

# Tutup koneksi
cursor.close()
db.close()
