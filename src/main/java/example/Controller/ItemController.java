package example.Controller;

import example.Model.DTO.ItemDto;
import example.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping
    public String sample(){
        return "Item Working";
    }

    @PostMapping("/add")
    public void addItem(@RequestBody ItemDto itemDto){
        itemService.addItem(itemDto);
    }

    @PutMapping("/update")
    public void updateItem(@RequestBody ItemDto itemDto){
        itemService.updateItem(itemDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteItem(@PathVariable String id){
        itemService.deleteItem(id);
    }

    @GetMapping("/all")
    public List<ItemDto> getAllItems(){
        return itemService.getAllItems();
    }

    @GetMapping("/search/{id}")
    public ItemDto searchItem(@PathVariable String id){
        return itemService.searchItem(id);
    }

}
