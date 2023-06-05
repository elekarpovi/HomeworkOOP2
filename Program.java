public class Program {
    public static void main(String[] args) {
        Cat cat = new Cat("Пушок", 15);
        System.out.println("Кот " + cat.getName() + " с аппетитом " + cat.getAppetite());
        Plate plate = new Plate(10);
        plate.info();

        int temp = cat.getAppetite();
        cat.eat(plate.getFood());
        plate.setFood(temp);
        plate.info();

// Задание 4. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
        plate.addFood(50);
        plate.info();

/* Задание 3. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и 
потом вывести информацию о сытости котов в консоль.
 */
        Cat[] cats = {
                new Cat("Барсик", 5),
                new Cat("Васька", 7),
                new Cat("Том",10),
                new Cat("Гарфилд",7),
                new Cat("Леопольд", 8)
        };

        for (Cat item: cats) {
            if (plate.getFood() >= item.getAppetite() && !item.getFullness()){
                temp = item.getAppetite();
                item.eat(plate.getFood());
                plate.setFood(temp);
                plate.info();
            }
        }
    }
}