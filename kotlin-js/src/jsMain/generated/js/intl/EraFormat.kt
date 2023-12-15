// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface EraFormat {
    companion object {
        @JsValue("long")
        val long: EraFormat

        @JsValue("short")
        val short: EraFormat

        @JsValue("narrow")
        val narrow: EraFormat
    }
}
