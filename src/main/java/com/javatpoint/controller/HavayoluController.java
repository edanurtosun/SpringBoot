package com.javatpoint.controller;


import com.javatpoint.model.Havayolu;
import com.javatpoint.service.HavayoluService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HavayoluController {

    @Autowired
    HavayoluService havayoluService;

    @GetMapping("/havayolu")
    private List<Havayolu> getAllHavayolu(){
        return havayoluService.getAllHavayolu();
    }

    @GetMapping("/havayolu/{id}")
    private Havayolu getHavayolu(@PathVariable("id") int id)
    {
        return havayoluService.getHavayoluById(id);
    }

    @DeleteMapping("/havayolu/{id}")
    private void deleteHavayolu(@PathVariable("id") int id)
    {
        havayoluService.delete(id);
    }

    @PostMapping("/havayolu")
    private int saveHavayolu(@RequestBody Havayolu havayolu)
    {
        havayoluService.saveOrUpdate(havayolu);
        return havayolu.getId();
    }
}