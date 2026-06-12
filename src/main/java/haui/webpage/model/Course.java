package haui.webpage.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "courses")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String description;
    private String level;
    private String duration;
    private String rating;
    private String price;
    private String oldPrice;
    private String badge;
    private String image;
    private String status;

    // Quan hệ nhiều Course thuộc 1 Category
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    // Quan hệ nhiều Course thuộc 1 Instructor
    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;
}