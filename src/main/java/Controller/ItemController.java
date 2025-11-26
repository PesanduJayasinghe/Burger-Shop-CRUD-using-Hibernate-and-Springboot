package Controller;

import Model.DTO.ItemDto;
import Model.Entity.Item;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @GetMapping
    public String Sample(){
        return "Item Working";
    }

    @PostMapping("/add")
    public void addItem(){

    }

    @PutMapping("/update")
    public void updateItem(){

    }

    @DeleteMapping("/delete/{id}")
    public void deleteItem(@PathVariable String id){

    }

    @GetMapping("/all")
    public List<ItemDto> getAllItems(){

    }

    @GetMapping("/search/{id}")
    public ItemDto searchItem(@PathVariable String id){

    }

}
