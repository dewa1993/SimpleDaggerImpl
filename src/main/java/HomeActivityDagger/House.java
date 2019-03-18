package HomeActivityDagger;

import javax.inject.Inject;

public class House {


    private Hall hall;
    private Bedroom bedroom;

    // constructor injection
    @Inject
    House(Hall mHall, Bedroom mBedroom){
        this.bedroom = mBedroom;
        this.hall = mHall;
    }

    void watch(){
        hall.watchMovies();
        bedroom.watchMovies();
    }

    void eat(){
        hall.eatFood();
        bedroom.eatFood();
    }

    void doWork(){
        hall.doWork();
        bedroom.doWork();
    }

}
