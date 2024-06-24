// Automatically generated - do not modify!

package typescript

/**
 * Represents a set of signature help items, and the preferred item that should be selected.
 */
sealed external interface SignatureHelpItems {
    var items: js.array.ReadonlyArray<SignatureHelpItem>
    var applicableSpan: TextSpan
    var selectedItemIndex: Double
    var argumentIndex: Double
    var argumentCount: Double
}
