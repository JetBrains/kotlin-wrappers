// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject

/**
 * Additional information about the paste operation.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentPasteEditContext)
 */
@JsPlainObject
external interface DocumentPasteEditContext {
    /**
     * Requested kind of paste edits to return.
     *
     * When a explicit kind if requested by [PasteAs][DocumentPasteTriggerKind.PasteAs], providers are
     * encourage to be more flexible when generating an edit of the requested kind.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentPasteEditContext.only)
     */
    val only: DocumentDropOrPasteEditKind?

    /**
     * The reason why paste edits were requested.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentPasteEditContext.triggerKind)
     */
    val triggerKind: DocumentPasteTriggerKind
}
