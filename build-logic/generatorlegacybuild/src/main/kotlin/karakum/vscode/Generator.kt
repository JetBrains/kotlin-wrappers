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
            "external interface " in body -> false

            else -> "export " in body || "external " in body
        }

        val annotations = if (hasRuntime) """@file:JsModule("vscode")""" else ""

        val finalBody = if (!hasRuntime) {
            body.replaceFirst(
                ":\nDisposable {",
                ":\nDisposableLike {",
            )
        } else body

        targetDir.resolve("$name.kt")
            .also { check(!it.exists()) { "Duplicated file: ${it.name}" } }
            .writeCode(fileContent(annotations, toCommonBody(finalBody)))
    }
}

private fun toCommonBody(
    body: String,
): String =
    body.replace("<String>", "<JsString>")
        .replace("<String?>", "<JsString?>")
        .replace("<String,", "<JsString,")
        .replace(", String>", ", JsString>")
        .replace(", String?>", ", JsString?>")
        .replace("<Double>", "<JsDouble>")
        .replace("<Double,", "<JsDouble,")
        .replace(", Double>", ", JsDouble>")
        .replace("<Double?>", "<JsDouble?>")
        .replace("<Int>", "<JsInt>")
        .replace("<Int?>", "<JsInt?>")
        .replace("<Int,", "<JsInt,")
        .replace(", Int>", ", JsInt>")
        .replace("<Boolean>", "<JsBoolean>")
        .replace(", Boolean?>", ", JsBoolean?>")

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
        import js.numbers.JsDouble
        import js.numbers.JsInt
        import js.numbers.JsInt53
        import js.date.Date
        import js.iterable.AsyncIterable
        import js.iterable.JsIterable
        import js.errors.JsError
        import js.objects.ReadonlyRecord
        import js.objects.Record
        import js.promise.PromiseLike
        import js.promise.PromiseResult
        import js.reflect.JsExternalInheritorsOnly
        import js.regexp.RegExp
        import js.typedarrays.Uint32Array
        import js.typedarrays.Uint8Array
        import js.void.Void

        import kotlinx.js.JsPlainObject
        """.trimIndent(),
        body,
    ).filter { it.isNotEmpty() }
        .joinToString("\n\n")

    return result
}
