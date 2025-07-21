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

    return content
        .splitToSequence("\n/**")
        .mapIndexed { index, it -> if (index > 0) "/**$it" else it }
        .map { it.trim() }
        .map { parseDeclaration(it) }
        .toList()
        .also { println("ITEMS: " + it.size) }
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

    val body = sequenceOf(
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

    return ConversionResult(name, body)
}
