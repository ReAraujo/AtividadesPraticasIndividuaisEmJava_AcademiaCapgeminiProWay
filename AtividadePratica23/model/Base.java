package model;

import java.util.UUID;

public class Base {
    private UUID id;

    public Base(int id){
        this.id = UUID.randomUUID();
    }

    public String getId() {
        return id.toString();
    }
}
