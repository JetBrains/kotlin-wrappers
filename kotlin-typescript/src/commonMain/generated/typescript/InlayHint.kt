// Automatically generated - do not modify!

package typescript

sealed external interface InlayHint {
    /** This property will be the empty string when displayParts is set. */
    var text: String
    var position: Double
    var kind: InlayHintKind
    var whitespaceBefore: Boolean?
    var whitespaceAfter: Boolean?
    var displayParts: js.array.ReadonlyArray<InlayHintDisplayPart>?
}
