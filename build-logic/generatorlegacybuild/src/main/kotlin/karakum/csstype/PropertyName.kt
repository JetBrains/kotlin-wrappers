package karakum.csstype

import karakum.common.ConversionResult
import karakum.common.JsUnionConverter.unionBodyByConstants
import karakum.common.UnionConstant
import karakum.common.kebabToCamel

private const val PROPERTY_NAME = "PropertyName"

internal fun PropertyName(
    contentMap: Map<String, String>,
): ConversionResult {
    val values = sequenceOf(
        "StandardLonghandPropertiesHyphen",
        "StandardShorthandPropertiesHyphen",
    ).map(contentMap::getValue)
        .flatMap { propertyNames(it) }
        .sorted()
        .toList()

    val constants = values.map { value ->
        val name = value.kebabToCamel()
        val typeParameter = getPropertyType(name.replaceFirstChar(Char::uppercase))

        UnionConstant(
            name = name,
            value = value,
            type = "$PROPERTY_NAME<$typeParameter>",
        )
    }

    val body = unionBodyByConstants(PROPERTY_NAME, constants)
        .replaceFirst(PROPERTY_NAME, "$PROPERTY_NAME<T: Any> : $IDENT")

    return ConversionResult(PROPERTY_NAME, body)
}

private fun getPropertyType(
    suggestedType: String,
): String =
    when (suggestedType) {
        COLOR -> COLOR_PROPERTY

        // hardcode
        "ColorAdjust",
            -> "PrintColorAdjust"

        "Motion",
        "MotionDistance",
            -> "Offset"

        "MotionPath",
            -> "OffsetPath"

        "MotionRotation",
        "OffsetRotation",
            -> "OffsetRotate"

        "ScrollSnapMargin",
        "ScrollSnapMarginBottom",
        "ScrollSnapMarginLeft",
        "ScrollSnapMarginRight",
        "ScrollSnapMarginTop",
            -> suggestedType.replace("Snap", "")

        else -> OVERFLOW_ALIAS_MAP[suggestedType] ?: suggestedType
    }

private fun propertyNames(
    content: String,
): Sequence<String> =
    content.substringAfter("{\n")
        .substringBefore("\n}")
        .trimIndent()
        .lineSequence()
        .filter { "?: " in it }
        .map { it.substringBefore("?: ") }
        .map { it.removeSurrounding("\"") }
