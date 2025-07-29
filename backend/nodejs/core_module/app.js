const fs = require("fs");

const rl = Readline.createinterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("masukkan nama anda = ", (nama) => {
  rl.question("masukkan umur anda = ", (umur) => {
    const data = {nama,umur};
    const file = fs.readFile('/vs code project/backend/nodejs/core_module/kontak.json');
    const kontak = json.parse()
  });
});
