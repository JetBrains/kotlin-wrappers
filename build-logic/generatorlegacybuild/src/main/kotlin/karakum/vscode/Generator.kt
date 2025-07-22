package karakum.vscode

import karakum.common.GENERATOR_COMMENT
import karakum.common.Suppress.INTERFACE_WITH_SUPERCLASS
import karakum.common.fileSuppress
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

            else -> "export " in body || "external " in body
        }
        val annotations = when {
            hasRuntime
                -> """@file:JsModule("vscode")"""

            ":\nDisposable {" in body
                -> fileSuppress(INTERFACE_WITH_SUPERCLASS)

            else -> ""
        }

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
        """
        import js.array.ReadonlyArray
        import js.array.Tuple2
        import js.core.Int53
        import js.core.Void
        import js.date.Date
        import js.iterable.AsyncIterable
        import js.iterable.JsIterable
        import js.errors.JsError
        import js.objects.ReadonlyRecord
        import js.objects.Record
        import js.promise.PromiseLike
        import js.promise.PromiseResult
        import js.regexp.RegExp
        import js.typedarrays.Uint32Array
        import js.typedarrays.Uint8Array
        """.trimIndent(),
        body,
    ).filter { it.isNotEmpty() }
        .joinToString("\n\n")

    return result
}
