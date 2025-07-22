// Automatically generated - do not modify!

package vscode

/**
 * A value-object that contains contextual information when requesting inline values from a InlineValuesProvider.
 */
external interface InlineValueContext {
    /**
     * The stack frame (as a DAP Id) where the execution has stopped.
     */
    val frameId: Int

    /**
     * The document range where execution has stopped.
     * Typically the end position of the range denotes the line where the inline values are shown.
     */
    val stoppedLocation: Range
}
