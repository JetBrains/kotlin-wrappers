// Automatically generated - do not modify!

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface SignatureKind {
    companion object {
        @JsIntValue(0)
        val Call: SignatureKind

        @JsIntValue(1)
        val Construct: SignatureKind
    }
}
