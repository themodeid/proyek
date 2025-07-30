const fs = require("fs");
const readline = require("readline");

// Buat antarmuka input/output terminal
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

// Path absolut ke file kontak.json agar tidak error path
const filePath = __dirname + "/kontak.json";

// Fungsi utama
rl.question("Masukkan nama anda = ", function (nama) {
  rl.question("Masukkan umur anda = ", function (umur) {
    const dataBaru = { nama, umur };

    // Cek dan baca file kontak.json
    let kontak = [];
    try {
      if (fs.existsSync(filePath)) {
        const fileBuffer = fs.readFileSync(filePath, "utf-8");
        kontak = JSON.parse(fileBuffer);
      }
    } catch (err) {
      console.log("Terjadi kesalahan saat membaca file:", err);
    }

    // Tambahkan data baru
    kontak.push(dataBaru);

    // Simpan kembali ke kontak.json
    try {
      fs.writeFileSync(filePath, JSON.stringify(kontak, null, 2));
      console.log("Data berhasil disimpan!");
    } catch (err) {
      console.log("Gagal menyimpan data:", err);
    }

    rl.close();
  });
});
