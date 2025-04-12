package karakum.browser

private val HTML_FACTORIES = setOf(
    "Audio",
    "Image",
    "Option",
)

internal fun htmlFactories(
    source: String,
): Sequence<ConversionResult> =
    HTML_FACTORIES.asSequence()
        .map { name ->
            val (parametersSource, parentType) = source.substringAfter("\ndeclare var $name: {\n    new(")
                .substringBefore(";\n")
                .split("): ")

            val parameters = parametersSource
                .replace("?: number", ": Int = definedExternally")
                .replace("?: string", ": String = definedExternally")
                .replace("?: boolean", ": Boolean = definedExternally")
                .replace(", ", ",\n")

            ConversionResult(
                name = name,
                body = "external class $name(\n$parameters\n) : $parentType",
                pkg = "web.html",
            )
        }
