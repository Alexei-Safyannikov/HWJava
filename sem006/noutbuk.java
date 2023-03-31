package sem006;

public class Notebook {

    private String brand;
    private String model;
    private double screenSize;
    private int ramSize;
    private String color;
    private double price;

    public Notebook(String brand, String model, double screenSize, int ramSize, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.ramSize = ramSize;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getRamSize() {
        return ramSize;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + screenSize + " inch, " + ramSize + " GB RAM, " + color + ", $" + price;
    }




//Пример создания списка ноутбуков:

ArrayList<Notebook> notebooks = new ArrayList<Notebook>();
notebooks.add(new Notebook("Dell", "Inspiron 15", 15.6, 8, "black", 599.99));
notebooks.add(new Notebook("HP", "Pavilion x360", 14.0, 4, "silver", 479.99));
notebooks.add(new Notebook("Apple", "MacBook Air", 13.3, 8, "gold", 999.99));
notebooks.add(new Notebook("Lenovo", "ThinkPad X1 Carbon", 14.0, 16, "black", 1399.99));
notebooks.add(new Notebook("Acer", "Aspire 5", 15.6, 12, "blue", 649.99));


//Пример фильтрации списка ноутбуков по размеру оперативной памяти:

Scanner scanner = new Scanner(System.in);
System.out.print("Enter minimum RAM size: ");
int minRamSize = scanner.nextInt();

for (Notebook notebook : notebooks) {
    if (notebook.getRamSize() >= minRamSize) {
        System.out.println(notebook);
    }
}


//Пример фильтрации списка ноутбуков по цвету:

Scanner scanner = new Scanner(System.in);
System.out.print("Enter color: ");
String color = scanner.nextLine();

for (Notebook notebook : notebooks) {
    if (notebook.getColor().equalsIgnoreCase(color)) {
        System.out.println(notebook);
    }
}
}
