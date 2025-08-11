const fs = require("fs");
const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const filePath = __dirname + "/kontak.json";

rl.question("Masukkan nama anda = ", function (nama) {
  rl.question("Masukkan umur anda = ", function (umur) {
    // simpan ke file JSON
  });
});
