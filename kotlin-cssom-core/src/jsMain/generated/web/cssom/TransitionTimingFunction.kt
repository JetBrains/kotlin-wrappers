// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface TransitionTimingFunction {
    companion object {
        @JsValue("ease")
        val ease: TransitionTimingFunction

        @JsValue("ease-in")
        val easeIn: TransitionTimingFunction

        @JsValue("ease-in-out")
        val easeInOut: TransitionTimingFunction

        @JsValue("ease-out")
        val easeOut: TransitionTimingFunction

        @JsValue("step-end")
        val stepEnd: TransitionTimingFunction

        @JsValue("step-start")
        val stepStart: TransitionTimingFunction

        @JsValue("linear")
        val linear: TransitionTimingFunction
    }
}
