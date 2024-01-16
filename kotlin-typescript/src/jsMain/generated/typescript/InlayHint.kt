// Automatically generated - do not modify!

package typescript

import js.array.ReadonlyArray

sealed external interface InlayHint {
    /** This property will be the empty string when displayParts is set. */
    var text: String
    var position: Int
    var kind: InlayHintKind
    var whitespaceBefore: Boolean?
    var whitespaceAfter: Boolean?
    var displayParts: ReadonlyArray<InlayHintDisplayPart>?
}
