package karakum.query

class Method(
    override val source: String,
    private val external: Boolean = false,
) : Member() {
    private val typeParameters: List<String> by lazy {
        parseTypeParameters(
            source.substringBefore("(")
                .replace("Record<string, any>", "Any /* object */")
                .replace("QueryOptions<any, any, any, any>", "QueryOptions<*, *, *, *, *>")
                .replace("<any, any, any, any>", "<*, *, *, *>")
        )
    }

    private val parameters: List<String> by lazy {
        parseParameters(source)
    }

    private val returnType: String by lazy {
        kotlinType(source.substringAfter("): "), name)
            .fixDefaultOptions()
    }

    override fun toCode(): String {
        val rt = if (returnType != "Unit") {
            ": $returnType"
        } else ""

        // TEMP
        if (shouldSkipFunction())
            return ""

        val params = parameters.joinToString(",\n")
        val modifiers = (if (external) "external" else "") + modifiers
        return "$modifiers fun ${formatParameters(typeParameters)} ${safeName(name)}($params)$rt"
    }

    private fun shouldSkipFunction(): Boolean {
        if (!external) {
            return false
        }

        if (name == "useQuery" && returnType.startsWith("Any /* useQuery<")) {
            return true
        }

        if (name == "noop" && returnType == "Unit") {
            return true
        }

        return false
    }
}
