package karakum.vscode

import karakum.common.GENERATOR_COMMENT
import karakum.common.writeCode
import java.io.File

internal fun generateKotlinDeclarations(
    definitionsFile: File,
    sourceDir: File,
) {
    val targetDir = sourceDir.resolve("vscode")
    targetDir.mkdirs()

    for ((name, body) in parseDeclarations(definitionsFile)) {
        val hasRuntime = when {
            "export interface " in body -> false
            "external interface " in body -> "sealed /* enum */" in body
            else -> true
        }
        val annotations = if (hasRuntime) {
            """@file:JsModule("vscode")"""
        } else ""

        targetDir.resolve("$name.kt")
            .also { check(!it.exists()) { "Duplicated file: ${it.name}" } }
            .writeCode(fileContent(annotations, body))
    }
}

private fun fileContent(
    annotations: String = "",
    body: String,
): String {
    val result = sequenceOf(
        "// $GENERATOR_COMMENT",
        annotations,
        "package vscode",
        body,
    ).filter { it.isNotEmpty() }
        .joinToString("\n\n")

    return result
}
