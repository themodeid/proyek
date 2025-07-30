const express = require("express");
const bodyParser = require("body-parser");
const conn = require("./db");

const app = express();
app.use(bodyParser.urlencoded({ extended: true }));

// Endpoint menambahkan tugas ke database
app.post("/tambah", (req, res) => {
  const task = req.body.task;
  const sql = "INSERT INTO todos (task) VALUES (?)";

  conn.query(sql, [task], (err, result) => {
    if (err) {
      console.error(err);
      return res.send("Gagal menambahkan tugas.");
    }
    res.send("Tugas berhasil ditambahkan!");
  });
});

// Jalankan server
app.listen(3000, () => {
  console.log("Server berjalan di http://localhost:3000");
});
