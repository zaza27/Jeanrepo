public class MountainBike implements BetterBicycle {
    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;  
    // the MountainBike subclass has
    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one constructor
    public MountainBike(int startHeight, int startCadence,
                        int startSpeed, int startGear) {
    	cadence = startCadence;
    	speed = startSpeed;
    	gear = startGear;
        seatHeight = startHeight;
    }   
      
    // the MountainBike subclass has
    // one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   
    @Override
    public void changeCadence(int newValue) {
         cadence = newValue;
    }
 
    @Override
    public void changeGear(int newValue) {
         gear = newValue;
    }
 
    @Override
    public void speedUp(int increment) {
         speed = speed + increment;   
    }
 
    @Override
    public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }
 
    @Override
    public void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}