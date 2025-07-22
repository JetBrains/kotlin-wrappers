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
        .substringAfter("export ")
        .substringAfter(" ")
        .substringBefore(" ")
        .substringBefore("?")
        .substringBefore(":")
        .substringBefore("(")
        .substringBefore("<")

    val type = source
        .substringAfter("export ")
        .substringBefore(" ")

    val body = when (type) {
        "enum" -> convertEnum(source, name)

        "type" -> convertType(source)

        "interface" -> convertInterface(source, name)
        "class" -> convertInterface(source, name)

        else -> commentedOriginal(source)
    }

    return ConversionResult(name, body)
}

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
        bodySource == "never" -> "Nothing"
        " | " in bodySource -> "Any /* $bodySource */"

        else -> bodySource
    }

    return "$comment\ntypealias $name = $body"
}

private fun convertInterface(
    source: String,
    name: String,
): String {
    val comment = source.substringBefore("\nexport ", "")

    val declaration = "external " + source
        .replace("class ", "open class ")
        .substringAfter("export ", "")
        .substringBefore(" {\n", "")
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
        commentMembers(membersSource),
        "}",
    ).joinToString("\n")
}

private fun commentMembers(
    source: String,
): String {
    return source.splitToSequence("\n/**")
        .mapIndexed { index, it -> if (index > 0) "/**$it" else it }
        .map { it.trim() }
        .map {
            val declarationSource = it.substringAfter(" */\n")

            commentMember(
                comment = it.removeSuffix(declarationSource),
                source = declarationSource,
            )
        }
        .joinToString("\n\n")
}

private fun commentMember(
    comment: String,
    source: String,
): String {
    val declaration = if ("\n" in source) {
        "/*\n$source\n*/"
    } else {
        "//  $source"
    }

    return comment + declaration
}

private fun commentedOriginal(
    source: String,
): String =
    sequenceOf(
        """
            /**
            // ORIGINAL SOURCE
            """.trimIndent(),
        source,
        """
            // ORIGINAL SOURCE
            **/
            """.trimIndent()
    ).joinToString("\n\n")
