package haui.webpage.service;

import haui.webpage.model.Course;
import java.util.List;

public interface CourseService {
    List<Course> getAll();
    List<Course> search(String keyword, String category);
    List<Course> getFeatured();
    Course getById(Long id);
    Course save(Course course);
    void delete(Long id);
}