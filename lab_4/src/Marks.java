public class Marks {
    private int mark1;
    private int mark2;
    private int mark3;

    public Marks(){
        mark1=1;
        mark2=2;
        mark3=3;
    }

    public Marks(int m1, int m2 , int m3){
        mark1=m1;
        mark2=m2;
        mark3=m3;
    }

    public void setMark1(int m1){
        mark1=m1;
    }
    public int getMark1(){
        return mark1;
    }
    public void setMark2(int m2){
        mark2=m2;
    }
    public int getMark2(){
        return mark2;
    }
    public void setMark3(int m3){
        mark3=m3;
    }
    public int getMark3(){
        return mark3;
    }

    public int sum(){
        return mark1+mark2+mark3;
    }

}
