package example.Model.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class Item {

    @Id
    private String ItemCode;
    private String Description;
    private String PackSize;
    private Double UnitPrice;
    private int QtyOnHand;

}
