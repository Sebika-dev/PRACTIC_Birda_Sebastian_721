package org.example;

import org.example.repository.EreignisRepository;
import org.example.repository.SponsorGeschenkRepository;
import org.example.repository.TributRepository;
import org.example.service.RegisterService;
import org.example.ui.ConsoleView;

import java.rmi.registry.Registry;

public class Main {
    public static void main(String[] args) {
        TributRepository tributRepository = new TributRepository();
        EreignisRepository ereignisRepository = new EreignisRepository();
        SponsorGeschenkRepository sponsorGeschenkRepository = new SponsorGeschenkRepository();

        RegisterService service = new RegisterService(tributRepository, sponsorGeschenkRepository, ereignisRepository);
        ConsoleView view = new ConsoleView(service);
        view.start();
    }

}
