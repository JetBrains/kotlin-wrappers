// Automatically generated - do not modify!

package vscode

/**
 * A value-object that contains contextual information when requesting inline values from a InlineValuesProvider.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineValueContext)
 */
external interface InlineValueContext {
    /**
     * The stack frame (as a DAP Id) where the execution has stopped.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineValueContext.frameId)
     */
    val frameId: Int

    /**
     * The document range where execution has stopped.
     * Typically the end position of the range denotes the line where the inline values are shown.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineValueContext.stoppedLocation)
     */
    val stoppedLocation: Range
}
