public class HotDodStandRunner {
    public static void main(String[] args) {
        HotDogStand stand1 = new HotDogStand(1, 0);
        stand1.JustSold();
        stand1.JustSold();
        stand1.JustSold();
        System.out.println("Total HotDogs sold by stand one are " + stand1.getSold());
        HotDogStand stand2 = new HotDogStand(2,0);
        stand2.JustSold();
        stand2.JustSold();
        System.out.println("Total HotDogs sold by second stand are " +stand2.getSold());
        HotDogStand stand3 = new HotDogStand(3,0);
        stand3.JustSold();
        stand3.JustSold();
        stand3.JustSold();
        stand3.JustSold();
        System.out.println("Total HotDogs sold by third stand are " + stand3.getSold());

    }
}
