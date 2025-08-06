function sapa() {
  console.log(`halo ${nama}`);
}

function panggil(callback) {
  const nama = adam;
  callback(nama);
}

panggil(sapa);
