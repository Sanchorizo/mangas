package com.example.demo.repository;

import com.example.demo.model.Manga;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MangaRepository  extends CrudRepository<Manga, Integer> {
}
