package karakum.vscode

import karakum.common.ConversionResult
import java.io.File

internal fun parseDeclarations(
    definitionsFile: File,
): List<ConversionResult> {
    val content = definitionsFile.readText()
        .substringAfter("declare module 'vscode' {\n", "")
        .substringBefore("\n}")
        .trimIndent()
        .trim()
        .replace("\n */\n/**\n", "\n")
        .replace("\u200B/*", "\u200B/\u200B*")
        .replace("`/*", "`/\u200B*")
        .replace("/**`", "/\u200B**`")
        .replace("/**'", "/\u200B**'")
        .replace("/*`", "/\u200B*`")
        .replace("/*.", "/\u200B*.")
        .replace("dispose: () => any;", "dispose(): void;")
        .replace("dispose(): any;", "dispose(): void;")

    return content
        .splitToSequence("\n/**")
        .mapIndexed { index, it -> if (index > 0) "/**$it" else it }
        .map { it.trim() }
        .map { parseDeclaration(it) }
        .plus(
            ConversionResult(
                DISPOSABLE_LIKE,
                convertInterface(DISPOSABLE_LIKE, DISPOSABLE_LIKE_DECLARATION, Commenter.EMPTY),
            )
        )
        .toList()
}

private fun parseDeclaration(
    source: String,
): ConversionResult {
    check("export " in source) {
        "No `export` in sources:\n----\n$source\n----\n"
    }

    val name = source
        .substringAfter("\nexport ")
        .substringAfter(" ")
        .substringBefore(" ")
        .substringBefore("?")
        .substringBefore(":")
        .substringBefore("(")
        .substringBefore("<")

    val type = source
        .substringAfter("\nexport ")
        .substringBefore(" ")

    val body = when (type) {
        "enum" -> convertEnum(name, source)

        "type" -> convertType(name, source)

        "interface" -> convertInterface(name, source)
        "class" -> convertInterface(name, source)

        "namespace" -> convertNamespace(name, source)
        "const" -> convertConst(source)

        else -> TODO("Undefined source:\n---\n$source\n---")
    }

    return ConversionResult(name, body)
}

private fun convertConst(
    source: String,
): String =
    source
        .replace("\nexport const ", "\nexternal val ")
        .replace(": string", ": String")
        .removeSuffix(";")

private fun convertEnum(
    name: String,
    source: String,
): String =
    source
        .replaceFirst("\nexport enum ", "\nsealed /* enum */\nexternal interface ")
        .replaceFirst("{\n", "{\ncompanion object {")
        .replaceFirst("\n}", "\n}\n}")
        .splitToSequence("\n")
        .map {
            if (" = " in it) {
                "val " + it.removeSuffix(",").replace(" = ", ": $name // ")
            } else it
        }
        .joinToString("\n")

private fun convertType(
    name: String,
    source: String,
): String {
    val comment = kdoc(
        source.substringBefore("\nexport "),
        Commenter.create(name),
    )

    val (declaration, bodySource) = source
        .substringAfter("\nexport type")
        .removeSuffix(";")
        .split(" = ")
        .also { check(it.size == 2) }

    val body = when {
        bodySource.startsWith("(") ->
            bodySource
                .replace("<ChatResult | void>", "<ChatResult?>")
                .replace(" => ", " -> ")
                .replace(", ", ",\n")

        bodySource == "T | undefined | null | Thenable<T | undefined | null>"
            -> "PromiseResult<T?>"

        bodySource == "[string, string]" -> "Tuple2<String, String>"
        bodySource == "never" -> "JsAny? /* Nothing? */"
        " | " in bodySource -> "JsAny /* $bodySource */"

        else -> bodySource
    }

    return "$comment\ntypealias $declaration = $body"
}

private fun convertNamespace(
    name: String,
    source: String,
): String {
    val commenter = Commenter.create(name)
    val comment = kdoc(source.substringBefore("\nexport namespace ", ""), commenter)

    val declaration = "external object " + source
        .substringAfter("\nexport namespace ", "")
        .substringBefore(" {\n", "")

    val membersSource = source
        .substringAfter("\nexport namespace ")
        .substringAfter(" {\n")
        .substringBefore("\n}")
        .trimIndent()
        .replace("export const ", "readonly ")
        .replace("export let ", "")
        .replace("export function ", "")

    return sequenceOf(
        comment,
        "$declaration {",
        convertMembers(membersSource, commenter, true),
        "}",
    ).joinToString("\n")
}

