package HomeActivityDagger2;


public class HomeActivityDagger2 {

    public  static  void main   (String [] args){


        Food food = new Food();
        Water water = new Water();

        HomeComponent2 component = DaggerHomeComponent2.builder().cookModule(new CookModule(food,water)).build();
        House myHouse = component.getHouse();
        myHouse.doWork();
        myHouse.eat();
        myHouse.watch();

        component.getFood();

        component.getWater();

    }

}
