package org.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<videoJuego> videoJuegoList = new ArrayList<videoJuego>();
        videoJuego video1 = new videoJuego(123,"Mario karts", "Nintendo 64", 4, "plataforma");
        videoJuego video2 = new videoJuego(133,"Kirby", "Nintendo 64", 4, "plataforma");
        videoJuego video3 = new videoJuego(323,"League of Legends", "PC", 1, "estrategia");
        videoJuego video4 = new videoJuego(457,"Dota", "PC", 1, "Estrategia");
        videoJuego video5 = new videoJuego(415,"Donkey Kong", "Nintendo 64", 4, "plataforma");

        videoJuegoList.add(video1);
        videoJuegoList.add(video2);
        videoJuegoList.add(video3);
        videoJuegoList.add(video4);
        videoJuegoList.add(video5);

        for (videoJuego video : videoJuegoList){
            System.out.println("Titulo: " + video.getTitulo() + "Consola: "+ video.getConsola() +" " +  "players" + video.getPlayers());

        }

        video1.setTitulo("Mario Karts 64");
        video1.setPlayers(2);
        video5.setTitulo("Super Donkey Kong");
        video5.setPlayers(6);

        for (videoJuego video : videoJuegoList){
            if (video.getConsola().equals("Nintendo 64")){
                System.out.println(video.toString());
            }
        }



    }
}
