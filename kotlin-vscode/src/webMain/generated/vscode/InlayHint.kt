// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsAny
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Inlay hint information.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlayHint)
 */
open external class InlayHint {
    /**
     * The position of this hint.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlayHint.position)
     */
    var position: Position

    /**
     * The label of this hint. A human readable string or an array of [label parts][InlayHintLabelPart].
     *
     * *Note* that neither the string nor the label part can be empty.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlayHint.label)
     */
    var label: JsAny /* string | InlayHintLabelPart[] */

    /**
     * The tooltip text when you hover over this item.
     *
     * *Note* that this property can be set late during
     * [resolving][InlayHintsProvider.resolveInlayHint] of inlay hints.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlayHint.tooltip)
     */
    var tooltip: JsAny /* string | MarkdownString */?

    /**
     * The kind of this hint. The inlay hint kind defines the appearance of this inlay hint.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlayHint.kind)
     */
    var kind: InlayHintKind?

    /**
     * Optional [text edits][TextEdit] that are performed when accepting this inlay hint. The default
     * gesture for accepting an inlay hint is the double click.
     *
     * *Note* that edits are expected to change the document so that the inlay hint (or its nearest variant) is
     * now part of the document and the inlay hint itself is now obsolete.
     *
     * *Note* that this property can be set late during
     * [resolving][InlayHintsProvider.resolveInlayHint] of inlay hints.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlayHint.textEdits)
     */
    var textEdits: ReadonlyArray<TextEdit>?

    /**
     * Render padding before the hint. Padding will use the editor's background color,
     * not the background color of the hint itself. That means padding can be used to visually
     * align/separate an inlay hint.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlayHint.paddingLeft)
     */
    var paddingLeft: Boolean?

    /**
     * Render padding after the hint. Padding will use the editor's background color,
     * not the background color of the hint itself. That means padding can be used to visually
     * align/separate an inlay hint.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlayHint.paddingRight)
     */
    var paddingRight: Boolean?

    /**
     * Creates a new inlay hint.
     *
     * @param position The position of the hint.
     * @param label The label of the hint.
     * @param kind The [kind][InlayHintKind] of the hint.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlayHint.constructor)
     */
    constructor(
        position: Position,
        label: JsAny, /* string | InlayHintLabelPart[] */
        kind: InlayHintKind = definedExternally,
    )
}
