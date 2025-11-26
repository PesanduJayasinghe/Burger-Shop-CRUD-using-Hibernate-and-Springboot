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
    @Column(length = 6)
    private String CustID;
    private String CustName;
    private String CustAddress;
    private String CustDOB;
    private double CustSalary;
    private String CustCity;
    private String CustCountry;
    private String CustZip;


}
