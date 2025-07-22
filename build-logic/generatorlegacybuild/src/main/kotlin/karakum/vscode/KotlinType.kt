package karakum.vscode

internal const val UNIT = "Unit"

internal const val STRING = "String"

internal const val INT = "Int"
internal const val DOUBLE = "Double"

private val STANDARD_TYPE_MAP = mapOf(
    "any" to "Any?",
    "object" to "Any",

    "boolean" to "Boolean",
    "string" to STRING,

    "void" to "Void",
    "null" to "Void",

    "Uint8Array" to "Uint8Array<*>",
    "Uint32Array" to "Uint32Array<*>",

    "[start: number, end: number]" to "Tuple2</* start */ Int, /* end */ Int>",
    "{ readonly [key: string]: any }" to "ReadonlyRecord<String, *>",
    "{ [key: string]: any }" to "Record<String, *>",

    "ReadonlyArray<[T, TreeItemCheckboxState]>" to "ReadonlyArray<Tuple2<T, TreeItemCheckboxState>>",
    "Record<string, any>" to "Record<String, *>",
)

internal fun kotlinType(
    type: String,
    name: String,
): String {
    if (type.startsWith("readonly "))
        return kotlinType(type.removePrefix("readonly "), name)

    if (type.startsWith("Event<"))
        return "Event<" + kotlinType(type.removeSurrounding("Event<", ">"), name) + ">"

    if (type.endsWith(" | undefined"))
        return kotlinType(type.removeSuffix(" | undefined"), name)

    STANDARD_TYPE_MAP[type]
        ?.also { return it }

    if (type.endsWith(" | null")) {
        val t = kotlinType(type.removeSuffix(" | null"), name)
        return "$t?"
    }

    if (type.endsWith("[]")) {
        val itemType = kotlinType(type.removeSuffix("[]"), name)
        return "ReadonlyArray<$itemType>"
    }

    if (" | " in type)
        return "Any /* $type */"

    if (type == "number") {
        return when (name) {
            "red",
            "green",
            "blue",
            "alpha",
                -> DOUBLE

            "index",
            "count",
            "size",
            "port",
            "threadId",
            "frameId",
            "processId",
            "maxInputTokens",
            "executionOrder",
            "version",
            "cellCount",
            "start",
            "end",
            "character",
            "line",
            "columns",
            "rows",
            "deleteCount",
            "priority",
            "code",
            "exitCode",
            "lineCount",
            "rangeLength",
            "rangeOffset",
            "firstNonWhitespaceCharacterIndex",
            "lineNumber",
            "extensionHostPort",
            "webviewPort",

                // ???
            "value",
                -> INT

            else -> TODO("Unknown number with name '$name'!")
        }
    }

    return type.replace("<any>", "<*>")
}
