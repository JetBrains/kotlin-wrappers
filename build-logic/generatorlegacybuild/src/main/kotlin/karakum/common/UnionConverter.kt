package karakum.common

// Interface for TS unions conversion helpers
internal interface UnionConverter {
    fun unionBody(
        name: String,
        values: List<String>,
    ): String {
        val constants = values.map(::unionConstant)

        return unionBodyByConstants(name, constants)
    }

    fun unionBodyByConstants(name: String, constants: List<UnionConstant>): String

    fun sealedUnionBody(name: String, values: List<String>): String

    fun sealedUnionBody(name: String, parentType: String, values: List<String>): String

    fun objectUnionBody(name: String, constants: List<UnionConstant>): String
}

// Helpers converting TS unions to sealed external interfaces, which include fields annotated with @JsValue.
// Generated interfaces are not supported in the WASM target.
internal object JsUnionConverter : UnionConverter {

    override fun unionBodyByConstants(
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

    override fun sealedUnionBody(
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

    override fun sealedUnionBody(
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

    override fun objectUnionBody(
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
}

// Helpers converting TS unions to sealed external interfaces with companion extensions
// Generated interfaces support in the WASM target.
internal object CommonUnionConverter : UnionConverter {

    override fun unionBodyByConstants(
        name: String,
        constants: List<UnionConstant>,
    ): String {
        val interfaceName = name.substringBefore('<')
        val hasGenerics = interfaceName != name

        val extensions = constants
            .joinToString("\n\n") {
                require(!hasGenerics || it.type != null) {
                    "You should specify types for all generic unions. Wrong constant: $it."
                }

                """
                inline val $interfaceName.Companion.${it.name}: ${it.type ?: name}
                    get() = unsafeCast("${it.name}")
                """.trimIndent()
            }

        return """
               sealed external interface $name {
                  companion object
               }

               $extensions
               """.trimIndent()
    }

    override fun sealedUnionBody(
        name: String,
        values: List<String>,
    ): String {
        val constants = values.map(::unionConstant)

        val extensions = constants.joinToString("\n\n") {
            """
        inline val $name.Companion.${it.name}: $name
            get() = unsafeCast("${it.name}")
        """.trimIndent()
        }

        return """
                sealed external interface $name {
            companion object
        }

        $extensions
    """.trimIndent()
    }

    override fun sealedUnionBody(
        name: String,
        parentType: String,
        values: List<String>,
    ): String {
        val constants = values.map(::unionConstant)

        val extensions = constants.joinToString("\n") {
            """
            inline val $name.Companion.${it.name}: $parentType.${it.name.replaceFirstChar(Char::uppercase)}
                get() = unsafeCast("${it.name}")
        """.trimIndent()
        }

        return """
        sealed external interface $name : $parentType {
            companion object
        }

        $extensions
        """.trimIndent()
    }

    override fun objectUnionBody(
        name: String,
        constants: List<UnionConstant>,
    ): String {
        val extensions = constants.joinToString("\n\n") {
            """
            inline val $name.Companion.${it.name}: $name.${it.name}
                get() = unsafeCast("${it.name}")
        """.trimIndent()
        }

        val constantTypes = constants.joinToString("\n") {
            "sealed interface ${it.name} : $name"
        }

        return """
           sealed external interface $name {
              $constantTypes

              companion object
           }

           $extensions
    """.trimIndent()
    }
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
