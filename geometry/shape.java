abstract class shape {
    private double edgeA;
    private double edgeB;
    private double radius;
    private double height;
    private double phi = 3.14;
    private double diameter;
    private double perimeter;
    private double surface;
    private double area;
    private double volume;


    double getValue(String option)
    {
        switch(option)
        {
            case "edgeA":
            return this.edgeA;

            case "edgeB":
            return this.edgeB;

            case "radius":
            return this.radius;

            case "height":
            return this.height;

            case "diameter":
            return this.diameter;

            case "perimeter":
            return this.perimeter;

            case "area":
            return this.area;

            case "volume":
            return this.volume;

            case "phi":
            return this.phi;
            
            case "surface":
            return this.surface;

            default:
            return 0;
        }
    }

    void setValue(double value, String option)
    {
        switch(option)
        {
            case "edgeA":
            this.edgeA = value;
            break;

            case "edgeB":
            this.edgeB = value;
            break;

            case "radius":
            this.radius = value;
            break;

            case "height":
            this.height = value;
            break;

            case "diameter":
            this.diameter = value;
            break;

            case "perimeter":
            this.perimeter = value;
            break;

            case "area":
            this.area = value;
            break;

            case "surface":
            this.surface = value;
            break;

            case "volume":
            this.volume = value;
            break;
        }
    }

    double power(double value, double power)
    {
        double total = 1;
        double stPow = 0;

        while (stPow < power)
        {
            total *= value;
            stPow++;
        }

        return total;
    }
}
