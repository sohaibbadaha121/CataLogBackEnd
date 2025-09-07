package com.catlogBackEnd.catlogBackEnd;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FavoriteCatService {

    private final FavoriteCatInterface  favoriteCatInterface;

    public FavoriteCatService(FavoriteCatInterface favoriteCatInterface) {
        this.favoriteCatInterface = favoriteCatInterface;
    }

    public FavoriteCats Savecatids(FavoriteCats favorite ) {

        return this.favoriteCatInterface.save(favorite);
    }

    public List<FavoriteCats> getallcats(){

        return favoriteCatInterface.findAll();
    }

}
