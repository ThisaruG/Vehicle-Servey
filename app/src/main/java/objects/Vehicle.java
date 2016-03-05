package objects;

import java.sql.Timestamp;

/**
 * Created by Thisaru on 3/5/2016.
 */
public class Vehicle {
    private VehicleTypes vehicleType;
    private Timestamp timeStamp;

    public Vehicle (VehicleTypes type, Timestamp timeStamp) {
        this.vehicleType = type;
        this.timeStamp = timeStamp;
    }

    public Vehicle() {

    }

    public VehicleTypes getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleTypes vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }
}
