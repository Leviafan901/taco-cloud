package sia.tacocloud.tacos

import java.util.*
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size
import kotlin.collections.ArrayList

data class Taco(@field:NotNull
                var id: Long,
                @field:NotNull
                @field:Size(min = 5, message = "Name must be at least 5 characters long")
                var name: String = "Taco's Name",
                @field:Size(min = 1, message = "You must choose at least 1 ingredient")
                var ingredients: List<Ingredient> = ArrayList(),
                var createdAt: Date)
