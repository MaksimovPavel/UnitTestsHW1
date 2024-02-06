package seminars.first.hw;

public class Product {
    private String name; // Название
    private int cost; // Название
    public Product(String name, Integer cost){
        this.name = name;
        this.cost = cost;
    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return name;
    }

    public void setTitle(String title) {
        this.name = title;
    }

    @Override
    public String toString(){
        return "Наименование: " + name + ", Цена: " + cost;
    }
}