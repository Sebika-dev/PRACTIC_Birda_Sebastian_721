package org.example.repository;

import org.example.model.Tribut;

public class TributRepository extends FileRepository<Tribut>{
    public TributRepository() { super("tributes.json", Tribut.class);}
}
