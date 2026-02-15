package example.Model.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
public class Customer {

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
