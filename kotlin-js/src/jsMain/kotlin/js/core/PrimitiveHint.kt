@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.core

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface PrimitiveHint {
    companion object {
        @JsValue("number")
        val number: PrimitiveHint

        @JsValue("string")
        val string: PrimitiveHint

        @JsValue("default")
        val default: PrimitiveHint
    }
}
