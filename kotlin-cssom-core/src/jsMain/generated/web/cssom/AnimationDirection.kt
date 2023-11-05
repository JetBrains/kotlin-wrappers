// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface AnimationDirection {
    companion object {
        @JsValue("alternate")
        val alternate: AnimationDirection

        @JsValue("alternate-reverse")
        val alternateReverse: AnimationDirection

        @JsValue("normal")
        val normal: AnimationDirection

        @JsValue("reverse")
        val reverse: AnimationDirection
    }
}
