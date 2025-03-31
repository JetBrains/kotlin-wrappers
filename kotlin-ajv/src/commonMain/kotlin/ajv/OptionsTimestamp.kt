@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package ajv

import seskar.js.JsValue

sealed external interface OptionsTimestamp {
    companion object {
        @JsValue("string")
        val string: OptionsTimestamp

        @JsValue("date")
        val date: OptionsTimestamp
    }
}
