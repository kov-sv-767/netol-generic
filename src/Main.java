public class Main {
    public static void main(String[] args) {
        MagicBox <String> box1 = new MagicBox<>(4);
        box1.add("игра");
        box1.add("кролик");
        box1.add("шляпа");
        box1.add("зеркало");
        box1.pick();

        MagicBox <Integer> box2 = new MagicBox<>(5);
        box2.add(3);
        box2.add(1);
        box2.add(10);
        box2.add(23);
        box2.add(68);
        box2.pick();
    }
}
