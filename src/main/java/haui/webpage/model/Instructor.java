package haui.webpage.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "instructors")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String role;
    private String description;
    private String totalCourses;
    private String rating;
    private String avatar;
}