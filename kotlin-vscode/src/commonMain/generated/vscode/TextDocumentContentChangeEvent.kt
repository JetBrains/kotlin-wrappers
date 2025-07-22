// Automatically generated - do not modify!

package vscode

/**
 * An event describing an individual change in the text of a {@link TextDocument document}.
 */
external interface TextDocumentContentChangeEvent {
    /**
     * The range that got replaced.
     */
    val range: Range

    /**
     * The offset of the range that got replaced.
     */
    val rangeOffset: Int

    /**
     * The length of the range that got replaced.
     */
    val rangeLength: Int

    /**
     * The new text for the range.
     */
    val text: String
}
