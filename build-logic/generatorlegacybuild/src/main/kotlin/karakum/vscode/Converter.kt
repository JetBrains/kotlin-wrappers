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

    return content
        .splitToSequence("\n/**")
        .mapIndexed { index, it -> if (index > 0) "/**$it" else it }
        .map { it.trim() }
        .map { parseDeclaration(it) }
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
        "enum" -> convertEnum(source, name)

        "type" -> convertType(source)

        "interface" -> convertInterface(source)
        "class" -> convertInterface(source)

        "namespace" -> convertNamespace(source)
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
    source: String,
    name: String,
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
    source: String,
): String {
    val comment = source.substringBefore("\nexport ")

    val decclaration = source.substringAfter("\nexport type")
    val name = decclaration.substringBefore(" = ")
    val bodySource = decclaration.substringAfter(" = ")
        .removeSuffix(";")

    val body = when {
        bodySource.startsWith("(") ->
            bodySource
                .replace("<ChatResult | void>", "<ChatResult?>")
                .replace(" => ", " -> ")
                .replace(", ", ",\n")

        bodySource == "T | undefined | null | Thenable<T | undefined | null>"
            -> "PromiseResult<T?>"

        bodySource == "[string, string]" -> "Tuple2<String, String>"
        bodySource == "never" -> "Nothing?"
        " | " in bodySource -> "Any /* $bodySource */"

        else -> bodySource
    }

    return "$comment\ntypealias $name = $body"
}

private fun convertNamespace(
    source: String,
): String {
    val comment = source.substringBefore("\nexport namespace ", "")

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
        convertMembers(membersSource),
        "}",
    ).joinToString("\n")
}

private fun convertInterface(
    source: String,
): String {
    val comment = source.substringBefore("\nexport ", "")

    val declaration = "external " + source
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
        .replace("<T = unknown>", "<T>")
        .replace("<T = any>", "<T>")
        .replace(
            " implements Iterable<[mimeType: string, item: DataTransferItem]>",
            " :\nJsIterable<Tuple2</* mimeType: */ String, /* item: */ DataTransferItem>>",
        )
        .replace(
            " extends Iterable<[uri: Uri, diagnostics: readonly Diagnostic[]]>",
            " :\nJsIterable<Tuple2</* uri: */ Uri, /* diagnostics: */ ReadonlyArray<Diagnostic>>>",
        )
        .replace(
            " extends Iterable<[variable: string, mutator: EnvironmentVariableMutator]>",
            " :\nJsIterable<Tuple2</* variable: */ String, /* mutator: */ EnvironmentVariableMutator>>",
        )
        .replace(
            " extends Iterable<[id: string, testItem: TestItem]>",
            " :\nJsIterable<Tuple2</* id: */ String, /* testItem: */ TestItem>>",
        )
        .replace(" extends Error", " :\nJsError")
        .replace(" extends ", " :\n")

    val membersSource = source
        .substringAfter(" {\n")
        .substringBefore("\n}")
        .trimIndent()

    return sequenceOf(
        comment,
        "$declaration {",
        convertMembers(membersSource),
        "}",
    ).joinToString("\n")
}

private fun convertMembers(
    source: String,
): String {
    val members = mutableListOf<String>()
    val staticMembers = mutableListOf<String>()

    source.splitToSequence("\n/**")
        .mapIndexed { index, it -> if (index > 0) "/**$it" else it }
        .map { it.trim() }
        .forEach {
            val declarationSource = it
                .substringAfter(" */\n")

            val memberSource = declarationSource
                .removePrefix("static ")
                .removeSuffix(";")

            val comment = it.removeSuffix(declarationSource)
            if ("@deprecated" in comment) {
                return@forEach
            }

            val result = commentMember(
                comment = comment,
                source = memberSource,
            )

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

private fun commentMember(
    comment: String,
    source: String,
): String {
    val declaration = when {
        "\n" in source
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

        else -> convertFunction(source)
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

private fun convertConstructor(
    source: String,
): String {
    if (source.startsWith("protected ") || source.startsWith("private "))
        return source.substringBefore(" ") + " " + convertConstructor(source.substringAfter(" "))

    if (source == "constructor()") {
        return source
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

private fun convertFunction(
    source: String,
): String {
    if ("(" !in source)
        return "//  $source"

    if ("/** literal-type defines return type */" in source)
        return "    // $source"

    if ("<T extends string>" in source)
        return convertFunction(
            source.replace("<T extends string>", "")
                .replace("T[]", "string[]")
                .replace("Thenable<T |", "Thenable<string |")
        )

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
                thisArg: Any = definedExternally,
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

    if (source.startsWith("$name?(")) {
        val body = convertFunctionBody(
            name = name,
            source = "(" + source.substringAfter("?("),
            getReturnSignature = { if (it != "Void") " -> Unit" else " -> $it" },
        ).replace(" = definedExternally", "?")

        return "var $name: ($body)?"
    }

    val typeParameters = source
        .substringAfter(name)
        .substringBefore("(")
        .replace(" = unknown", "")
        .replace(" = any", "")
        .replace(" extends ", " : ")

    val body = convertFunctionBody(
        name = name,
        source = "(" + source.substringAfter("("),
        getReturnSignature = { if (it != "Void") ": $it" else "" },
    )

    val modifier = if (source.startsWith("(")) "operator" else ""
    return "$modifier fun $typeParameters $name$body"
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
        parametersSource
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
            .joinToString(",\n")
    } else ""

    val returnType = getReturnSignature(kotlinType(source.substringAfterLast("): "), name))
    return "($parameters)$returnType"
}
