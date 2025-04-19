package karakum.popper

import karakum.common.ConversionResult

private val EXCLUDED_NAMES = setOf(
    "StrictModifiers",
)

internal fun convertType(
    declaration: String,
    source: String,
): ConversionResult? {
    val name = declaration.substringBefore("<")
    if (name in EXCLUDED_NAMES)
        return null

    val content = when (source) {
        "S | ((prev: S) => S)",
            -> "(prev: S) -> S // $source"

        "(arg0: State) => void",
            -> "(State) -> Unit"

        else -> source
    }

    val body = when (name) {
        "Padding" -> """
            import ${Package.MODIFIERS.id}.$PADDING_TYPE
            
            // $source
            @JsPlainObject
            external interface $name:
                $PADDING_TYPE 
        """.trimIndent()

        else -> "typealias $declaration = $content"
    }

    return ConversionResult(name, body)
}
