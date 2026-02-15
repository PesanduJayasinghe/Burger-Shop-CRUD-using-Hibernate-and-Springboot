package example.Model.DTO;

import jakarta.persistence.Id;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDto {

    @Id
    private String custID;
    private String custName;
    private String custAddress;
    private String custDOB;
    private double custSalary;
    private String custCity;
    private String custCountry;
    private String custZip;

}
