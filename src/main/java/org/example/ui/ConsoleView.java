package org.example.ui;

import org.example.model.Ereignis;
import org.example.model.SponsorGeschenk;
import org.example.model.Tribut;
import org.example.service.RegisterService;

import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    private RegisterService registerService;
    private Scanner scanner = new Scanner(System.in);

    public ConsoleView(RegisterService registerService){
        this.registerService = registerService;
    }
    public void start(){
        System.out.println("Welcome to the Tribute Game!");

        while(true){
            printMenu();
            String option = scanner.nextLine();
            switch (option){
                case "1":
                    uiListTribut();
                    break;
                case "2":
                    uiListEreignis(registerService.getAllEvents());
                    break;
                case "3":
                    uiListSponsorGeschenk(registerService.getAllGifts());
                    break;
                case "0":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }
    private void printMenu(){
        System.out.println("1. List Tributs");
        System.out.println("2. List Events");
        System.out.println("3. List Sponsor Gifts");
        System.out.println("0. Exit");
    }
    private void uiListTribut(){
        List<Tribut> tributs = registerService.getAllTributes();
        if(tributs.isEmpty()){
            System.out.println("No tributs found!");
        } else {
            tributs.forEach(System.out::println);
        }
    }

    private void uiListEreignis(List<Ereignis> allEvents){
        if (allEvents.isEmpty()){
            System.out.println("No events found!");
        } else {
            allEvents.forEach(System.out::println);
        }
    }
    private void uiListSponsorGeschenk(List<SponsorGeschenk> allGifts){
        if (allGifts.isEmpty()){
            System.out.println("No gifts found!");
        } else {
            allGifts.forEach(System.out::println);
        }
    }
}
