package com.example.demo.service;

import com.example.demo.model.Manga;
import com.example.demo.repository.MangaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MangaService {

   @Autowired
   MangaRepository mangaRepository;


    public Iterable<Manga> getAllMangas(){
        return mangaRepository.findAll();
    }

    public void deleteManga(int id){
        mangaRepository.deleteById(id);
    }

    public void postManga(Manga manga){
        mangaRepository.save(manga);
    }
}
