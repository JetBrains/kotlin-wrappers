package karakum.vscode

import karakum.common.GENERATOR_COMMENT
import karakum.common.Suppress.INTERFACE_WITH_SUPERCLASS
import karakum.common.Suppress.NESTED_CLASS_IN_EXTERNAL_INTERFACE
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
                -> listOfNotNull(
                """@file:JsModule("vscode")""",
                fileSuppress(NESTED_CLASS_IN_EXTERNAL_INTERFACE)
                    .takeIf { "sealed /* enum */" in body }
            ).joinToString("\n\n")

            ":\nDisposable {" in body
                -> fileSuppress(INTERFACE_WITH_SUPERCLASS)

            else -> ""
        }

        targetDir.resolve("$name.kt")
            .also { check(!it.exists()) { "Duplicated file: ${it.name}" } }
            .writeCode(fileContent(annotations, toCommonBody(body)))
    }
}

private fun toCommonBody(
    body: String,
): String =
    body.replace("<String>", "<JsString>")
        .replace("<String,", "<JsString,")
        .replace(", String>", ", JsString>")
        .replace(", String?>", ", JsString?>")
        .replace("<Double>", "<JsDouble>")
        .replace("<Double,", "<JsDouble,")
        .replace(", Double>", ", JsDouble>")
        .replace("<Double?>", "<JsDouble?>")
        .replace("<Int>", "<JsInt>")
        .replace("<Int,", "<JsInt,")
        .replace(", Int>", ", JsInt>")
        .replace("<Boolean>", "<JsBoolean>")

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
        import js.core.JsBoolean
        import js.core.JsDouble
        import js.core.JsInt
        import js.core.JsString
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

        import kotlin.js.JsModule
        import kotlin.js.definedExternally
        """.trimIndent(),
        body,
    ).filter { it.isNotEmpty() }
        .joinToString("\n\n")

    return result
}
