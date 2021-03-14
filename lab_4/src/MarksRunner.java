public class MarksRunner {
    public static void main(String[] args) {
        Marks m = new Marks();
        System.out.println(m.sum());
        m.setMark1(4);
        m.getMark1();
        System.out.println(m.sum());
        Marks mm = new Marks(5,6,7);
        System.out.println(mm.sum());
        mm.setMark2(9);
        mm.getMark2();
        System.out.println(mm.sum());

    }
}
