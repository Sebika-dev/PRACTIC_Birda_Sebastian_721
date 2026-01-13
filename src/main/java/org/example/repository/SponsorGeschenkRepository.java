package org.example.repository;

import org.example.model.SponsorGeschenk;

public class SponsorGeschenkRepository extends FileRepository<SponsorGeschenk>{
    public SponsorGeschenkRepository() { super("sponsor.json", SponsorGeschenk.class);}
}
