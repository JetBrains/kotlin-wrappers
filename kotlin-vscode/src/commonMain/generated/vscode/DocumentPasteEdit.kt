// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * An edit the applies a paste operation.
 */
open external class DocumentPasteEdit {
    /**
     * Human readable label that describes the edit.
     */
//  title: string

    /**
     * {@link DocumentDropOrPasteEditKind Kind} of the edit.
     */
//  kind: DocumentDropOrPasteEditKind

    /**
     * The text or snippet to insert at the pasted locations.
     *
     * If your edit requires more advanced insertion logic, set this to an empty string and provide an {@link DocumentPasteEdit.additionalEdit additional edit} instead.
     */
//  insertText: string | SnippetString

    /**
     * An optional additional edit to apply on paste.
     */
//  additionalEdit?: WorkspaceEdit

    /**
     * Controls ordering when multiple paste edits can potentially be applied.
     *
     * If this edit yields to another, it will be shown lower in the list of possible paste edits shown to the user.
     */
//  yieldTo?: readonly DocumentDropOrPasteEditKind[]

    /**
     * Create a new paste edit.
     *
     * @param insertText The text or snippet to insert at the pasted locations.
     * @param title Human readable label that describes the edit.
     * @param kind {@link DocumentDropOrPasteEditKind Kind} of the edit.
     */
//  constructor(insertText: string | SnippetString, title: string, kind: DocumentDropOrPasteEditKind)
}
