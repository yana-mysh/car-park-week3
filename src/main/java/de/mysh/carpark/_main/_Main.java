package de.mysh.carpark._main;
import de.mysh.carpark.entity.Cars;

public class _Main {
    public static void main(String[] args) {
        Cars car1 = new Cars("серого", "Ford");
        Cars car2 = new Cars("белого", "Tesla");
        Cars car3 = new Cars("белого", "Fiat");
        System.out.println("В автопарке есть" + " " + car1.make + " " + car1.colour + " " + "цвета.");
        car1.drivesAndBreaks();
        System.out.println("В автопарке есть " + car2.make + " " + car2.colour + " " + "цвета.");
        car2.drivesAndBreaks();
        System.out.println("В автопарке есть " + car3.make + " " + car3.colour + " " + "цвета.");
        car3.drivesAndBreaks();
    }
}







