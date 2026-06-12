package haui.webpage.service.impl;

import haui.webpage.model.Course;
import haui.webpage.repository.CourseRepository;
import haui.webpage.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceimpI implements CourseService {

    private final CourseRepository courseRepository;

    @Override
    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    @Override
    public List<Course> search(String keyword, String category) {
        boolean hasKeyword = keyword != null && !keyword.isBlank();
        boolean hasCategory = category != null && !category.isBlank();

        if (hasKeyword && hasCategory) {
            return courseRepository
                .findByTitleContainingIgnoreCaseAndCategoryNameIgnoreCase(keyword, category);
        } else if (hasKeyword) {
            return courseRepository
                .findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCase(keyword, keyword);
        } else if (hasCategory) {
            return courseRepository.findByCategoryNameIgnoreCase(category);
        }
        return courseRepository.findAll();
    }

    @Override
    public List<Course> getFeatured() {
        List<Course> all = courseRepository.findAll();
        return all.size() >= 3 ? all.subList(0, 3) : all;
    }

    @Override
    public Course getById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void delete(Long id) {
        courseRepository.deleteById(id);
    }
}