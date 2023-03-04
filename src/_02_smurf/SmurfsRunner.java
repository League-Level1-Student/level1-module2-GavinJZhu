package _02_smurf;

import _01_sea_creature.SeaCreature;

public class SmurfsRunner {
    public static void main(String[] args) {
       // SeaCreature spongebob = new SeaCreature("Spongebob");
        Smurf handySmurf = new Smurf("Handy Smurf");
        System.out.println(handySmurf.getName());
        handySmurf.eat();
        Smurf papaSmurf = new Smurf("Papa Smurf");
        Smurf smurfette = new Smurf("Smurfette");
        System.out.println(papaSmurf.getName());
        System.out.println(papaSmurf.getHatColor());
        System.out.println(papaSmurf.isGirlOrBoy());
        System.out.println(smurfette.getName());
        System.out.println(smurfette.getHatColor());
        System.out.println(smurfette.isGirlOrBoy());
    }
}
