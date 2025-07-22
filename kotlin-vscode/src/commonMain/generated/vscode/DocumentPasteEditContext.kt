// Automatically generated - do not modify!

package vscode

/**
 * Additional information about the paste operation.
 */
external interface DocumentPasteEditContext {
    /**
     * Requested kind of paste edits to return.
     *
     * When a explicit kind if requested by {@linkcode DocumentPasteTriggerKind.PasteAs PasteAs}, providers are
     * encourage to be more flexible when generating an edit of the requested kind.
     */
    val only: DocumentDropOrPasteEditKind

    /**
     * The reason why paste edits were requested.
     */
    val triggerKind: DocumentPasteTriggerKind
}
