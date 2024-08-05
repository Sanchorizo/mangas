package com.example.demo.controller;

import com.example.demo.model.Manga;
import com.example.demo.service.MangaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mangas")
public class MangaController {

    @Autowired
    MangaService mangaService;

    @GetMapping("/all")
    public Iterable<Manga> getAllMangas(){
        return mangaService.getAllMangas();
    }

    @DeleteMapping("/{id}")
    public void deleteManga(@PathVariable int id){
        System.out.println("on passe ici");
        mangaService.deleteManga(id);
    }

    @PostMapping("/post")
    public void postManga(@RequestBody Manga manga){
         mangaService.postManga(manga);
    }
}

