package Model.DTO;

import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ItemDto {

    @Id
    private String ItemCode;
    private String Description;
    private String PackSize;
    private String UnitPrice;
    private String QtyOnHand;
}
