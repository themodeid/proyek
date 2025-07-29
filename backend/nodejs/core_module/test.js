const fs = require("fs");
const rl = require("readline");

const rl = Readline.interface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("masukkan nama anda = ", function (nama) {
  console.log(nama);

  rl.close();
});
