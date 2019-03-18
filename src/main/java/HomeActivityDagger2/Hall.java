package HomeActivityDagger2;

import javax.inject.Inject;

public class Hall implements Room {

    @Inject
    Hall(){

    }

    @Override
    public void doWork() {
        System.out.println( getClass().getSimpleName() + " working");
    }

    @Override
    public void eatFood() {
        System.out.println( getClass().getSimpleName() + " eating");

    }

    @Override
    public void watchMovies() {
        System.out.println( getClass().getSimpleName() + " watching movies");

    }
}
