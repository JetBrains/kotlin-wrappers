// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package popper.core

import seskar.js.JsValue

sealed external interface PositioningStrategy {
    companion object {
        @JsValue("absolute")
        val absolute: PositioningStrategy

        @JsValue("fixed")
        val fixed: PositioningStrategy
    }
}
