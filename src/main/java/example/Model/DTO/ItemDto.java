package example.Model.DTO;

import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ItemDto {

    @Id
    private String itemCode;
    private String description;
    private String packSize;
    private Double unitPrice;
    private int qtyOnHand;
}
