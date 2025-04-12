package karakum.popper

import karakum.common.ConversionResult

internal fun convertDefinitions(
    source: String,
): Sequence<ConversionResult> {
    return source
        .splitToSequence("\nexport declare type ", "\ndeclare type ")
        .drop(1)
        .mapNotNull { content ->
            val delimiter = sequenceOf(
                " = EventTarget & {\n", // VisualViewport
                " = {\n",
                " = ",
            ).first { it in content }

            val name = content.substringBefore(delimiter)
            val bodySource = content.substringAfter(delimiter)

            when (delimiter) {
                " = " -> {
                    val body = bodySource
                        .removeSuffix(";")

                    convertType(name, body)
                }

                else -> {
                    val body = bodySource
                        .substringBefore(";\n};\n")
                        .removeSuffix(";\n};")
                        .trimIndent()

                    convertInterface(name, body)
                }
            }
        }
}
