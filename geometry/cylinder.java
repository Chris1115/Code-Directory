class cylinder extends circle{
    void count3D()
    {
        double surface = 1;

        surface = ((2*(this.getValue("area"))) + (2*this.getValue("phi")*this.getValue("radius")*this.getValue("height")));

        setValue(surface, "surface");

        countVolume();
    }

    private void countVolume()
    {
        double volume;

        volume = (this.getValue("area")*this.getValue("height"));

        setValue(volume, "volume");
    }

    void status3D()
    {
        System.out.println("Radius\t: " + super.getValue("radius"));
        System.out.println("Diameter : " + super.getValue("diameter"));
        System.out.println("Area\t: " + super.getValue("area"));
        System.out.println("Perimeter : " + super.getValue("perimeter"));
        System.out.println("Surface : " + super.getValue("surface"));
        System.out.println("Volume : " + super.getValue("volume"));
    }
}
