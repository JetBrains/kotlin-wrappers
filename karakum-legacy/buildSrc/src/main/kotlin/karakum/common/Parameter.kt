package karakum.common

data class Parameter(
    val name: String,
    val type: String,
    val vararg: Boolean,
    val optional: Boolean,
) {
    override fun toString(): String =
        listOfNotNull(
            "vararg".takeIf { vararg },
            "$name: $type",
            "= definedExternally".takeIf { optional },
        ).joinToString(" ")
}
