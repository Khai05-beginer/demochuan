package haui.webpage.repository;

import haui.webpage.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    // Tìm theo tên hoặc mô tả (không phân biệt hoa thường)
    List<Course> findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCase(
            String title, String description);

    // Tìm theo category name
    List<Course> findByCategoryNameIgnoreCase(String categoryName);

    // Tìm theo keyword VÀ category
    List<Course> findByTitleContainingIgnoreCaseAndCategoryNameIgnoreCase(
            String title, String categoryName);
}