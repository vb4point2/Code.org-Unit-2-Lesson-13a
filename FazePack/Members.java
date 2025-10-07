package FazePack;

import java.util.Scanner;

public class Members {
    private String name;
    private int age;
    private int peakSubCount;
    Scanner scan = new Scanner(System.in);
    public Members() {
        name = "unknown";
        age = 0;
        peakSubCount = 0;
    }

    public Members(String name, int age, int peakSubCount) {
        this.name = name;
        this.age = age;
        this.peakSubCount = peakSubCount;
    }

    public String JTW() {
        name = "Jason Tha Ngyuen";
        age = 22;
        peakSubCount = 100000;
        return name + " " + age + " ~" + peakSubCount;
    }

    public String ADA() {
        name = "Faze Adapt";
        age = 1300;
        peakSubCount = 50000;
        return name + " " + age + " ~" + peakSubCount;
    }

    public void picker() {
        String choice = scan.nextLine().toLowerCase();
        if(choice.equals("jason")) {
            System.out.println(JTW());
        }
        if(choice.equals("ada")) {
            System.out.println(ADA());
        }
    }

    public String toString() {
        return name + " " + age + " ~" + peakSubCount;
    }
}
