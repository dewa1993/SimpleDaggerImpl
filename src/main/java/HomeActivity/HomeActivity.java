package HomeActivity;

public class HomeActivity {

    public  static  void main   (String [] args){

        Hall myHall = new Hall();
        Bedroom myBedRoom = new Bedroom();

        House myHouse = new House(myHall,myBedRoom);
        myHouse.doWork();
        myHouse.eat();
        myHouse.watch();

    }

}
