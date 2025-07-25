// Automatically generated - do not modify!

package vscode

/**
 * An event describing an individual change in the text of a [document][TextDocument].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentContentChangeEvent)
 */
external interface TextDocumentContentChangeEvent {
    /**
     * The range that got replaced.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentContentChangeEvent.range)
     */
    val range: Range

    /**
     * The offset of the range that got replaced.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentContentChangeEvent.rangeOffset)
     */
    val rangeOffset: Int

    /**
     * The length of the range that got replaced.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentContentChangeEvent.rangeLength)
     */
    val rangeLength: Int

    /**
     * The new text for the range.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TextDocumentContentChangeEvent.text)
     */
    val text: String
}
