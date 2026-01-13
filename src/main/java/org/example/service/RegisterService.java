package org.example.service;

import org.example.model.Ereignis;
import org.example.model.SponsorGeschenk;
import org.example.model.Tribut;
import org.example.repository.EreignisRepository;
import org.example.repository.SponsorGeschenkRepository;
import org.example.repository.TributRepository;

import java.util.List;

public class RegisterService {
    private TributRepository tributRepository;
    private SponsorGeschenkRepository sponsorGeschenkRepository;
    private EreignisRepository ereignisRepository;

    public RegisterService(TributRepository tributRepository, SponsorGeschenkRepository sponsorGeschenkRepository, EreignisRepository ereignisRepository){
        this.tributRepository = tributRepository;
        this.sponsorGeschenkRepository = sponsorGeschenkRepository;
        this.ereignisRepository = ereignisRepository;
    }

    public void addTribut(String name, int distrikt, String status, int skillLevel){
        Tribut t = new Tribut(name, distrikt, status, skillLevel);
        tributRepository.add(t);
    }

    public List<Tribut> getAllTributes(){
        return tributRepository.findAll();
    }

    public List<Ereignis> getAllEvents(){
        return ereignisRepository.findAll();
    }

    public List<SponsorGeschenk> getAllGifts(){
        return sponsorGeschenkRepository.findAll();
    }


}
