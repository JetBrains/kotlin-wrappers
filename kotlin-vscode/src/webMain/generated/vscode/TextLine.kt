// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject

/**
 * Represents a line of text, such as a line of source code.
 *
 * TextLine objects are __immutable__. When a [document][TextDocument] changes,
 * previously retrieved lines will not represent the latest state.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextLine)
 */
@JsPlainObject
external interface TextLine {
    /**
     * The zero-based line number.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextLine.lineNumber)
     */
    val lineNumber: Int

    /**
     * The text of this line without the line separator characters.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextLine.text)
     */
    val text: String

    /**
     * The range this line covers without the line separator characters.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextLine.range)
     */
    val range: Range

    /**
     * The range this line covers with the line separator characters.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextLine.rangeIncludingLineBreak)
     */
    val rangeIncludingLineBreak: Range

    /**
     * The offset of the first character which is not a whitespace character as defined
     * by `/\s/`. **Note** that if a line is all whitespace the length of the line is returned.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextLine.firstNonWhitespaceCharacterIndex)
     */
    val firstNonWhitespaceCharacterIndex: Int

    /**
     * Whether this line is whitespace only, shorthand
     * for [TextLine.firstNonWhitespaceCharacterIndex] === [TextLine.text.length][TextLine.text].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextLine.isEmptyOrWhitespace)
     */
    val isEmptyOrWhitespace: Boolean
}
