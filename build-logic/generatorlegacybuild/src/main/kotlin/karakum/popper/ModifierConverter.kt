package karakum.popper

import karakum.common.ConversionResult

private val EXTENDED_PADDING = """
 | ((arg0: {
        popper: Rect;
        reference: Rect;
        placement: Placement;
    }) => Padding)
""".removeSurrounding("\n")

internal const val PADDING_TYPE = "PaddingType"
internal const val OFFSET_TYPE = "OffsetType"
internal const val TETHER_OFFSET_TYPE = "TetherOffsetType"

internal fun convertModifier(
    source: String,
): ConversionResult {
    val (nameSource, optionsType) = source
        .substringAfter(" = Modifier<")
        .substringBefore(">")
        .split(", ")

    val id = nameSource.removeSurrounding("\"")
    val name = id.replaceFirstChar(Char::uppercase)

    val typeParameter = when (optionsType) {
        "Options" -> "${name}Options"
        "{}" -> "Void"
        else -> TODO()
    }

    val modifierBody = """
        @JsValue("$id")
        external val $name: popper.core.ModifierName<$typeParameter>
    """.trimIndent()

    if (typeParameter == "Void")
        return ConversionResult(name, modifierBody)

    var optionsSource = source
        .replace(EXTENDED_PADDING, "")
        .substringAfter("export declare type Options = {\n")
        .substringBefore(";\n};\n")

    if (name == "Arrow") {
        optionsSource = optionsSource.replace("Padding", PADDING_TYPE)
    }

    val body = sequenceOf(
        convertSyntheticInterface(name),
        convertInterface(typeParameter, optionsSource)?.body,
        modifierBody,
    ).filterNotNull().joinToString("\n\n")

    return ConversionResult(name, body)
}

private fun convertSyntheticInterface(name: String): String? {
    val type = when (name) {
        "Arrow" -> PADDING_TYPE
        "PreventOverflow" -> TETHER_OFFSET_TYPE
        "Offset" -> OFFSET_TYPE
        else -> return null
    }
    val sealed = when (name) {
        "Arrow" -> ""
        else -> "sealed "
    }

    return "${sealed}external interface $type"
}
