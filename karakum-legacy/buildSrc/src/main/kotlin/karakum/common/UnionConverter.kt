package karakum.common

internal fun unionBody(
    name: String,
    values: List<String>,
): String {
    val constants = values.map(::unionConstant)

    return unionBodyByConstants(name, constants)
}

internal fun unionBodyByConstants(
    name: String,
    constants: List<UnionConstant>,
): String {
    val constantNames = constants
        .joinToString("\n") {
            sequenceOf(
                it.jsValueAnnotation,
                "val ${it.name}: ${it.type ?: name}",
            ).joinToString("\n")
        }

    return """
                sealed external interface $name {
            companion object {
            $constantNames
            }
        }
    """.trimIndent()
}

internal fun sealedUnionBody(
    name: String,
    values: List<String>,
): String {
    val constants = values.map(::unionConstant)

    val bodyMembers = constants.joinToString("\n") {
        """
        ${it.jsValueAnnotation}    
        val ${it.name}: $name
        """.trimIndent()
    }

    return """
                sealed external interface $name {
            companion object {
                $bodyMembers
            }
        }
    """.trimIndent()
}

internal fun sealedUnionBody(
    name: String,
    parentType: String,
    values: List<String>,
): String {
    val constants = values.map(::unionConstant)

    val bodyMembers = constants.joinToString("\n") {
        """
        ${it.jsValueAnnotation}    
        val ${it.name}: $parentType.${it.name.replaceFirstChar(Char::uppercase)}
        """.trimIndent()
    }

    return """
                sealed external interface $name: $parentType {
            companion object {
                $bodyMembers
            }
        }
    """.trimIndent()
}

internal fun objectUnionBody(
    name: String,
    constants: List<UnionConstant>,
): String {
    val constantNames = constants.joinToString("\n") {
        sequenceOf(
            it.jsValueAnnotation,
            "val ${it.name} : ${name}.${it.name}",
        ).joinToString("\n")
    }

    val constantTypes = constants.joinToString("\n") {
        "sealed interface ${it.name} : $name"
    }

    return """
                sealed external interface $name {
            companion object {
                $constantNames
            }
            
            $constantTypes
        }
    """.trimIndent()
}

internal data class UnionConstant(
    val name: String,
    val value: String,
    val type: String? = null,
    private val originalValue: Boolean = false,
    val comment: String? = null,
) {
    val jsValueAnnotation: String
        get() {
            val annotation = if (originalValue) {
                if (value.startsWith("\"")) {
                    "@JsValue(\"${value.removeSurrounding("\"")}\")"
                } else "@JsRawValue(\"$value\")"
            } else {
                val escapedValue = when (value) {
                    "\"" -> """\""""
                    else -> value
                }

                """@JsValue("$escapedValue")"""
            }

            return listOfNotNull(comment, annotation)
                .joinToString("\n")
        }
}

internal fun unionConstant(
    value: String,
): UnionConstant =
    UnionConstant(
        name = unionName(value),
        value = value,
    )

internal fun unionName(
    value: String,
): String {
    var name = value
        .removePrefix("@")
        .removeSurrounding("[", "]")
        .removePrefix("::")
        .removePrefix(":")
        .removeSuffix("()")
        .replace(":", "-")

    name = when (name) {
        "" -> "none"
        "1" -> "D"

        "2x" -> "x2"
        "4x" -> "x4"

        "2-digit" -> "twoDigit"

        else -> {
            (if (name.substring(0, 1) in "0123456789") "_" else "") +
                    name.kebabToCamel()
        }
    }

    return when (name) {
        "false",
        "true",

        "class",
        "for",
        "is",
        "object",
        "super",
            -> "`${name}`"

        else -> name
    }
}
