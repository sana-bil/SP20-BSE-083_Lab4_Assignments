public class StudentRunner {
    public static void main(String[] args) {

        Student s1 = new Student("Sanabil" , new int[] {5,6,6,7});
        System.out.println(s1.Average());
        Student s2 = new Student("nimra", new int[] {2,3,4,5});
        System.out.println(s2.Average());
        if (s2.Average()>s1.Average()){
            System.out.println("Second student has greater average");
        }
        else System.out.println("First student has greater average");
        Student s3 = new Student(s1.getName(), s2.getResult_Array());
        s3.Average();




    }
}
