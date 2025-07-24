// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.JsAny
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Inlay hint information.
 */
open external class InlayHint {
    /**
     * The position of this hint.
     */
    var position: Position

    /**
     * The label of this hint. A human readable string or an array of {@link InlayHintLabelPart label parts}.
     *
     * *Note* that neither the string nor the label part can be empty.
     */
    var label: JsAny /* string | InlayHintLabelPart[] */

    /**
     * The tooltip text when you hover over this item.
     *
     * *Note* that this property can be set late during
     * {@link InlayHintsProvider.resolveInlayHint resolving} of inlay hints.
     */
    var tooltip: JsAny /* string | MarkdownString */?

    /**
     * The kind of this hint. The inlay hint kind defines the appearance of this inlay hint.
     */
    var kind: InlayHintKind?

    /**
     * Optional {@link TextEdit text edits} that are performed when accepting this inlay hint. The default
     * gesture for accepting an inlay hint is the double click.
     *
     * *Note* that edits are expected to change the document so that the inlay hint (or its nearest variant) is
     * now part of the document and the inlay hint itself is now obsolete.
     *
     * *Note* that this property can be set late during
     * {@link InlayHintsProvider.resolveInlayHint resolving} of inlay hints.
     */
    var textEdits: ReadonlyArray<TextEdit>?

    /**
     * Render padding before the hint. Padding will use the editor's background color,
     * not the background color of the hint itself. That means padding can be used to visually
     * align/separate an inlay hint.
     */
    var paddingLeft: Boolean?

    /**
     * Render padding after the hint. Padding will use the editor's background color,
     * not the background color of the hint itself. That means padding can be used to visually
     * align/separate an inlay hint.
     */
    var paddingRight: Boolean?

    /**
     * Creates a new inlay hint.
     *
     * @param position The position of the hint.
     * @param label The label of the hint.
     * @param kind The {@link InlayHintKind kind} of the hint.
     */
    constructor(
        position: Position,
        label: JsAny, /* string | InlayHintLabelPart[] */
        kind: InlayHintKind = definedExternally,
    )
}
