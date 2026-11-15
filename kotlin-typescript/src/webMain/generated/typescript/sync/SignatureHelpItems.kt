// Automatically generated - do not modify!

package typescript.sync

import typescript.ast.TextSpan

/**
 * Represents a set of signature help items, and the preferred item that should be selected.
 */
@kotlinx.js.JsPlainObject
external interface SignatureHelpItems {
    var items: js.array.ReadonlyArray<SignatureHelpItem>
    var applicableSpan: TextSpan
    var selectedItemIndex: Int
    var argumentIndex: Int
    var argumentCount: Int
}
