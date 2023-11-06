// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsUnion

@JsUnion
sealed external interface SignatureKind {
    companion object {
        @JsIntValue(0)
        val Call: SignatureKind

        @JsIntValue(1)
        val Construct: SignatureKind
    }
}
