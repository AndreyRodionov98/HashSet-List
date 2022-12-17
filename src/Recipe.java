import java.util.*;

public class Recipe {

    private Set<Product> productSet;
    private int summProduct;
    private String name;

    public Recipe(String name) {
        this.productSet = new HashSet<>();
        this.name = name;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    public int getSummProduct() {
        return summProduct;
    }

    public String getName() {
        return name;
    }

    public void addProductInRecipe(Product ...products) {
        this.productSet.addAll(Arrays.asList(products));
        for (Product product : this.productSet) {
            this.summProduct += product.getCost();
        }
    }

    public void addRecipeInSet(Set<Recipe> recipeSet) {
        if (!recipeSet.contains(this)) {
            recipeSet.add(this);
        } else {
            throw new UnsupportedOperationException("Рецепт " + this.name + " находится в множистве ");
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
