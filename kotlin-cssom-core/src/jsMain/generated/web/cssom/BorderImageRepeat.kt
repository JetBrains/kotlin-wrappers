// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface BorderImageRepeat {
    companion object {
        @JsValue("repeat")
        val repeat: BorderImageRepeat

        @JsValue("round")
        val round: BorderImageRepeat

        @JsValue("space")
        val space: BorderImageRepeat

        @JsValue("stretch")
        val stretch: BorderImageRepeat
    }
}
