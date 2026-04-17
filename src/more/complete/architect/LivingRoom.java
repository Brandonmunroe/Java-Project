package more.complete.architect;

public class LivingRoom {

    private double dimensions;       // square footage or length*width
    private double ceilingHeight;
    private int floorNumber;
    private String wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private int tvStand;
    private int numberOfCouches;
    private int numberOfPlants;

    // Private constructor so only Builder can create it
    private LivingRoom(Builder builder) {
        this.dimensions = builder.dimensions;
        this.ceilingHeight = builder.ceilingHeight;
        this.floorNumber = builder.floorNumber;
        this.wallColor = builder.wallColor;
        this.numberOfWindows = builder.numberOfWindows;
        this.numberOfDoors = builder.numberOfDoors;
        this.tvStand = builder.tvStand;
        this.numberOfCouches = builder.numberOfCouches;
        this.numberOfPlants = builder.numberOfPlants;
    }

    @Override
    public String toString() {
        return "LivingRoom {" +
                "dimensions=" + dimensions +
                ", ceilingHeight=" + ceilingHeight +
                ", floorNumber=" + floorNumber +
                ", wallColor='" + wallColor + '\'' +
                ", numberOfWindows=" + numberOfWindows +
                ", numberOfDoors=" + numberOfDoors +
                ", tvStand=" + tvStand +
                ", numberOfCouches=" + numberOfCouches +
                ", numberOfPlants=" + numberOfPlants +
                '}';
    }

    // ---------------- BUILDER CLASS ----------------
    public static class Builder {
        private double dimensions;
        private double ceilingHeight;
        private int floorNumber;
        private String wallColor;
        private int numberOfWindows;
        private int numberOfDoors;
        private int tvStand;
        private int numberOfCouches;
        private int numberOfPlants;

        public Builder setDimensions(double dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setCeilingHeight(double ceilingHeight) {
            this.ceilingHeight = ceilingHeight;
            return this;
        }

        public Builder setFloorNumber(int floorNumber) {
            this.floorNumber = floorNumber;
            return this;
        }

        public Builder setWallColor(String wallColor) {
            this.wallColor = wallColor;
            return this;
        }

        public Builder setNumberOfWindows(int numberOfWindows) {
            this.numberOfWindows = numberOfWindows;
            return this;
        }

        public Builder setNumberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }

        public Builder setTvStand(int tvStand) {
            this.tvStand = tvStand;
            return this;
        }

        public Builder setNumberOfCouches(int numberOfCouches) {
            this.numberOfCouches = numberOfCouches;
            return this;
        }

        public Builder setNumberOfPlants(int numberOfPlants) {
            this.numberOfPlants = numberOfPlants;
            return this;
        }

        public LivingRoom build() {
            return new LivingRoom(this);
        }
    }
}
