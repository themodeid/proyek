document.getElementById("btn").addEventListener("click", function () {
  let angka1 = parseFloat(document.getElementById("angka1").value);
  let angka2 = parseFloat(document.getElementById("angka2").value);
  const jumlah = angka1 + angka2;

  let p = document.getElementById("hasil");

  p.innerText = jumlah;
})
