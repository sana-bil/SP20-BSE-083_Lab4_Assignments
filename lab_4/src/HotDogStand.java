public class HotDogStand {
    private int ID;
    private int sold;

    public HotDogStand (int num , int sales){
        ID=num;
        sold=sales;
    }
    public void setID(int num){
        ID=num;
    }
    public int getID(){
        return ID;
    }
    public void setSold(int sales){
        sold=sales;
    }
    public int getSold(){
        return sold;
    }
    public int JustSold(){
        sold=sold+1;
        return sold;
    }

}
