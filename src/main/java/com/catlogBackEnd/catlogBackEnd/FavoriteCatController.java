package com.catlogBackEnd.catlogBackEnd;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favorites")
@CrossOrigin(origins = "*")
public class FavoriteCatController {
 private final FavoriteCatService favoriteCatService;

    public FavoriteCatController(FavoriteCatService favoriteCatService) {
        this.favoriteCatService = favoriteCatService;
    }


    @GetMapping
    public List<FavoriteCats> getfavoritecats(){
      return   favoriteCatService.getallcats();
    }

    @PostMapping
    public FavoriteCats savefavoritecats(@RequestBody FavoriteCats  favoriteCats){
      return favoriteCatService.Savecatids(favoriteCats);
    }
}
