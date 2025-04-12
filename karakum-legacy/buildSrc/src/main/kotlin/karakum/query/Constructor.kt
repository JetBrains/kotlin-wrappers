package karakum.query

class Constructor(
    override val source: String,
) : Member() {
    private val parameters: List<String> by lazy {
        parseParameters(source.removeSuffix(")"))
    }

    override fun toCode(): String {
        if (parameters.isEmpty()) return "()"

        return parameters.joinToString(",\n", "(\n", ")")
    }
}
