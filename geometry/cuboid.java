class cuboid extends rect{
    void count3D()
    {
        double surface = 1;

        surface = ((4*(this.getValue("edgeA")*this.getValue("edgeB"))+(2*(this.getValue("edgeB")*this.getValue("height")))));

        setValue(surface, "surface");

        countVolume();
    }

    private void countVolume()
    {
        double volume;

        volume = (this.getValue("edgeA")*this.getValue("edgeB")*this.getValue("height"));

        setValue(volume, "volume");
    }

    void status3D()
    {
        System.out.println("Radius\t: " + super.getValue("edgeA"));
        System.out.println("Diameter : " + super.getValue("edgeB"));
        System.out.println("Area\t: " + super.getValue("area"));
        System.out.println("Perimeter : " + super.getValue("perimeter"));
        System.out.println("Surface : " + super.getValue("surface"));
        System.out.println("Volume : " + super.getValue("volume"));
    }
}
