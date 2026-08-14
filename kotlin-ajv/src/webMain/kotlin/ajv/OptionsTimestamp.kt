@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package ajv

import js.union.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface OptionsTimestamp {
    companion object {
        @JsValue("string")
        val string: OptionsTimestamp

        @JsValue("date")
        val date: OptionsTimestamp
    }
}
