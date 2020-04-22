package sia.tacocloud.tacos

import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class Taco(@NotNull
                @Size(min=5, message="Name must be at least 5 characters long")
                var name: String = "Taco's Name",
                @Size(min=1, message="You must choose at least 1 ingredient")
                var ingredients: List<Ingredient> = ArrayList<Ingredient>())
