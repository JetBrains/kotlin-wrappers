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
