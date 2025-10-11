// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsAny
import kotlin.js.JsModule

/**
 * An edit the applies a paste operation.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentPasteEdit)
 */
open external class DocumentPasteEdit {
    /**
     * Human readable label that describes the edit.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentPasteEdit.title)
     */
    var title: String

    /**
     * [Kind][DocumentDropOrPasteEditKind] of the edit.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentPasteEdit.kind)
     */
    var kind: DocumentDropOrPasteEditKind

    /**
     * The text or snippet to insert at the pasted locations.
     *
     * If your edit requires more advanced insertion logic, set this to an empty string and provide an [additional edit][DocumentPasteEdit.additionalEdit] instead.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentPasteEdit.insertText)
     */
    var insertText: JsAny /* string | SnippetString */

    /**
     * An optional additional edit to apply on paste.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentPasteEdit.additionalEdit)
     */
    var additionalEdit: WorkspaceEdit?

    /**
     * Controls ordering when multiple paste edits can potentially be applied.
     *
     * If this edit yields to another, it will be shown lower in the list of possible paste edits shown to the user.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentPasteEdit.yieldTo)
     */
    var yieldTo: ReadonlyArray<DocumentDropOrPasteEditKind>?

    /**
     * Create a new paste edit.
     *
     * @param insertText The text or snippet to insert at the pasted locations.
     * @param title Human readable label that describes the edit.
     * @param kind [Kind][DocumentDropOrPasteEditKind] of the edit.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentPasteEdit.constructor)
     */
    constructor(
        insertText: String,
        title: String,
        kind: DocumentDropOrPasteEditKind,
    )

    constructor(
        insertText: SnippetString,
        title: String,
        kind: DocumentDropOrPasteEditKind,
    )
}
