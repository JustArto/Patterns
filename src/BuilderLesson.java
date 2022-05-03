public class BuilderLesson {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar.Builder("Auid").setColor("Black").setMaxSpeed(500).builde();
        System.out.println(sportCar.toString());
    }
}
class SportCar{
    private String name;
    private String color;
    private int maxSpeed;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private SportCar(Builder builder){
    this.name=builder.name;
    this.color=builder.color;
    this.maxSpeed=builder.maxSpeed;
    }
    @Override
    public String toString() {
        return "SportCar{" + "name='" + name + '\'' + ", color='" + color + '\'' + ", maxSpeed=" + maxSpeed + '}';
    }


    static class Builder {
        private String name;
        private String color;
        private int maxSpeed;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }
        public SportCar builde(){
            return new SportCar(this);
        }
    }

}
