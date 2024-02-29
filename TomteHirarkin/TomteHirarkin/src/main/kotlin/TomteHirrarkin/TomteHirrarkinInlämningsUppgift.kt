package TomteHirrarkin

class Tomteland {

    val tomten = "tomten"
    val glader = "glader"
    val butter = "butter"
    val troger = "tröger"
    val trotter = "trötter"
    val blyger = "blyger"
    val radjuret = "rådjuret"
    val nyckelpigan = "nyckelpigan"
    val haren = "haren"
    val raven = "räven"
    val skumtomten = "skumtomten"
    val dammrattan = "dammråttan"
    val grasuggan = "gråsuggan"
    val myran = "myran"
    val bladlusen = "bladlusen"

    val tomteHirrarkin = mapOf(
        "tomten" to listOf("glader", "butter"),
        "glader" to listOf("tröger", "trötter", "blyger"),
        "butter" to listOf("rådjuret", "nyckelpigan", "haren", "räven"),
        "trötter" to listOf("skumtomten"),
        "skumtomten" to listOf("dammråttan"),
        "räven" to listOf("gråsuggan", "myran"),
        "myran" to listOf("bladlusen")
    )


    fun getUnderlings(currentName: String, res: Map<String, List<String>>): List<String> {
        val underlings = mutableListOf<String>()

        fun findUnderlings(name: String) {
            res[name]?.forEach { underling ->
                underlings.add(underling)
                findUnderlings(underling)
            }
        }
        if (res.containsKey(currentName)) {
            findUnderlings(currentName)
        }
        return underlings
    }

    fun main() {
        while (true) {
            println("Vem vill du kolla underlydnader på?")
            val svar = readln().trim().lowercase()
            val resultat = getUnderlings(svar, tomteHirrarkin)
            if (resultat.isEmpty()) {
                println("Personen $svar har inga underhuggare")
            } else if (svar == "") {
                println("Avslutar programmet.")
                break
            } else
                println("Här kommer $svar's underlydnader: \n$resultat")
        }
    }
}

fun main() {
    val tomteland = Tomteland()
    tomteland.main()
}
