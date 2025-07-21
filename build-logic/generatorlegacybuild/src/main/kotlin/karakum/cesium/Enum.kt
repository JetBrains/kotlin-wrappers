package karakum.cesium

internal class Enum(
    override val source: Definition,
) : Declaration(), IEnum {
    override val name: String =
        source.defaultName

    override fun toCode(): String {
        val body = source.body
            .substringAfter("\n    ")
            .removeSuffix("}")
            .replace(",\n     *", "__COMMA__\n     *")
            .split(Regex(""",\n\s+"""))
            .asSequence()
            .map { it.replace("__COMMA__\n", ",\n") }
            .flatMap { parseTopDefinition(it) }
            .map { EnumConstant(it, this) }
            .joinToString("\n\n") {
                it.toCode()
            }

        return DEFAULT_PACKAGE +
                source.doc(DocLink(this)) +
                "\n" +
                "sealed /* enum */\n" +
                "external interface $name {\n" +
                "companion object {\n\n" +
                "$body\n" +
                "}\n" +
                "}"
    }

    companion object {
        const val PREFIX = "export enum "
        const val CONST_PREFIX = "export const enum "
    }
}

// TODO: describe value in comments
internal class EnumConstant(
    override val source: Definition,
    private val parent: Enum,
) : Declaration() {
    override val name: String =
        source.body.split(" = ")[0]

    override fun toCode(): String {
        val doc = source.doc()
        val body = "val $name: ${parent.name}"

        return if (doc.isNotBlank()) {
            "$doc\n$body"
        } else {
            body
        }
    }
}
