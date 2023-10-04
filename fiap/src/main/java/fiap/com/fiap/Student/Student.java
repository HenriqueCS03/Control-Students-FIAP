package fiap.com.fiap.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Student {
    
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    // @NotBlank
    // String title;
    @NotBlank
    String name;

    // @Size(min = 10)
    // String description;
    @Size(min = 10)
    String descriptionCourse;

    // @Min(1) @Max(100)
    // Integer score;
    @Min(1) @Max(100)
    Integer note;

    // @Min(0) @Max(100)
    // Integer status;
    @Min(0) @Max(100)
    Integer status;
}
