package HomeActivityDagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class CookModule {

    private Food food;
    private Water water;

    public CookModule(Food food , Water water){
        this.food = food;
        this.water = water;
    }

    @Provides
    Food getFood(){
        return  food;
    }

    @Provides
    Water getWater(){
        return  water;
    }


}
