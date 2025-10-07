package FazePack;

public class Main {
    public static void main(String[] args) {
        Members m = new Members();
        Picker picker = new Picker();
        picker.readFile();
        m.picker();
    }
}