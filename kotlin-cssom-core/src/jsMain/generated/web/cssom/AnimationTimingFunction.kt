// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface AnimationTimingFunction {
    companion object {
        @JsValue("ease")
        val ease: AnimationTimingFunction

        @JsValue("ease-in")
        val easeIn: AnimationTimingFunction

        @JsValue("ease-in-out")
        val easeInOut: AnimationTimingFunction

        @JsValue("ease-out")
        val easeOut: AnimationTimingFunction

        @JsValue("step-end")
        val stepEnd: AnimationTimingFunction

        @JsValue("step-start")
        val stepStart: AnimationTimingFunction

        @JsValue("linear")
        val linear: AnimationTimingFunction
    }
}
