package HomeActivityDagger2;
import dagger.Component;

@Component(modules = CookModule.class)
public interface HomeComponent2 {

    House getHouse();

    Food getFood();

    Water getWater();
}
