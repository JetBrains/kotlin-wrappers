// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray

/**
 * An edit operation applied {@link DocumentDropEditProvider on drop}.
 */
open external class DocumentDropEdit {
    /**
     * Human readable label that describes the edit.
     */
    var title: String?

    /**
     * {@link DocumentDropOrPasteEditKind Kind} of the edit.
     */
    var kind: DocumentDropOrPasteEditKind?

    /**
     * Controls the ordering or multiple edits. If this provider yield to edits, it will be shown lower in the list.
     */
    var yieldTo: ReadonlyArray<DocumentDropOrPasteEditKind>?

    /**
     * The text or snippet to insert at the drop location.
     */
    var insertText: Any /* string | SnippetString */

    /**
     * An optional additional edit to apply on drop.
     */
    var additionalEdit: WorkspaceEdit?

    /**
     * @param insertText The text or snippet to insert at the drop location.
     * @param title Human readable label that describes the edit.
     * @param kind {@link DocumentDropOrPasteEditKind Kind} of the edit.
     */
    constructor(
        insertText: Any, /* string | SnippetString */
        title: String = definedExternally,
        kind: DocumentDropOrPasteEditKind = definedExternally,
    )
}
