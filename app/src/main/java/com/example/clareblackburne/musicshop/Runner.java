package com.example.clareblackburne.musicshop;

import com.example.clareblackburne.musicshop.Accessory.InstrumentCase;
import com.example.clareblackburne.musicshop.Accessory.Microphone;
import com.example.clareblackburne.musicshop.Accessory.MusicStand;
import com.example.clareblackburne.musicshop.Instrument.Clarinet;
import com.example.clareblackburne.musicshop.Instrument.DrumKit;
import com.example.clareblackburne.musicshop.Instrument.Family;
import com.example.clareblackburne.musicshop.Instrument.Guitar;
import com.example.clareblackburne.musicshop.Instrument.Piano;
import com.example.clareblackburne.musicshop.Instrument.Tuba;
import com.example.clareblackburne.musicshop.Instrument.Violin;
import com.example.clareblackburne.musicshop.Instrument.Xylophone;

import java.util.Scanner;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public class Runner {



    public static void main(String[] args) {
        Store store;
        Customer customer;
        Tuba tuba;
        Microphone microphone;
        Guitar guitar;
        Piano piano;
        Clarinet clarinet;
        Violin violin;
        Xylophone xylophone;
        DrumKit drumkit;
        MusicStand musicStand;
        InstrumentCase instrumentCase;


        tuba = new Tuba("tuba", Family.BRASS, 70, 90, Material.COPPER);
        microphone = new Microphone("microphone", 50, 60, "dynamic");
        guitar = new Guitar("guitar", Family.STRINGED, 80, 100, Material.ALDER, "bass");
        piano = new Piano("piano", Family.KEYBOARD, 120, 140, Material.MAPLE, "grand");
        clarinet = new Clarinet("clarinet", Family.WOODWIND, 80, 90, Material.AFRICAN_BOXWOOD);
        violin = new Violin("violin", Family.WOODWIND, 70, 100, Material.BIRCH, 4);
        xylophone = new Xylophone("xylophone", Family.PERCUSSION, 40, 80, Material.BRASS, 100);
        drumkit = new DrumKit("drums", Family.PERCUSSION, 50, 90, Material.COPPER, 20);
        musicStand = new MusicStand("music stand", 50, 100, Material.PLASTIC);
        instrumentCase = new InstrumentCase("instrument case", 20, 50, Material.LEATHER);

        store = new Store("Mike's Music Shop", "Mike", 3000);
        store.addToStock(tuba);
        store.addToStock(microphone);
        store.addToStock(piano);
        store.addToStock(guitar);
        store.addToStock(clarinet);
        store.addToStock(violin);
        store.addToStock(xylophone);
        store.addToStock(drumkit);
        store.addToStock(musicStand);
        store.addToStock(instrumentCase);

        System.out.println("Welcome to " + store.getName());
        System.out.println("My name's " + store.getOwner() + ". What's your name?");
        Scanner scan = new Scanner(System.in);
        String myName = scan.nextLine();
        String username = myName;
        System.out.println("How much do you have to spend today?");
        Double myCash = scan.nextDouble();
        Double cash = myCash;
        customer = new Customer(username, cash);
        System.out.println("Well, " + customer.getName() + ", here's what we have in stock at the moment: " + store.getStockContents());
        System.out.println("So that means I currently have " + store.howManyInstruments() + " instruments you can choose from, plus a choice of " + store.howManyAccessories() + " accessories");
        System.out.println("Would you like to try the tuba? It's made from " + tuba.getMaterial().toString() + " and it costs £" + tuba.getSellPrice());
        Scanner scan2 = new Scanner(System.in);
        String answer = scan2.nextLine();
        if(answer.contains("y")){
        System.out.println(customer.tryOut(tuba));
        System.out.println("Sounds good, doesn't it!");}
        else {System.out.println("No worries");}
        System.out.println("Would you like to buy the tuba? Just say yes if you'd like to!");
        String answer2 = scan2.nextLine();
        if(answer2.contains("y")){
            store.sellToCustomer(customer, tuba);
            System.out.println("Thanks " + customer.getName() + ", you now have £" + customer.getCash() + " and I've just made £" + tuba.calculateMarkup() + " in profit!");}
        else{
        System.out.println("Nevermind.");}
        System.out.println("Business is good at the moment. If I sell everything else I have in stock I'll have made £" + store.calculateTotalPossibleProfit());
        System.out.println("Have a nice day " + customer.getName() + " and come back to " + store.getName() + " soon! I've still got " + store.getStockSize() + " things left to sell");
        System.out.println("Bye!");
    }
}
