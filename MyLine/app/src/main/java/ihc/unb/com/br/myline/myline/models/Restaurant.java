package ihc.unb.com.br.myline.myline.models;

import java.io.Serializable;

public class Restaurant implements Serializable {

    private String name;
    private String description;
    private int type; //type 1: food, type 2: drink

    public Restaurant(String name, String description, int type) {
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getType() {
        return type;
    }
}
