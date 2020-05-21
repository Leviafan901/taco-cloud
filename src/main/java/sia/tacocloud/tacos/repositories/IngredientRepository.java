package sia.tacocloud.tacos.repositories;


import sia.tacocloud.tacos.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}
