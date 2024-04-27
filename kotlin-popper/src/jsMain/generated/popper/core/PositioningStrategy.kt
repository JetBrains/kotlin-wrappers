// Automatically generated - do not modify!

package popper.core

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface PositioningStrategy {
    companion object {
        @JsValue("absolute")
        val absolute: PositioningStrategy

        @JsValue("fixed")
        val fixed: PositioningStrategy
    }
}
