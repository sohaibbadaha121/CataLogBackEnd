package com.catlogBackEnd.catlogBackEnd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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
