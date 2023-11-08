// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface BackgroundRepeat {
    companion object {
        @JsValue("no-repeat")
        val noRepeat: BackgroundRepeat

        @JsValue("repeat")
        val repeat: BackgroundRepeat

        @JsValue("repeat-x")
        val repeatX: BackgroundRepeat

        @JsValue("repeat-y")
        val repeatY: BackgroundRepeat

        @JsValue("round")
        val round: BackgroundRepeat

        @JsValue("space")
        val space: BackgroundRepeat
    }
}
