// Automatically generated - do not modify!

package vscode

/**
 * Represents a line of text, such as a line of source code.
 *
 * TextLine objects are __immutable__. When a [document][TextDocument] changes,
 * previously retrieved lines will not represent the latest state.
 */
external interface TextLine {
    /**
     * The zero-based line number.
     */
    val lineNumber: Int

    /**
     * The text of this line without the line separator characters.
     */
    val text: String

    /**
     * The range this line covers without the line separator characters.
     */
    val range: Range

    /**
     * The range this line covers with the line separator characters.
     */
    val rangeIncludingLineBreak: Range

    /**
     * The offset of the first character which is not a whitespace character as defined
     * by `/\s/`. **Note** that if a line is all whitespace the length of the line is returned.
     */
    val firstNonWhitespaceCharacterIndex: Int

    /**
     * Whether this line is whitespace only, shorthand
     * for [TextLine.firstNonWhitespaceCharacterIndex] === [TextLine.text.length][TextLine.text].
     */
    val isEmptyOrWhitespace: Boolean
}
