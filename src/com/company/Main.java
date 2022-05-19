package com.company;

public class Main {
    public static void main(String[] args) {
        SolarSystem factorX= new SolarSystem();
        factorX.sun="1";
        factorX.moon="4";
        factorX.planet="2";
        factorX.star="10000";



        FeatureSun sun= new FeatureSun();
        sun.color="yellow";
        sun.heat="168763188893";
        sun.radius="457566786578";

        FeatureStars star= new FeatureStars();
        star.color="white";
        star. radius="546576887897";
        star.size="56789787";

        Planet2Feature planet= new Planet2Feature();
        planet.name="Pluto";
        planet.color="white";
        planet.size="small";

    }
}
