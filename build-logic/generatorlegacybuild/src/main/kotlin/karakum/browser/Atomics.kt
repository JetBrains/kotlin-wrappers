package karakum.browser

import karakum.common.TYPED_ARRAYS
import karakum.common.withDefaultLineBreaks
import java.io.File

internal fun atomicsDeclarations(
    definitionsDir: File,
): ConversionResult {
    val members = atomicsContent(definitionsDir)
        .splitToSequence("\n")
        .map { line -> if (line.isEmpty() || "*" in line) line else atomicsFunction(line) }
        .joinToString("\n")

    val body = """
    external object Atomics {
        $members
    }
    """.trimIndent()

    return ConversionResult(
        name = "Atomics",
        body = body,
        pkg = "js.atomic",
    )
}

private val TYPED_ARRAY_UNION = "Int8Array | Uint8Array | Int16Array | Uint16Array | Int32Array | Uint32Array"

internal fun atomicsFunction(
    source: String,
): String {
    var content = source
        .removeSuffix(";")
        .replace(
            "{ async: false; value: \"not-equal\" | \"timed-out\"; } | { async: true; value: Promise<\"ok\" | \"timed-out\">; }",
            "WaitResult",
        )
        .replace(""""ok" | "not-equal" | "timed-out"""", "WaitStatus")
        .replace(", ", ",\n")
        .replace("index: number", "index: Int")
        .replace(": bigint", ": BigInt")
        .replace(": boolean", ": Boolean")
        .replace("count?: number", "count: Int = definedExternally")
        .replace("timeout?: number", "timeout: Int = definedExternally")

    if (TYPED_ARRAY_UNION in content) {
        content = "<T : JsAny> " +
                content.replace(TYPED_ARRAY_UNION, "TypedArray<*, *, *, T>")
                    .replace("value: number", "value: T")
                    .replace("expectedValue: number", "expectedValue: T")
                    .replace("replacementValue: number", "replacementValue: T")
                    .replace("): number", "): T")
    }

    content = TYPED_ARRAYS.fold(content) { acc, typedArray ->
        acc.replace(": $typedArray", ": $typedArray<*>")
    }

    content = content
        .replace("value: number", "value: Int")
        .replace("n?: number", "n: Int = definedExternally")
        .replace(": number", ": Int")
        .removeSuffix(": void")

    return "fun $content"
}

private fun atomicsContent(
    definitionsDir: File,
): String =
    definitionsDir.listFiles()!!
        .filter { it.name.endsWith(".sharedmemory.d.ts") }
        .sortedBy { file -> file.name }
        .map {
            it.readText()
                .withDefaultLineBreaks()
                .substringAfter("\ninterface Atomics {\n")
                .substringBefore("\n}")
                .replace("<ArrayBufferLike>", "")
                .trimIndent()
        }
        .flatMap { it.splitToSequence("\n\n") }
        .filter { ": BigInt64Array | BigUint64Array," !in it }
        .filter { "[Symbol.toStringTag]" !in it }
        .sortedBy { it.substringAfterLast("\n").substringBefore("(") }
        .joinToString("\n\n")
