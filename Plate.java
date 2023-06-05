public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int appetite) {
        if (food >= appetite) this.food = food - appetite;
        else this.food = 0;
    }

    public void info() { System.out.println("Остаток еды на тарелке: " + food); }

    void addFood(int foodFood) {
        this.food += foodFood;
    }
}
