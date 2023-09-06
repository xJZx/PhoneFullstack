const navLinkEls = document.querySelectorAll('.menu li a');
const windowPathname = window.location.pathname;

navLinkEls.forEach(navLinkEl => {
    const navLinkPathname = new URL(navLinkEl.href).pathname;

    if(windowPathname === navLinkPathname){
        // navLinkEl.classList.remove("menu li a");
        navLinkEl.classList.add('active');
        // navLinkEl.classList.replace("menu li a", 'active');
    }
});

// document.getElementById()