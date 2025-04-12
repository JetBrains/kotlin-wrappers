package karakum.common

import java.io.File

private const val LINE_BREAK = "\n"

internal const val GENERATOR_COMMENT = "Automatically generated - do not modify!"

internal fun File.writeCode(text: String) =
    writeText(text.ensureEndLineBreak())

private fun String.ensureEndLineBreak(): String {
    if (endsWith(LINE_BREAK))
        return this

    return this + LINE_BREAK
}
