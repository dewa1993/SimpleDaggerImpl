package HomeActivityDagger;


public class HomeActivityDagger {

    public  static  void main   (String [] args){

        HomeComponent component = DaggerHomeComponent.create();
        House myHouse = component.getHouse();
        myHouse.doWork();
        myHouse.eat();
        myHouse.watch();

    }

}
