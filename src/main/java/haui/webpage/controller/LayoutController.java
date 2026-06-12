package haui.webpage.controller;


import haui.webpage.repository.CategoryRepository;
import haui.webpage.repository.InstructorRepository;
import haui.webpage.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class LayoutController {

    private final CourseService courseService;
    private final CategoryRepository categoryRepository;
    private final InstructorRepository instructorRepository;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("pageTitle", "EnglishPro - Trang chủ");
        model.addAttribute("featuredCourses", courseService.getFeatured());
        model.addAttribute("categories", categoryRepository.findAll());
        model.addAttribute("instructors", instructorRepository.findAll());
        return "pages/home";
    }

    @GetMapping("/courses")
    public String courses(@RequestParam(required = false) String keyword,
                          @RequestParam(required = false) String category,
                          Model model) {
        model.addAttribute("pageTitle", "Danh sách khóa học");
        model.addAttribute("courses", courseService.search(keyword, category));
        model.addAttribute("categories", categoryRepository.findAll());
        model.addAttribute("keyword", keyword);
        model.addAttribute("selectedCategory", category);
        return "pages/courses";
    }

    @GetMapping("/courses/detail")
    public String courseDetail(Model model) {
        model.addAttribute("pageTitle", "Chi tiết khóa học");
        model.addAttribute("course", courseService.getFeatured().get(0));
        model.addAttribute("instructor", instructorRepository.findAll().get(0));
        return "pages/course-detail";
    }

    @GetMapping("/categories")
    public String categories(Model model) {
        model.addAttribute("pageTitle", "Loại khóa học");
        model.addAttribute("categories", categoryRepository.findAll());
        return "pages/category-list";
    }

    @GetMapping("/instructors")
    public String instructors(Model model) {
        model.addAttribute("pageTitle", "Giảng viên");
        model.addAttribute("instructors", instructorRepository.findAll());
        return "pages/instructors";
    }

    @GetMapping("/enroll")
    public String enroll(Model model) {
        model.addAttribute("pageTitle", "Đăng ký khóa học");
        return "pages/enroll";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("pageTitle", "Dashboard");
        model.addAttribute("courses", courseService.getAll());
        return "pages/dashboard";
    }

    @GetMapping("/admin/courses/create")
    public String createCourse(Model model) {
        model.addAttribute("pageTitle", "Thêm khóa học");
        model.addAttribute("categories", categoryRepository.findAll());
        model.addAttribute("instructors", instructorRepository.findAll());
        return "pages/create-course";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("pageTitle", "Đăng nhập");
        return "pages/login";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("pageTitle", "Đăng ký");
        return "pages/register";
    }
    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("pageTitle", "Trang test");
        return "pages/test";
    }
}