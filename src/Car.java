public class Car {
    private void startElectricity(){
        System.out.println("Electricity On");
    }
    private void startCommand(){
        System.out.println("Command On");
    }
    private void startFuelSystem(){
        System.out.println("Fuel System Nn");
    }

    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }
}
