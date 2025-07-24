// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A line based folding range. To be valid, start and end line must be bigger than zero and smaller than the number of lines in the document.
 * Invalid ranges will be ignored.
 */
open external class FoldingRange {
    /**
     * The zero-based start line of the range to fold. The folded area starts after the line's last character.
     * To be valid, the end must be zero or larger and smaller than the number of lines in the document.
     */
    var start: Int

    /**
     * The zero-based end line of the range to fold. The folded area ends with the line's last character.
     * To be valid, the end must be zero or larger and smaller than the number of lines in the document.
     */
    var end: Int

    /**
     * Describes the [Kind} of the folding range such as {@link FoldingRangeKind.Comment Comment][FoldingRangeKind] or
     * [Region][FoldingRangeKind.Region]. The kind is used to categorize folding ranges and used by commands
     * like 'Fold all comments'. See
     * [FoldingRangeKind] for an enumeration of all kinds.
     * If not set, the range is originated from a syntax element.
     */
    var kind: FoldingRangeKind?

    /**
     * Creates a new folding range.
     *
     * @param start The start line of the folded range.
     * @param end The end line of the folded range.
     * @param kind The kind of the folding range.
     */
    constructor(
        start: Int,
        end: Int,
        kind: FoldingRangeKind = definedExternally,
    )
}
