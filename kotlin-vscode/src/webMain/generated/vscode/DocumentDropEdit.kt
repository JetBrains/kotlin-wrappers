// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsAny
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * An edit operation applied [on drop][DocumentDropEditProvider].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentDropEdit)
 */
open external class DocumentDropEdit {
    /**
     * Human readable label that describes the edit.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentDropEdit.title)
     */
    var title: String?

    /**
     * [Kind][DocumentDropOrPasteEditKind] of the edit.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentDropEdit.kind)
     */
    var kind: DocumentDropOrPasteEditKind?

    /**
     * Controls the ordering or multiple edits. If this provider yield to edits, it will be shown lower in the list.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentDropEdit.yieldTo)
     */
    var yieldTo: ReadonlyArray<DocumentDropOrPasteEditKind>?

    /**
     * The text or snippet to insert at the drop location.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentDropEdit.insertText)
     */
    var insertText: JsAny /* string | SnippetString */

    /**
     * An optional additional edit to apply on drop.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentDropEdit.additionalEdit)
     */
    var additionalEdit: WorkspaceEdit?

    /**
     * @param insertText The text or snippet to insert at the drop location.
     * @param title Human readable label that describes the edit.
     * @param kind [Kind][DocumentDropOrPasteEditKind] of the edit.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentDropEdit.constructor)
     */
    constructor(
        insertText: String,
        title: String = definedExternally,
        kind: DocumentDropOrPasteEditKind = definedExternally,
    )

    constructor(
        insertText: SnippetString,
        title: String = definedExternally,
        kind: DocumentDropOrPasteEditKind = definedExternally,
    )
}
