package com.ElastiSearch.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ElastiSearch.model.Song;
import com.ElastiSearch.service.SongService;

@RestController	
@RequestMapping("/MusicAppMeta")
public class Controller {

    
    @Autowired
    private SongService songRepo;

    @GetMapping("/fromGit")
    public String fromGit()
    {
    return "helloGitHubGUI";
    }
    
    @PostMapping(path ="/save")
    public ResponseEntity<String> createOrUpdateDocument(@RequestParam("title") List<String> title,
    		@RequestParam("artist") List<String> artist,@RequestParam("description") List<String> description,
    		@RequestParam("year") Integer year)throws IOException {
    	  Song nSong=new Song(title,artist,description,year);
         songRepo.save(nSong);
        return new ResponseEntity<>("OKK", HttpStatus.OK);
    }
    @GetMapping("/all")
    public Iterable<Song> findAllEmployees() {
        return songRepo.findAll();
    }
 

    @GetMapping(path = "/search")
    public List<Song> searchArtistSong(@RequestParam String artist) {
        return this.songRepo.findByTitle(artist);
    }
}
