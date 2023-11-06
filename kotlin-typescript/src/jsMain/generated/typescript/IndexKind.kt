// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsUnion

@JsUnion
sealed external interface IndexKind {
    companion object {
        @JsIntValue(0)
        val String: IndexKind

        @JsIntValue(1)
        val Number: IndexKind
    }
}
