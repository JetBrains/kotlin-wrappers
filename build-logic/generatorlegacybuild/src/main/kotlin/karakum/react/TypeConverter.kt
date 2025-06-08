package karakum.react

import karakum.common.removeQuoteSurrounding

interface TypeConverter {
    fun convert(
        type: String,
        name: String,
    ): String
}

internal class SimpleTypeConverter(
    private val parentName: String,
) : TypeConverter {
    var unions: List<ConversionResult> = emptyList()
        private set

    override fun convert(
        type: String,
        name: String,
    ): String {
        if (type.endsWith(" | undefined"))
            return convert(type.removeSuffix(" | undefined"), name)

        if (type.startsWith("'") || type.startsWith("\"") || type.startsWith("boolean | '"))
            return unionType(type, name)

        return kotlinType(type, name)
    }

    private fun unionType(
        type: String,
        propertyName: String,
    ): String {
        val name = unionName(propertyName)

        when {
            propertyName == "autoCapitalize"
                -> return propertyName.replaceFirstChar(Char::uppercase)

            propertyName == "crossOrigin" && type == """"anonymous" | "use-credentials" | """""
                -> return propertyName.replaceFirstChar(Char::uppercase)

            propertyName == "enterKeyHint"
                -> return propertyName.replaceFirstChar(Char::uppercase)

            propertyName == "loading"
                -> return propertyName.replaceFirstChar(Char::uppercase)

            propertyName == "decoding"
                -> return "ImageDecoding".also {
                if (type.contains(" undefined")) {
                    it.plus("?")
                }
            }
        }

        val sourceType = if (name == "Capture") {
            type.replace("boolean", """"false" | "true"""")
        } else type

        val values = sourceType
            // WA for AlignmentBaseline
            .replace("\" |\"", "\" | \"")
            .splitToSequence(" | ")
            .filter { !it.startsWith("undefined; ") }
            .filter { it != "boolean" }
            .map { it.removeQuoteSurrounding() }
            .toList()

        val pkg = if ("SVG" in parentName) Package.SVG else Package.HTML

        unions = unions + convertUnion(name, values).copy(pkg = pkg)

        return name
    }

    private fun unionName(
        propertyName: String,
    ): String =
        when {
            propertyName == "capture"
                -> propertyName.replaceFirstChar(Char::uppercase)

            propertyName.startsWith("aria-")
                -> propertyName.ariaPropertyName()
                .replaceFirstChar(Char::uppercase)

            parentName.endsWith("HTMLAttributes") -> {
                val typeName = when (propertyName) {
                    "valign" -> "VAlign"
                    else -> propertyName.replaceFirstChar(Char::uppercase)
                }

                parentName.removeSuffix("HTMLAttributes") + typeName
            }

            else -> propertyName.replaceFirstChar(Char::uppercase)
        }
}
