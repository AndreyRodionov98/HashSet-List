import java.util.*;

public class Recipe {

    private Map<Product, Integer> productSet;
    private int summProduct;
    private String name;

    public Recipe(String name) {
        this.productSet = new HashMap<>();
        this.name = name;
    }

    public Map<Product,Integer> getProductSet() {
        return productSet;
    }

    public int getSummProduct() {
        return summProduct;
    }

    public String getName() {
        return name;
    }

    public void addProductInRecipe(Product product) {
        //productSet.addAll(Arrays.asList(products));
        //for (Product product : productSet) {
          //  summProduct += product.getCost();
        if (product==null){
            return;
        }
        if (this.productSet.containsKey(product)){
            Integer productCount=this.productSet.get(product);
            this.productSet.put(product,++productCount);
        }
        else {
            this.productSet.put(product,1);
        }
    }
    public  double getTotalCostAllProducts(){
        double summ=0.0;
        for (Map.Entry<Product,Integer>product: productSet.entrySet()){
            summ+=product.getKey().getCost()*product.getValue();
        }
        return summ;
    }

    public void addRecipeInSet(Set<Recipe> recipeSet) {
        if (!recipeSet.contains(this)) {
            recipeSet.add(this);
        } else {
            throw new UnsupportedOperationException("Рецепт " + this.name + " находится в множистве ");
        }
    }
    public void checkProduct(String name){
        boolean bought=false;
        for (Map.Entry<Product,Integer>product:productSet.entrySet()){
            if (product.getKey().getName().equals(name)){
                System.out.println(name+" приобретен");
                bought=true;
                break;
            }
        }
        if (!bought){
            System.out.println(name+" Не приобретен");
        }
    }

    @Override
    public String toString() {
        return "название еды- "+name+""+summProduct+productSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return summProduct == recipe.summProduct && Objects.equals(productSet, recipe.productSet) && Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productSet, summProduct, name);
    }


}
