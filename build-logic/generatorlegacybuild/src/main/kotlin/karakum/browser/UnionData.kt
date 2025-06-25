package karakum.browser

data class UnionData(
    val name: String,
    val values: List<String>,
    val pkg: String,
    val extendedTypes: List<String> = emptyList(),
    val isExtended: Boolean = false,
)
