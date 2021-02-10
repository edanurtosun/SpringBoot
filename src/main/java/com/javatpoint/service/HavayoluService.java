package com.javatpoint.service;


import com.javatpoint.model.Havayolu;
import com.javatpoint.repository.HavayoluRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HavayoluService {

    @Autowired
    HavayoluRepository havayoluRepository;

    public List<Havayolu> getAllHavayolu()
    {
        List<Havayolu> havayollari = new ArrayList<Havayolu>();
        havayoluRepository.findAll().forEach(havayolu -> havayollari.add(havayolu));
        return havayollari;
    }

    public Havayolu getHavayoluById(int id)
    {
        return havayoluRepository.findById(id).get();
    }

    public void saveOrUpdate(Havayolu havayolu)
    {
        havayoluRepository.save(havayolu);
    }

    public void delete(int id)
    {
        havayoluRepository.deleteById(id);
    }
}
