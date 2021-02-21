class sphere extends circle{
    void count3D()
    {
        double surface = 1;

        surface = (4*(super.getValue("phi")*(super.power(super.getValue("radius"), 2))));

        setValue(surface, "surface");

        countVolume();
    }

    private void countVolume()
    {
        double volume;

        volume = ((super.getValue("surface")*4*(super.getValue("radius")))/(3));

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
