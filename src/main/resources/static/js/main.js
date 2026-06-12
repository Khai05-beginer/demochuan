console.log("EnglishPro UI loaded");

document.addEventListener("DOMContentLoaded", function () {
    // Animation xuất hiện nhẹ cho card
    const animatedItems = document.querySelectorAll(
        ".course-card, .category-card, .instructor-card, .feature-card, .info-card, .dashboard-card"
    );

    animatedItems.forEach((item, index) => {
        item.style.opacity = "0";
        item.style.transform = "translateY(24px)";
        item.style.transition = "all 0.55s ease";

        setTimeout(() => {
            item.style.opacity = "1";
            item.style.transform = "translateY(0)";
        }, index * 70);
    });

    // Đổi nền navbar khi scroll
    const navbar = document.querySelector(".navbar-custom");

    if (navbar) {
        window.addEventListener("scroll", function () {
            if (window.scrollY > 30) {
                navbar.classList.add("navbar-scrolled");
            } else {
                navbar.classList.remove("navbar-scrolled");
            }
        });
    }

    // Click vào nút thanh toán mô phỏng
    const checkoutButtons = document.querySelectorAll(".fake-checkout-btn");

    checkoutButtons.forEach((button) => {
        button.addEventListener("click", function () {
            alert("Thanh toán mô phỏng thành công! Sau này phần này sẽ nối với backend.");
        });
    });
});