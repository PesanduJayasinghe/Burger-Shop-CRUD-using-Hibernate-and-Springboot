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
    private String CustID;
    private String CustName;
    private String CustAddress;
    private String CustDOB;
    private double CustSalary;
    private String CustCity;
    private String CustCountry;
    private String CustZip;

}
