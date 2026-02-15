package example.Service;

import example.Model.DTO.ItemDto;
import example.Model.Entity.Item;
import example.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public void addItem(ItemDto itemDto) {

        itemRepository.save(
                new Item(
                        itemDto.getItemCode(),
                        itemDto.getDescription(),
                        itemDto.getPackSize(),
                        itemDto.getUnitPrice(),
                        itemDto.getQtyOnHand()
                )
        );

    }

    public void updateItem(ItemDto itemDto) {
        itemRepository.save(
                new Item(
                        itemDto.getItemCode(),
                        itemDto.getDescription(),
                        itemDto.getPackSize(),
                        itemDto.getUnitPrice(),
                        itemDto.getQtyOnHand()
                )
        );
    }


    public void deleteItem(String id) {

        itemRepository.deleteById(id);

    }

    public List<ItemDto> getAllItems() {

        List<Item> items=itemRepository.findAll();
        ArrayList<ItemDto> itemDtoList=new ArrayList<>();

        for (Item item: items) {
            itemDtoList.add(
                new ItemDto(
                    item.getItemCode(),
                    item.getDescription(),
                    item.getPackSize(),
                    item.getUnitPrice(),
                    item.getQtyOnHand()
            ));
        }
        return itemDtoList;
    }

    public ItemDto searchItem(String id) {

        Item item=itemRepository.getById(id);

        return new ItemDto(
                item.getItemCode(),
                item.getDescription(),
                item.getPackSize(),
                item.getUnitPrice(),
                item.getQtyOnHand()
        );

    }
}