private fun convertInterface(
    name: String,
    source: String,
    commenter: Commenter = Commenter.create(name),
): String {
    val comment = kdoc(source.substringBefore("\nexport ", ""), commenter)

    var declaration = "external " + source
        .substringAfter("export ", "")
        .substringBefore(" {\n", "")
        .replace("class ", "open class ")
        .replace(Regex(""" extends (\w+?) = (\w+?)>""")) {
            val bound = it.groupValues[1]
            val defaultBound = it.groupValues[2]

            if (bound == defaultBound) {
                " : $bound>"
            } else {
                " : $bound /* = $defaultBound */>"
            }
        }
        .replace("<T = unknown>", "<T : JsAny?>")
        .replace("<T = any>", "<T : JsAny?>")
        .let { if ("<T>" in it.substringBefore(":")) it.replace("<T>", "<T : JsAny?>") else it }
        .replace(
            " implements Iterable<[mimeType: string, item: DataTransferItem]>",
            " :\nJsIterable<Tuple2</* mimeType: */ JsString, /* item: */ DataTransferItem>>",
        )
        .replace(
            " extends Iterable<[uri: Uri, diagnostics: readonly Diagnostic[]]>",
            " :\nJsIterable<Tuple2</* uri: */ Uri, /* diagnostics: */ ReadonlyArray<Diagnostic>>>",
        )
        .replace(
            " extends Iterable<[variable: string, mutator: EnvironmentVariableMutator]>",
            " :\nJsIterable<Tuple2</* variable: */ JsString, /* mutator: */ EnvironmentVariableMutator>>",
        )
        .replace(
            " extends Iterable<[id: string, testItem: TestItem]>",
            " :\nJsIterable<Tuple2</* id: */ JsString, /* testItem: */ TestItem>>",
        )
        .replace(" extends Error", " :\nJsError")
        .replace(" extends ", " :\n")

    val membersSource = source
        .substringAfter(" {\n")
        .substringBefore("\n}")
        .trimIndent()
        .addDisposableLikeSupport()

    var members = convertMembers(
        source = membersSource,
        parentCommenter = commenter,
        asyncSupport = "export class " in source,
    )

    val isDisposable = "\nfun dispose()" in members
            && DISPOSABLE_LIKE !in declaration

    if (isDisposable) {
        declaration = declaration +
                (if ("\n" in declaration) "," else ":") +
                "\n$DISPOSABLE_LIKE"

        members = members.replace("\nfun dispose()", "\noverride fun dispose()")
    }

    if (" interface " in declaration && "\nfun " !in members && !isDisposable && name !in NON_JSO) {
        declaration = "@JsPlainObject\n$declaration"
    }

    return sequenceOf(
        comment,
        "$declaration {",
        members,
        "}",
    ).joinToString("\n")
}

private val NON_JSO = setOf(
    "Event",
    "FileSystemWatcher",
    "InputBox",
    "QuickPick",
    "TreeView",
)

private fun convertMembers(
    source: String,
    parentCommenter: Commenter,
    asyncSupport: Boolean,
): String {
    val members = mutableListOf<String>()
    val staticMembers = mutableListOf<String>()

    source
        .splitToSequence("\n/**")
        .mapIndexed { index, it -> if (index > 0) "/**$it" else it }
        .map { it.trim() }
        .forEach {
            val declarationSource = it
                .substringAfter(" */\n")

            val memberSource = declarationSource
                .removePrefix("static ")
                .removeSuffix(";")

            val commentSource = it.removeSuffix(declarationSource)
            if ("@deprecated" in commentSource) {
                return@forEach
            }

            val memberName = memberSource
                .substringBefore("?")
                .substringBefore("(")
                .substringBefore("<")
                .substringBefore(":")
                .substringAfterLast(" ")

            val invokeOperator = memberName.isEmpty()
            val commenter = parentCommenter
                .takeIf { invokeOperator }
                ?: parentCommenter.child(memberName)

            var result = convertMember(
                comment = kdoc(commentSource, commenter),
                source = memberSource,
                asyncSupport = asyncSupport,
            )

            if (invokeOperator) {
                result = result.splitToSequence("\n")
                    .filter { "thisArg" !in it }
                    .filter { "disposables" !in it }
                    .joinToString("\n")
            }

            if (declarationSource.startsWith("static ")) {
                staticMembers.add(result)
            } else {
                members.add(result)
            }
        }

    return buildString {
        append(members.joinToString("\n\n"))

        if (staticMembers.isNotEmpty()) {
            append("\n\n")
            append("companion object {\n")
            append(staticMembers.joinToString("\n\n"))
            append("\n}")
        }
    }
}

