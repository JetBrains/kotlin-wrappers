// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface AnimationRange {
    companion object {
        @JsValue("contain")
        val contain: AnimationRange

        @JsValue("cover")
        val cover: AnimationRange

        @JsValue("entry")
        val entry: AnimationRange

        @JsValue("entry-crossing")
        val entryCrossing: AnimationRange

        @JsValue("exit")
        val exit: AnimationRange

        @JsValue("exit-crossing")
        val exitCrossing: AnimationRange

        @JsValue("normal")
        val normal: AnimationRange
    }
}
