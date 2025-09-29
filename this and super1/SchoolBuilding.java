class SchoolBuilding {
    public String name;
    public Cement cement;
    public Sand sand;
    public Bricks bricks;

    public SchoolBuilding(String name, Cement cement, Sand sand, Bricks bricks) {
        this.name = name;
        this.cement = cement;
        this.sand = sand;
        this.bricks = bricks;
    }

    public void displaySchoolBuildingInfo() {
        System.out.println("Building: " + name);
        System.out.println("Cement bags: " + cement.numberOfBags);
        System.out.println("Sand tons: " + sand.numberOfTons);
        System.out.println("Bricks: " + bricks.numberOfBricks);
      
    }
}
