package karakum.vscode

internal const val STRING = "String"

internal const val INT = "Int"
internal const val DOUBLE = "Double"

private val STANDARD_TYPE_MAP = mapOf(
    "any" to "JsAny?",
    "unknown" to "JsAny?",
    "object" to "JsAny",

    "boolean" to "Boolean",
    "string" to STRING,

    "void" to "Void",
    "null" to "Void",

    "void | number" to "Int?",

    "() => any" to "() -> Unit",
    "(...args: any[]) => any" to "() -> Unit",

    "Error" to "JsError",

    "AsyncIterable<string>" to "AsyncIterable<String>",

    "Uint8Array" to "Uint8Array<*>",
    "Uint32Array" to "Uint32Array<*>",

    "Thenable<void> | void" to "PromiseLike<Void>?",
    "void | Thenable<void>" to "PromiseLike<Void>?",
    "Thenable<T> | T" to "PromiseResult<T>",
    "Uint8Array | Thenable<Uint8Array>" to "PromiseResult<Uint8Array<*>>",
    "FileStat | Thenable<FileStat>" to "PromiseResult<FileStat>",
    "NotebookData | Thenable<NotebookData>" to "PromiseResult<NotebookData>",
    "TreeItem | Thenable<TreeItem>" to "PromiseResult<TreeItem>",

    "[string, FileType][] | Thenable<[string, FileType][]>" to
            "PromiseResult<ReadonlyArray<Tuple2<String, FileType>>>",

    "[number, number]" to "Tuple2<JsInt, JsInt>",
    "[start: number, end: number]" to "Tuple2</* start */ JsInt, /* end */ JsInt>",
    "[string, FileType]" to "Tuple2<String, FileType>",

    "[Uri, Diagnostic[]]" to "Tuple2<Uri, ReadonlyArray<Diagnostic>>",
    "[Uri, readonly Diagnostic[] | undefined]" to "Tuple2<Uri, ReadonlyArray<Diagnostic>?>",
    "[TextEdit | SnippetTextEdit, WorkspaceEditEntryMetadata | undefined]" to
            "Tuple2<JsAny /* TextEdit | SnippetTextEdit */, WorkspaceEditEntryMetadata?>",
    "[NotebookEdit, WorkspaceEditEntryMetadata | undefined]" to
            "Tuple2<NotebookEdit, WorkspaceEditEntryMetadata?>",
    "[Uri, TextEdit[]]" to "Tuple2<Uri, ReadonlyArray<TextEdit>>",

    "{ readonly [key: string]: any }" to "ReadonlyRecord<String, *>",
    "{ readonly [name: string]: any }" to "ReadonlyRecord<String, *>",
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

    "Tab | readonly Tab[]" to "ReadonlyArray<Tab> /* Tab */",
    "TabGroup | readonly TabGroup[]" to "ReadonlyArray<TabGroup> /* TabGroup */",

    "LanguageModelToolInvocationOptions<object>" to "LanguageModelToolInvocationOptions<* /* object */>",
    "LanguageModelChatProvider" to "LanguageModelChatProvider<*>",
)

private val GENERIC_REQUIRED = setOf(
    "WebviewViewResolveContext",
    "TaskProvider",
    "McpServerDefinitionProvider",
    "CompletionItemProvider",
    "CodeActionProvider",
    "CodeLensProvider",
    "WorkspaceSymbolProvider",
    "DocumentLinkProvider",
    "InlayHintsProvider",
    "DocumentDropEditProvider",
    "DocumentPasteEditProvider",
    "WebviewPanelSerializer",
    "TerminalLinkProvider",
)

internal fun kotlinType(
    type: String,
    name: String,
): String {
    if (type.startsWith("readonly "))
        return kotlinType(type.removePrefix("readonly "), name)

    if (type.endsWith(" | undefined"))
        return kotlinType(type.removeSuffix(" | undefined"), name) + "?"

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

    if (type in GENERIC_REQUIRED)
        return "$type<*>"

    STANDARD_TYPE_MAP[type]
        ?.also { return it }

    if (type.endsWith(" | null")) {
        return kotlinType(type.removeSuffix(" | null"), name) + "?"
    }

    if (" | " in type
        && !type.startsWith("(")
        && !type.startsWith("{")
    ) return "JsAny /* $type */"

    if (type.endsWith("[]")) {
        val itemType = kotlinType(type.removeSuffix("[]"), name)
        return "ReadonlyArray<$itemType>"
    }

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

            "countTokens",
            "offsetAt",
            "hideAfterTimeout",
            "match",
            "maxResults",
            "maxOutputTokens",
            "provideTokenCount",

                // ???
            "value",
                -> INT

            "startTime",
            "endTime",
            "ctime",
            "mtime",
                -> "JsInt53"

            else -> TODO("Unknown number with name '$name'!")
        }
    }

    return type
        .replace("<any>", "<*>")
        .replace(" => Thenable<void> | void", " -> PromiseLike<Void>?")
        .replace(" => Thenable<void>", " -> PromiseLike<Void>")
        .replace(" => void | Thenable<void>", " -> PromiseLike<Void>?")
        .replace(" => void", " -> Unit")
        .replace(" => any", " -> Unit")
        .replace(" => unknown", " -> Unit")
        .replace(" => Thenable<FileCoverageDetail[]>", " -> PromiseLike<ReadonlyArray<FileCoverageDetail>>")
        .replace(" => Thenable<Pseudoterminal>", " -> PromiseLike<Pseudoterminal>")
        .replace(": NotebookCell[]", ": ReadonlyArray<NotebookCell>")
        .replace(": string", ": String")
        .replace(" | undefined", "?")
        .let { if (it.startsWith("(")) it.replace(", ", ",\n") else it }
}