private fun convertMember(
    comment: String,
    source: String,
    asyncSupport: Boolean,
): String {
    val declaration = when {
        "\n" in source && (
                "change: {" !in source
                        && "options: {" !in source
                        && "options?: {" !in source
                        || "#workspace." in comment
                )
            -> "/*\n$source\n*/"

        source.startsWith("constructor(") ||
                source.startsWith("protected constructor(") ||
                source.startsWith("private constructor(")
            -> convertConstructor(source)

        source.startsWith("// Properties: ")
            -> "    $source"

        source == "readonly [key: string]: any" ||
                source == "[key: string]: boolean | number | string" ||
                source == "[key: string]: any" ||
                source == "[name: string]: any"
            -> "    // $source"

        source.startsWith("[Symbol.iterator]")
            -> "    // $source"

        isPropertySource(source)
            -> convertProperty(source)

        else -> convertFunction(source, asyncSupport)
    }

    return comment + declaration
}

private fun isPropertySource(
    source: String,
): Boolean {
    if (":" !in source)
        return false

    if ("(" !in source)
        return true

    return source.indexOf(":") < source.indexOf("(")
}

private fun convertProperty(
    source: String,
): String {
    val modifier = if (source.startsWith("readonly ")) "val" else "var"
    val name = source
        .removePrefix("readonly ")
        .substringBefore(":")
        .substringBefore("?")

    val optional = "$name?: " in source
    val typeSource = source
        .substringAfter(": ")

    val type = kotlinType(typeSource, name)
        .let { (if (optional && !it.endsWith("?")) "$it?" else it) }

    return "$modifier $name: $type"
}

private val UNIONS = listOf(
    "ReadonlyArray<string> | AuthenticationWwwAuthenticateRequest",
    // "Position | Range | readonly Position[] | readonly Range[]",
    "Position | Range | Selection",
    "Position | Range",
    "Range | Position",
    "Range | Selection",
    "number | boolean",
    "string | CompletionItemLabel",
    "string | MarkdownString",
    "string | SnippetString",
    "string | DebugConfiguration",
    "string | InlayHintLabelPart[]",
    "string | LanguageModelChatMessage",
    "string | Array<LanguageModelInputPart>",
    "string | LanguageModelChatRequestMessage",
    "string | Error",
    "string | [number, number]",
    "DebugSession | DebugSessionOptions",
    "ProcessExecution | ShellExecution | CustomExecution",
    "string | Uri",
    "Uri | Location",
    "NotebookCellOutput | readonly NotebookCellOutput[]",
    "NotebookCellOutputItem | readonly NotebookCellOutputItem[]",
    "WorkspaceFolder | Uri | string",
    "string | ((snippet: SnippetString) => any)",
    // "WorkspaceFolder | TaskScope.Global | TaskScope.Workspace",
    "TestMessage | readonly TestMessage[]",
    "Range[] | readonly DecorationOptions[]",
    "string | TreeItemLabel",
    // "CustomTextEditorProvider | CustomReadonlyEditorProvider | CustomEditorProvider",
    "TerminalOptions | ExtensionTerminalOptions",
    "string | string[]",
    "string[] | string",
    "ConfigurationTarget | boolean",
    "string[] | Thenable<readonly string[]>",
    "T[] | Thenable<readonly T[]>",
)

private fun multipleSources(
    source: String,
): List<String>? {
    val union = UNIONS.firstOrNull { "$it, " in source || "$it)" in source }
        ?: return null

    val unionParts = union.split(" | ")

    val optionalUnion = "?: $union"
    return if (optionalUnion in source) {
        unionParts.mapIndexed { index, unionPart ->
            source.replace(optionalUnion, if (index == 0) "?: $unionPart" else ": $unionPart")
        }
    } else {
        unionParts.map { source.replace(union, it) }
    }
}

