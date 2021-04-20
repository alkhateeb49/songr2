package com.example.songr;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongrController {
    @Autowired
    SongRepository songRepository;

    @Autowired
    AlbumRepository albumRepository;


    @PostMapping("/addSong")
    public RedirectView addSong(int Albumid,String title,int length,int trackNumber){
        Album album=albumRepository.findAlbumById(Albumid);
        Song song=new Song(title,length, trackNumber,album );
        songRepository.save(song);
        return  new RedirectView("/");
    }

    @GetMapping("/allsongs")
    public String allsongs(Model m)
    {
        m.addAttribute("Songs" ,songRepository.findAll());
        return "allSongs.html";
    }


}
