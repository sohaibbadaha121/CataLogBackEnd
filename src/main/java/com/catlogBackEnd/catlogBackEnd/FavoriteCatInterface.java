package com.catlogBackEnd.catlogBackEnd;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteCatInterface extends JpaRepository<FavoriteCats,Integer> {
}
