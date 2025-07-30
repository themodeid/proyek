const mysql = require("mysql2");

const conn = mysql.createConnection({
  host: "localhost",
  user: "root",       // sesuaikan dengan user MySQL kamu
  password: "",       // sesuaikan
  database: "todo_db" // nama database
});

conn.connect((err) => {
  if (err) throw err;
  console.log("Terhubung ke database MySQL");
});

module.exports = conn;