private fun convertConstructor(
    source: String,
): String {
    if (source.startsWith("protected ") || source.startsWith("private "))
        return source.substringBefore(" ") + " " + convertConstructor(source.substringAfter(" "))

    if (source == "constructor()") {
        return source
    }

    multipleSources(source)?.let {
        return it.joinToString("\n\n") {
            convertConstructor(it)
        }
    }

    return source
        .removePrefix("constructor(")
        .removeSuffix(")")
        .replace("[number, number]", "[number_,_number]")
        .replace("<string, string", "<string_,_string")
        .splitToSequence(", ")
        .map {
            it.replace("[number_,_number]", "[number, number]")
                .replace("<string_,_string", "<string, string")
        }
        .map {
            val name = it
                .substringBefore(": ")
                .removeSuffix("?")

            val optional = it.startsWith("$name?")
            val type = kotlinType(it.substringAfter(": "), name)

            "$name: $type" + if (optional) " = definedExternally" else ""
        }
        .joinToString(",\n", "constructor(", ")")
}

private val OPTIONS_REGEX = Regex(
    """(\w+)\??: (\{\n.+\n})""",
    setOf(RegexOption.MULTILINE, RegexOption.DOT_MATCHES_ALL),
)

private fun convertFunction(
    source: String,
    asyncSupport: Boolean,
): String {
    if ("(" !in source)
        return "//  $source"

    if ("/** literal-type defines return type */" in source)
        return "    // $source"

    if ("<T extends string>" in source)
        return convertFunction(
            source.replace("<T extends string>", "")
                .replace("T[]", "string[]")
                .replace("Thenable<T |", "Thenable<string |"),
            asyncSupport,
        )

    multipleSources(source)?.let {
        return it.joinToString("\n\n") {
            convertFunction(it, asyncSupport)
        }
    }

    when (source) {
        "createRunProfile(label: string, kind: TestRunProfileKind, runHandler: (request: TestRunRequest, token: CancellationToken) => Thenable<void> | void, isDefault?: boolean, tag?: TestTag, supportsContinuousRun?: boolean): TestRunProfile",
            ->
            // language=kotlin
            return """
            fun createRunProfile(
                label: String,
                kind: TestRunProfileKind,
                runHandler: (
                    request: TestRunRequest,
                    token: CancellationToken,
                ) -> PromiseLike<Void>,
                isDefault: Boolean = definedExternally,
                tag: TestTag = definedExternally,
                supportsContinuousRun: Boolean = definedExternally,
            ): TestRunProfile
            """.trimIndent()

        "registerTextEditorCommand(command: string, callback: (textEditor: TextEditor, edit: TextEditorEdit, ...args: any[]) => void, thisArg?: any): Disposable",
            ->
            // language=kotlin
            return """
            fun registerTextEditorCommand(
                command: String,
                callback: (
                    textEditor: TextEditor,
                    edit: TextEditorEdit,
                    /* ...args: any[], */
                ) -> Unit,
                thisArg: JsAny = definedExternally,
            ): Disposable
            """.trimIndent()

        "createNotebookController(id: string, notebookType: string, label: string, handler?: (cells: NotebookCell[], notebook: NotebookDocument, controller: NotebookController) => void | Thenable<void>): NotebookController",
            ->
            // language=kotlin
            return """
            fun createNotebookController(
                id: String,
                notebookType: String,
                label: String,
                handler: (
                    cells: ReadonlyArray<NotebookCell>,
                    notebook: NotebookDocument,
                    controller: NotebookController,
                ) -> PromiseLike<Void> = definedExternally,
            ): NotebookController
            """.trimIndent()
    }

    val name = source
        .substringBefore("(")
        .substringBefore("<")
        .removeSuffix("?")
        .ifEmpty { "invoke" }

    val additionalInterfaceMatch = OPTIONS_REGEX
        .find(source)

    if (additionalInterfaceMatch != null) {
        val (interfaceName, interfaceBody) = additionalInterfaceMatch.destructured
        val optionsName = name.replaceFirstChar { it.uppercase() } +
                interfaceName.replaceFirstChar { it.uppercase() }
        val newSource = source.replace(interfaceBody, optionsName)

        return convertFunction(newSource, asyncSupport) + "\n\n" +
                convertInterface(optionsName, "export interface $optionsName $interfaceBody", Commenter.EMPTY)
                    .replace("\nexternal interface ", "\ninterface ")
    }

    if (source.startsWith("$name?(")) {
        val body = convertFunctionBody(
            name = name,
            source = "(" + source.substringAfter("?("),
            getReturnSignature = { if (it == "Void") " -> Unit" else " -> $it" },
        ).replace(" = definedExternally", "?")

        return "var $name: ($body)?"
    }

    val typeParameters = source
        .substringAfter(name)
        .substringBefore("(")
        .replace(" = unknown", "")
        .replace(" = any", "")
        .replace(" extends ", " : ")
        .let { if (it == "<T>") "<T : JsAny?>" else it }

    val body = convertFunctionBody(
        name = name,
        source = "(" + source.substringAfter("("),
        getReturnSignature = { if (it != "Void") ": $it" else "" },
    )

    val returnType = body.substringAfterLast("): ", "")
    val isAsync = asyncSupport && (
            returnType.startsWith("Promise<")
                    || returnType.startsWith("PromiseLike<")
                    || returnType.startsWith("PromiseResult<")
                    || returnType.startsWith("ProviderResult<")
            )

    val finalName = if (isAsync) name + "Async" else name
    val modifier = if (source.startsWith("(")) "operator" else ""
    val result = sequenceOf(
        modifier,
        "fun",
        typeParameters,
        "$finalName$body",
    ).filter { it.isNotEmpty() }
        .joinToString(" ")

    return (if (isAsync) "@JsName(\"$name\")\n" else "") + result
}

