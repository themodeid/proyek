const fs = require("fs");
const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("masukkan nama anda = ", function (nama) {
  console.log(nama);

  rl.close();
});
