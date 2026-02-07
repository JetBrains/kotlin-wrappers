// Automatically generated - do not modify!

package vscode

import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject
import kotlin.js.JsBoolean
import kotlin.js.JsString

/**
 * Notebook content options define what parts of a notebook are persisted. Note
 *
 * For instance, a notebook serializer can opt-out of saving outputs and in that case the editor doesn't mark a
 * notebooks as [dirty][NotebookDocument.isDirty] when its output has changed.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentContentOptions)
 */
@JsPlainObject
external interface NotebookDocumentContentOptions {
    /**
     * Controls if output change events will trigger notebook document content change events and
     * if it will be used in the diff editor, defaults to false. If the content provider doesn't
     * persist the outputs in the file document, this should be set to true.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentContentOptions.transientOutputs)
     */
    var transientOutputs: Boolean?

    /**
     * Controls if a cell metadata property change event will trigger notebook document content
     * change events and if it will be used in the diff editor, defaults to false. If the
     * content provider doesn't persist a metadata property in the file document, it should be
     * set to true.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentContentOptions.transientCellMetadata)
     */
    var transientCellMetadata: ReadonlyRecord<JsString, JsBoolean?>?

    /**
     * Controls if a document metadata property change event will trigger notebook document
     * content change event and if it will be used in the diff editor, defaults to false. If the
     * content provider doesn't persist a metadata property in the file document, it should be
     * set to true.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookDocumentContentOptions.transientDocumentMetadata)
     */
    var transientDocumentMetadata: ReadonlyRecord<JsString, JsBoolean?>?
}
