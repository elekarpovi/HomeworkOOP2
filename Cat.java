public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

/*Задание 2.Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось 
покушать (хватило еды), сытость = true. Считаем, что если коту мало еды в тарелке, то он её просто не 
трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
 */
        this.fullness = appetite <= 0;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean getFullness() {
        return fullness;
    }

    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }

    public void eat(int food) {

/* Задание 1. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды 
(например, в миске 10 еды, а кот пытается покушать 15-20).
 */
        if (food > appetite) {
            System.out.println(getName() + " съел еду из тарелки");
            this.appetite = 0;
            this.fullness = true;
        } else {
            System.out.println("Еды не достаточно для кота " + getName());
            setAppetite(appetite - food);
            System.out.println("Не достаточно в размере: " + getAppetite());
        }
    }
}
