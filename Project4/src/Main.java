public class Main {
    public static void main(String[] args) {
        Personel p1 = new Personel();
      p1.setName("Nihat");
      p1.setSoyIsim("Cetin");

        System.out.println(p1.getName());
        System.out.println(p1.getSoyIsim());

        Nihat p2 = new Nihat();
        p2.setName("Muhammed");
        p2.setSoyIsim("Cubukcu");

        System.out.println(p2.getName());
        System.out.println(p2.getSoyIsim());
}
}
