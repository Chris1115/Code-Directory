class rect extends shape{
    void countRect()
    {
        double area = 1;

        if (this.getValue("edgeB") == 0)
        {
            this.setValue(this.getValue("edgeA"), "edgeB");
        }

        area = ((this.getValue("edgeA"))*(this.getValue("edgeB")));

        this.setValue(area, "area");

        countPerRect();
    }

    private void countPerRect()
    {
        double peri = 1;

        peri = (2*((this.getValue("edgeA"))+this.getValue("edgeB")));

        this.setValue(peri, "perimeter");
    }

    void status()
    {
        System.out.println("Width\t: " + this.getValue("edgeA"));
        System.out.println("Long\t : " + this.getValue("edgeB"));
        System.out.println("Area\t: " + this.getValue("area"));
        System.out.println("Perimeter : " + this.getValue("perimeter"));
    }
}
