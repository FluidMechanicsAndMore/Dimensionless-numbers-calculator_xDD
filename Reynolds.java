package numbers;

public class Reynolds {

    private double Re;
    private double density;
    private double velocity;
    private double dynamicViscosity;
    private double kinematicViscosity;
    private double linearDimension;

    public double calculateReynoldsWithDynamicViscosity(double density, double velocity, double dynamicViscosity, double linearDimension){
        double Re;
        Re = (density*velocity*linearDimension)/dynamicViscosity;

        return Re;
    }

    public double calculateReynoldsWithKinematicViscosity(double velocity, double kinematicViscosity, double linearDimension){
        double Re;
        Re = velocity*linearDimension/kinematicViscosity;

        return Re;
    }

}
