package org.example.repository;

import org.example.model.Ereignis;

public class EreignisRepository extends FileRepository<Ereignis> {
    public EreignisRepository(){ super("event.json", Ereignis.class); }
}
