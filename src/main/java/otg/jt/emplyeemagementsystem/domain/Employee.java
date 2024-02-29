package otg.jt.emplyeemagementsystem.domain;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Positive
//    @Size(min = 100, max = 500)
    @Min(value = 100)
    private int employeeId;

    @NotNull(message = "Name is Null Error.")
    @NotEmpty(message = "Name is Empty Error.")
    @NotBlank(message = "Name is Blank Error.")
    private String employeeName;

    @Email(message = "Email should be in proper format.")
    private String employeeMail;

    @NotNull(message = "Phone Number Is null Error.")
    @Pattern(regexp = "^[6-9][0-9]{9}$", message = "Mobile Number should be in proper format")
    private String employeePhone;

    private List<String> hobbies;

    @PositiveOrZero(message = "Only insert Positive Number")
    @Digits(integer = 5, fraction = 2, message = "Employee salary is not in proper format")
    private double employeeSalary;

    private Address address;
}
