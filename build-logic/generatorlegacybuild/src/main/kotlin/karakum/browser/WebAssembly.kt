package karakum.browser

import karakum.common.CommonUnionConverter.unionBodyByConstants
import karakum.common.UnionConstant
import karakum.common.withDefaultLineBreaks

private const val VALUE_TYPE = "ValueType"

internal fun webAssemblyDeclarations(
    source: String,
): Sequence<ConversionResult> {
    val content = webAssemblyContent(source)

    val types = convertTypes(
        content = content,
        getPkg = { "web.assembly" },
    )

    val interfaces = Regex("""interface .+? \{[\s\S]*?\n}""")
        .findAll(content)
        .map { it.value }
        .groupBy { it.substringBefore(" {\n") }
        .map { (declaration, sourceParts) ->
            sourceParts.singleOrNull() ?: run {
                val body = sourceParts
                    .asSequence()
                    .map {
                        it.replace(": any\n", ": any;\n")
                            .substringAfter(" {\n")
                            .substringBefore("\n}")
                            .trimIndent()
                    }
                    .joinToString("\n")
                    .splitToSequence("\n")
                    .distinct()
                    .joinToString("\n")
                    .prependIndent("    ")

                "$declaration {\n$body\n}"
            }
        }
        .mapNotNull { src ->
            if (src.startsWith("interface ValueTypeMap {")) {
                convertValueType(source = src)
            } else {
                convertInterface(
                    source = src,
                    getStaticSource = { getStaticSource(it, content) },
                    predefinedPkg = "web.assembly",
                )?.withComment(fullSource = content, source = src)
            }
        }
        .map { result ->
            if (result.name.endsWith("Error")) {
                result.copy(
                    body = """
                        external class ${result.name}(
                            message: String = definedExternally,
                        ): JsError
                    """.trimIndent()
                )
            } else {
                result
            }
        }

    val functions = convertFunctions(
        content = content,
        getPkg = { "web.assembly" },
    )

    val constants = browserConstants(
        content = content,
        getPkg = { "web.assembly" },
    )

    return (types + interfaces + functions + constants)
        .map {
            val newBody = it.body
                .replace(
                    "external class ",
                    "@JsQualifier(\"WebAssembly\")\nexternal class ",
                )
                .replace(
                    "external fun ",
                    "@JsQualifier(\"WebAssembly\")\nexternal fun ",
                )
                .replace(
                    "external val ",
                    "@JsQualifier(\"WebAssembly\")\nexternal val ",
                )

            val lines = newBody
                .splitToSequence("\n")
                .toMutableList()

            for (i in 0..lines.size - 2) {
                val line1 = lines[i]
                val line2 = lines[i + 1]

                if (line1.startsWith("@JsName") && line2.startsWith("@JsQualifier(")) {
                    lines[i] = line2
                    lines[i + 1] = line1
                }
            }

            it.copy(body = lines.joinToString("\n"))
        }
}

private fun convertValueType(
    source: String,
): ConversionResult {
    val constants = source
        .substringAfter(" {\n")
        .substringBefore(";\n}")
        .trimIndent()
        .splitToSequence(";\n")
        .map { line ->
            val (name, type) = line.split(": ")
            val typeParameter = when (type) {
                "Function" -> "JsFunction<*, *>"
                "any" -> "JsAny?"
                "number" -> when (name) {
                    "f32" -> "JsFloat"
                    "f64" -> "JsDouble"
                    "i32" -> "JsInt"
                    else -> error("No type parameter for '$name: $type'")
                }

                "bigint" -> "BigInt"
                "never" -> "Void"
                else -> error("No type parameter for type '$type'")
            }

            UnionConstant(
                name = name,
                value = name,
                type = "$VALUE_TYPE<$typeParameter>",
            )
        }
        .toList()

    return ConversionResult(
        name = VALUE_TYPE,
        body = unionBodyByConstants("$VALUE_TYPE<T : JsAny?>", constants),
        pkg = "web.assembly",
    )
}

private fun webAssemblyContent(
    source: String,
): String =
    source
        .withDefaultLineBreaks()
        .substringAfter("\ndeclare namespace WebAssembly {\n")
        .substringBefore("\n}")
        .trimIndent()
        .splitUnion("string | string[]")
        .splitUnion("number | bigint")
        .replace("\n\n", "\n")
