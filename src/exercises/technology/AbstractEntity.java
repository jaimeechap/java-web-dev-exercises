package exercises.technology;

import java.util.concurrent.ThreadLocalRandom;

public abstract class AbstractEntity {
    private int id;

    public AbstractEntity(){
        this.id= ThreadLocalRandom.current().nextInt(0, 100);

    }

    public int getId() {
        return this.id;
    }
}
