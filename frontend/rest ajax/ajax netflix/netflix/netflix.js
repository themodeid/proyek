const container = document.getElementById("movie-container");
const input = document.getElementById("search-input");
const btn = document.getElementById("btn");
const apiKey = "a625ad88";

btn.addEventListener("click", function () {
  const query = input.value.trim();
  if (query === "") return;

  container.innerHTML = "<p>Mencari...</p>";

  fetch(
    `http://www.omdbapi.com/?apikey=${apiKey}&s=${encodeURIComponent(query)}`
  )
    .then((response) => response.json())
    .then((data) => {
      container.innerHTML = "";

      if (data.Response === "False") {
        container.innerHTML = `<p>Film tidak ditemukan untuk kata kunci "${query}"</p>`;
        return;
      }

      data.Search.forEach((movie) => {
        console.log(movie);
        const movieCard = document.createElement("div");
        movieCard.className = "movie";
        movieCard.innerHTML = `
          <img src="${
            movie.Poster !== "N/A"
              ? movie.Poster
              : "https://via.placeholder.com/300x450?text=No+Image"
          }" alt="${movie.Title}" />
          <h3>${movie.Title}</h3>
          <p>${movie.Year}</p>
        `;
        container.appendChild(movieCard);
      });
    })
    .catch((error) => {
      container.innerHTML = `<p>Gagal memuat data: ${error.message}</p>`;
    });
});
