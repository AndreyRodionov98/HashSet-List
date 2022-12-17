import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Product {
    private String name;
    private double cost;
    private double mass;
    private boolean bought;



    public Product(String name, double cost, double mass){
        this.name = name;
        this.cost = cost;
        this.mass = mass;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public boolean isBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }

    public void addProductFoodBuscket(Set<Product> foodBusket){
        if(!foodBusket.contains(this)){
            foodBusket.add(this);
          this.bought=true;
        }else {
            throw new UnsupportedOperationException("Продукт "+ this.name+" находится в карзине ");
        }


    }



    @Override
    public String toString() {
        return "" + name + '\'' +
                ", стоимостью - " + cost +
                ", массой -" + mass +
                 bought ;
    }
}