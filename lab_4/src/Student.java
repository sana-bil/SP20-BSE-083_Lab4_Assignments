public class Student {
    private String Name;
    private int[] Result_Array= new int[5];

    public Student(String s , int [] array){
        Name=s;
        Result_Array=array;
    }
    public void setName(String s){
        Name=s;
    }
    public String getName(){
        return Name;
    }
    public void setResult_Array(int [] array){
        Result_Array=array;
    }
    public int [] getResult_Array(){
        return Result_Array;
    }
    public int Average(){
        int avg = (Result_Array[0]+Result_Array[1]+Result_Array[2]+Result_Array[3]+Result_Array[4])/5;
        return avg;
    }

}