private fun convertFunctionBody(
    name: String,
    source: String,
    getReturnSignature: (String) -> String,
): String {
    val parametersSource = source
        .substringAfter("(")
        .substringBeforeLast("): ")

    val parameters = if (parametersSource.isNotEmpty()) {
        val items = parametersSource
            .replace("[number, number]", "[number_,_number]")
            .replace("<string, string", "<string_,_string")
            .replace("<string, any", "<string_,_any")
            .replace("[Uri, readonly", "[Uri_,_readonly")
            .replace("SnippetTextEdit, WorkspaceEditEntryMetadata", "SnippetTextEdit_,_WorkspaceEditEntryMetadata")
            .replace("NotebookEdit, WorkspaceEditEntryMetadata", "NotebookEdit_,_WorkspaceEditEntryMetadata")
            .splitToSequence(", ")
            .map {
                it.replace("[number_,_number]", "[number, number]")
                    .replace("<string_,_string", "<string, string")
                    .replace("<string_,_any", "<string, any")
                    .replace("[Uri_,_readonly", "[Uri, readonly")
                    .replace(
                        "SnippetTextEdit_,_WorkspaceEditEntryMetadata",
                        "SnippetTextEdit, WorkspaceEditEntryMetadata"
                    )
                    .replace("NotebookEdit_,_WorkspaceEditEntryMetadata", "NotebookEdit, WorkspaceEditEntryMetadata")
            }
            .map {
                val name = it
                    .removePrefix("...")
                    .substringBefore(": ")
                    .removeSuffix("?")

                val vararg = it.startsWith("...")
                val optional = it.startsWith("$name?")
                var typeSource = it.substringAfter(": ")
                if (vararg) {
                    typeSource = if (typeSource.startsWith("Array<")) {
                        kotlinType(typeSource.removeSurrounding("Array<", ">"), name)
                    } else {
                        require(typeSource.endsWith("[]")) {
                            "No `[]` on type end:\n$typeSource"
                        }
                        typeSource.removeSuffix("[]")
                    }
                }

                val type = kotlinType(typeSource, name)

                (if (vararg) "vararg " else "") +
                        "$name: $type" +
                        if (optional) " = definedExternally" else ""
            }
            .toList()

        items.singleOrNull()
            ?: items.joinToString(",\n", "", ",\n")
    } else ""

    val returnType = getReturnSignature(kotlinType(source.substringAfterLast("): "), name))
    return "($parameters)$returnType"
}

private val API_PAGE_URL = "https://code.visualstudio.com/api/references/vscode-api"

private fun kdoc(
    source: String,
    commenter: Commenter,
): String {
    val result = source
        .replace(Regex("""\{@link (\S+)}"""), "[$1]")
        .replace(Regex("""\{@link (\S+) (.+)}"""), "[$2][$1]")

    val name = commenter.name
        ?: return result

    return result
        .replace("\n */", "\n *\n * [Online Documentation]($API_PAGE_URL#${name})\n */")
}
