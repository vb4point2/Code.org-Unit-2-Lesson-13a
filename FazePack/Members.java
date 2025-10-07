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
        name = "FaZe Adapt";
        age = 1300;
        peakSubCount = 50000;
        return name + " " + age + " ~" + peakSubCount;
    }
    
    public String Ron() {
        name = "StableRonaldo";
        age = 23;
        peakSubCount = 70000;
        return name + " " + age + " ~" + peakSubCount;
    }

    public String thugs() {
        name = "FaZe Lacy";
        age = 21;
        peakSubCount = 67000;
        return name + " " + age + " ~" + peakSubCount;
    }

    public String kaysan() {
        name = "FaZe Kaysan";
        age = 10515152379485;
        peakSubCount = 20000;
        return name + " " + age + " ~" + peakSubCount;
    }

    public String silk() {
        name = "FaZe Silky";
        age = 27;
        peakSubCount = 45000;
        return name + " " + age + " ~" + peakSubCount;
    }

    public String qt() {
        name = "QTCinderella";
        age = 35;
        peakSubCount = 15000;
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
        if(choice.equals("ron")) {
            System.out.println(Ron());
        }
        if(choice.equals("lacy")) {
            System.out.println(thugs());
        }
        if(choice.equals("kaysan")) {
            System.out.println(kaysan());
        }
        if(choice.equals("silky")) {
            System.out.println(silk());
        }
        if(choice.equals("qt")) {
            System.out.println(qt());
        } else {
            System.out.println("Why didn't you pick something correctly");
        }
    }

    public String toString() {
        return name + " " + age + " ~" + peakSubCount;
    }
}
