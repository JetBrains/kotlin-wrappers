// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

/**
 * Represents an end of line character sequence in a {@link TextDocument document}.
 */
sealed /* enum */
external interface EndOfLine {
    companion object {
        /**
         * The line feed `\n` character.
         */
        val LF: EndOfLine // 1

        /**
         * The carriage return line feed `\r\n` sequence.
         */
        val CRLF: EndOfLine // 2
    }
}
