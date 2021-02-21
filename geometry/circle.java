class circle extends shape{

    void count()
    {
        if (this.getValue("radius") == 0)
        {
            double total = 1;

            setValue((this.getValue("radius")/2), "diameter");

            total = (this.getValue("phi")*(this.power(this.getValue("radius"), 2)));
    
            setValue(total, "area");
        }
        else
        {
            double total = 1;

            setValue((this.getValue("radius")*2), "diameter");

            total = (this.getValue("phi")*(this.power(this.getValue("radius"), 2)));
    
            setValue(total, "area");
        }
        countPerimeter();
    }

    private void countPerimeter()
    {
        double total = 1;

        total = (2*(this.getValue("phi"))*(this.getValue("radius")));

        setValue(total, "perimeter");
    }

    void status()
    {
        System.out.println("Radius\t: " + this.getValue("radius"));
        System.out.println("Diameter : " + this.getValue("diameter"));
        System.out.println("Area\t: " + this.getValue("area"));
        System.out.println("Perimeter : " + this.getValue("perimeter"));
    }
}
