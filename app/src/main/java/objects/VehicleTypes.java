package objects;

/**
 * Created by Thisaru on 3/5/2016.
 */
public enum VehicleTypes {
    CAR ("Car", 1),
    VAN ("Van", 2),
    LORRY("Lorry", 3),
    BUS("Bus", 4),
    BIKE("Bike", 5);

    private final String type;
    private final int id;

    VehicleTypes (String type, int id) {
        this.type = type;
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public int getId() {
        return this.id;
    }
}
