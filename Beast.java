public class Beast {
    private String name;
    private int weight;
    private int speed;

    public Beast(String name, int weight, int speed) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void attack(String name){
        System.out.println("Attacking" + name);
    }

    @Override
    public String toString() {
        return "Beast{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}
