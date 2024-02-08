public class Car extends Machine{
    protected String color;

    @Override
    public void start() {
        System.out.println("The car Started.");
    }

    @Override
    public void stop() {
        System.out.println("The car stopped.");
    }
    public void carname(){
        System.out.println("the car name is "+name);
    }
}
