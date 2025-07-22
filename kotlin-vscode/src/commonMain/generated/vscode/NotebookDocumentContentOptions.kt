// Automatically generated - do not modify!

package vscode

/**
 * Notebook content options define what parts of a notebook are persisted. Note
 *
 * For instance, a notebook serializer can opt-out of saving outputs and in that case the editor doesn't mark a
 * notebooks as {@link NotebookDocument.isDirty dirty} when its output has changed.
 */
external interface NotebookDocumentContentOptions {
    /**
     * Controls if output change events will trigger notebook document content change events and
     * if it will be used in the diff editor, defaults to false. If the content provider doesn't
     * persist the outputs in the file document, this should be set to true.
     */
//  transientOutputs?: boolean

    /**
     * Controls if a cell metadata property change event will trigger notebook document content
     * change events and if it will be used in the diff editor, defaults to false. If the
     * content provider doesn't persist a metadata property in the file document, it should be
     * set to true.
     */
//  transientCellMetadata?: { [key: string]: boolean | undefined }

    /**
     * Controls if a document metadata property change event will trigger notebook document
     * content change event and if it will be used in the diff editor, defaults to false. If the
     * content provider doesn't persist a metadata property in the file document, it should be
     * set to true.
     */
//  transientDocumentMetadata?: { [key: string]: boolean | undefined }
}
