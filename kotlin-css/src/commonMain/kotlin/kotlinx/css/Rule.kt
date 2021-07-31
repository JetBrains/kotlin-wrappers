package kotlinx.css

data class Rule(
    val selector: String,
    val passStaticClassesToParent: Boolean = false,
    val block: RuleSet,
)
