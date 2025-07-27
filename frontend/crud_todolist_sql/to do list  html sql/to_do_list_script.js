// membuat objek tombol
const tambah = document.getElementById("tambah_mahasiswa");
const daftar = document.getElementById("daftar");
const cari = document.getElementById("cari");
// container
const container = document.getElementById("container");
tambah.addEventListener("click", function () {
  // kosongkan container
  container.innerHTML = "";

  //   membuat input
  //   membuat fungsi input
  const npm = document.createElement("innput");
  npm.type = "text";
  npm.id = "input_mahasiswa";
  npm.placeholder = "masukkan nama mahasiswa";

  const input_mahasiswa = document.createElement("innput");
  input_mahasiswa.type = "text";
  input_mahasiswa.id = "input_mahasiswa";
  input_mahasiswa.placeholder = "masukkan nama mahasiswa";

  const hp = document.createElement("innput");
  hp.type = "text";
  hp.id = "input_mahasiswa";
  hp.placeholder = "masukkan nama mahasiswa";

  
});
