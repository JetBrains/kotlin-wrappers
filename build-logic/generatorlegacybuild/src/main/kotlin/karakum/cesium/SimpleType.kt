package karakum.cesium

internal class SimpleType(
    override val source: Definition,
    override val static: Boolean = false,
) : Member() {
    override val name: String =
        source.defaultName

    override val docName: String =
        ".$name"

    val isTypeAlias: Boolean by lazy {
        isTypeAlias(source.body)
    }

    val parameterNames: List<String> by lazy {
        source.body
            .substringAfter("\n")
            .substringBeforeLast("\n")
            .trimIndent()
            .splitToSequence("\n")
            .filter { !it.startsWith(" ") }
            .filter { !it.startsWith("}") }
            .map { it.substringBefore(": ") }
            .map { it.removeSuffix("?") }
            .toList()
    }

    override fun toCode(): String {
        val modifier = if (hasParent) "" else "external "
        val link = if (hasParent) {
            DocLink(parent, this)
        } else {
            DocLink(this)
        }

        return source.doc(link)
            .let { if (it.isNotEmpty()) "$it\n" else "" } +
                modifier + typeDeclaration(source.body, false)
    }

    override fun equals(other: Any?): Boolean =
        other is SimpleType && source == other.source

    override fun hashCode(): Int =
        source.hashCode()
}
