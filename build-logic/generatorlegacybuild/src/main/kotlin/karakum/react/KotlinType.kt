package karakum.react

internal const val UNIT = "Unit"

internal const val STRING = "String"

internal const val INT = "Int"
internal const val DOUBLE = "Double"

private val STANDARD_TYPE_MAP = mapOf(
    "any" to "Any",
    "object" to "Any",

    "boolean" to "Boolean",
    "string" to STRING,

    "void" to UNIT,
    "null" to "Nothing?",

    "Date" to "js.date.Date",

    "Document" to "web.dom.Document",
    "AbstractView" to "Window",

    "Key" to "react.Key",
    "CSSProperties" to "react.CSSProperties",

    "TouchList" to "web.touch.TouchList",
    "string | TrustedHTML" to "String /* | TrustedHTML */",

    // TODO: check
    "Booleanish" to "Boolean",
    "boolean | string" to "Boolean",

    "ImgDecoding" to "ImageDecoding",
    "ModifierKey" to "ModifierKeyCode",

    "ChangeEventHandler<T>" to "ChangeEventHandler<T, *>",
)

private val ANY_ALIASES = setOf(
    "string | ReadonlyArray<string> | number",
    "string | number | ReadonlyArray<string>",
    "number | Date",
)

private val FORM_ACTION_DECLARATION =
    "DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_FORM_ACTIONS[        keyof DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_FORM_ACTIONS    ]"

internal fun kotlinType(
    type: String,
    name: String,
): String {
    if (FORM_ACTION_DECLARATION in type)
        return FORM_ACTION

    if (type.startsWith("| string | DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_"))
        return "String"

    if (type.endsWith(" | undefined"))
        return kotlinType(type.removeSuffix(" | undefined"), name)

    if ("; // " in type)
        return kotlinType(type.substringBefore("; // "), name) +
                " // " + type.substringAfter("; // ")

    if (type == "number" || type == "number | string")
        return numberType(name)

    if (type in ANY_ALIASES)
        return "Any /* $type */"

    STANDARD_TYPE_MAP[type]
        ?.also { return it }

    if (type.endsWith(" | null")) {
        val t = kotlinType(type.removeSuffix(" | null"), name)
        return "$t?"
    }

    if (type.startsWith("string | "))
        return "Any // $type"

    if (type.startsWith("Booleanish | "))
        return "Any // $type"

    if (name == "formTarget") {
        return "WindowName"
    }

    if (type == "HTMLInputAutoCompleteAttribute") {
        return "AutoFill"
    }

    return type
}
