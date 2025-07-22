// Ambil elemen navbar-nav
const navbarnav = document.querySelector(".navbar-nav");

// Ambil elemen hamburger-menu
const hamburgerMenu = document.querySelector("#hamburger-menu");

// Ketika hamburger menu di klik
hamburgerMenu.addEventListener("click", () => {
  navbarnav.classList.toggle("active");
});
