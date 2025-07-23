package karakum.vscode

internal const val UNIT = "Unit"

internal const val STRING = "String"

internal const val INT = "Int"
internal const val DOUBLE = "Double"

private val STANDARD_TYPE_MAP = mapOf(
    "any" to "Any?",
    "unknown" to "Any?",
    "object" to "Any",

    "boolean" to "Boolean",
    "string" to STRING,

    "void" to "Void",
    "null" to "Void",

    "() => any" to "() -> Unit",

    "AsyncIterable<string>" to "AsyncIterable<String>",

    "Thenable<number | undefined>" to "PromiseLike<Int?>",
    "Thenable<number>" to "PromiseLike<Int>",

    "Uint8Array" to "Uint8Array<*>",
    "Uint32Array" to "Uint32Array<*>",

    "[number, number]" to "Tuple2<Int, Int>",
    "[start: number, end: number]" to "Tuple2</* start */ Int, /* end */ Int>",
    "{ readonly [key: string]: any }" to "ReadonlyRecord<String, *>",
    "{ [key: string]: string }" to "Record<String, String>",
    "{ [key: string]: any }" to "Record<String, *>",
    "{ [name: string]: any }" to "Record<String, *>",
    "{ [name: string]: string[] }" to "Record<String, ReadonlyArray<String>>",
    "{ [key: string]: boolean | undefined }" to "Record<String, Boolean?>",
    "{ [key: string]: boolean | undefined }" to "Record<String, Boolean?>",
    "{ [key: string]: string | null | undefined }" to "Record<String, Boolean?>",

    "[T, TreeItemCheckboxState]" to "Tuple2<T, TreeItemCheckboxState>",

    "Record<string, any>" to "Record<String, *>",
    "Record<string, string>" to "Record<String, String>",
    "Record<string, string | number | null>" to "Record<String, String?>",
)

internal fun kotlinType(
    type: String,
    name: String,
): String {
    if (type.startsWith("readonly "))
        return kotlinType(type.removePrefix("readonly "), name)

    if (type.endsWith(" | undefined"))
        return kotlinType(type.removeSuffix(" | undefined"), name)

    if (type.startsWith("Event<") && type.endsWith(">"))
        return "Event<" + kotlinType(type.removeSurrounding("Event<", ">"), name) + ">"

    if (type.startsWith("Array<") && type.endsWith(">"))
        return "ReadonlyArray<" + kotlinType(type.removeSurrounding("Array<", ">"), name) + ">"

    if (type.startsWith("ReadonlyArray<") && type.endsWith(">"))
        return "ReadonlyArray<" + kotlinType(type.removeSurrounding("ReadonlyArray<", ">"), name) + ">"

    if (type.startsWith("AsyncIterable<") && type.endsWith(">"))
        return "AsyncIterable<" + kotlinType(type.removeSurrounding("AsyncIterable<", ">"), name) + ">"

    if (type.startsWith("Thenable<") && type.endsWith(">"))
        return "PromiseLike<" + kotlinType(type.removeSurrounding("Thenable<", ">"), name) + ">"

    if (type.startsWith("ProviderResult<") && type.endsWith(">"))
        return "ProviderResult<" + kotlinType(type.removeSurrounding("ProviderResult<", ">"), name) + ">"

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

    if (" | " in type
        && !type.startsWith("(")
        && !type.startsWith("{")
    ) return "Any /* $type */"

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
            "length",
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
            "tabSize",
            "startIndex",
            "startLine",
            "activeParameter",
            "activeSignature",
            "removeText",
            "tokenBudget",
            "step",
            "totalSteps",
            "covered",
            "total",
            "startCharacter",
            "endLine",
            "endCharacter",
            "anchorLine",
            "anchorCharacter",
            "activeLine",
            "activeCharacter",

            "compareTo",
            "lineDelta",
            "characterDelta",
            "char",
            "tokenType",
            "tokenModifiers",
            "number",
            "duration",
            "position",
            "offset",

                // ???
            "value",
                -> INT

            "startTime",
            "endTime",
            "ctime",
            "mtime",
                -> "Int53"

            else -> "--NUMBER--"
            // else -> TODO("Unknown number with name '$name'!")
        }
    }

    return type
        .replace("<any>", "<*>")
        .replace(" => Thenable<void> | void", " -> PromiseLike<Void>?")
        .replace(" => Thenable<void>", " -> PromiseLike<Void>")
        .replace(" => void | Thenable<void>", " -> PromiseLike<Void>?")
        .replace(" => void", " -> Unit")
        .replace(" => Thenable<FileCoverageDetail[]>", " -> PromiseLike<ReadonlyArray<FileCoverageDetail>>")
        .replace(" => Thenable<Pseudoterminal>", " -> PromiseLike<Pseudoterminal>")
        .replace(": NotebookCell[]", ": ReadonlyArray<NotebookCell>")
        .replace(" | undefined", "?")
        .let { if (it.startsWith("(")) it.replace(", ", ",\n") else it }
}
