package com.pb.dn280186msa.hw6;


public class Veterinarian {

        public void treatAnimal (Animal... animals){
            for (Animal animal: animals)
            {
            System.out.println("На прием пришел " + animal.name + ", он ест " + animal.food + ", и обитает в " + animal.location);
            }
        }



    }



