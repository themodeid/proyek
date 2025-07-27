// function
function cetaknama(nama) {
  return `halo,nama saya ${nama}`;
}
// variabel
const PI = 3.14;

// objek
const mahasiswa = {
  nama: "adam",
  ummur: 20,
  cetakmhs() {
    console.log(`halo nama saya ${this.nama} dan umur saya ${this.umur}`);
  },
};

module.exports = {
  // function
  cetaknama,
  // variabel
  PI,
  // objek
  mahasiswa,
};
