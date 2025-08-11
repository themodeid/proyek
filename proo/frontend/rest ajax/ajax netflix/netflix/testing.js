import React, { useState } from "react";

const apiKey = "a625ad88";

function App() {
  const [query, setQuery] = useState("");
  const [movies, setMovies] = useState([]);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState("");

  const handleSearch = () => {
    if (query.trim() === "") return;

    setLoading(true);
    setError("");
    setMovies([]);

    fetch(
      `https://www.omdbapi.com/?apikey=${apiKey}&s=${encodeURIComponent(query)}`
    )
      .then((res) => res.json())
      .then((data) => {
        setLoading(false);
        if (data.Response === "False") {
          setError(`Film tidak ditemukan untuk kata kunci "${query}"`);
        } else {
          setMovies(data.Search);
        }
      })
      .catch((err) => {
        setLoading(false);
        setError("Gagal memuat data: " + err.message);
      });
  };

  return (
    <div style={{ padding: "20px" }}>
      <h2>Cari Film</h2>
      <input
        type="text"
        placeholder="Masukkan judul film"
        value={query}
        onChange={(e) => setQuery(e.target.value)}
      />
      <button onClick={handleSearch}>Cari</button>

      {loading && <p>Mencari...</p>}
      {error && <p style={{ color: "red" }}>{error}</p>}

      <div style={{ display: "flex", flexWrap: "wrap", gap: "16px" }}>
        {movies.map((movie) => (
          <div key={movie.imdbID} style={{ border: "1px solid #ccc", padding: "10px", width: "200px" }}>
            <img
              src={
                movie.Poster !== "N/A"
                  ? movie.Poster
                  : "https://via.placeholder.com/300x450?text=No+Image"
              }
              alt={movie.Title}
              style={{ width: "100%" }}
            />
            <h4>{movie.Title}</h4>
            <p>{movie.Year}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
