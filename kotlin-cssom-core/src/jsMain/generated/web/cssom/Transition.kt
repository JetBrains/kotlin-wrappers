// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

import seskar.js.JsValue

sealed external interface Transition {
    companion object {
        @JsValue("ease")
        val ease: Transition

        @JsValue("ease-in")
        val easeIn: Transition

        @JsValue("ease-in-out")
        val easeInOut: Transition

        @JsValue("ease-out")
        val easeOut: Transition

        @JsValue("step-end")
        val stepEnd: Transition

        @JsValue("step-start")
        val stepStart: Transition

        @JsValue("linear")
        val linear: Transition

        @JsValue("all")
        val all: Transition

        @JsValue("allow-discrete")
        val allowDiscrete: Transition

        @JsValue("normal")
        val normal: Transition
    }
}

inline fun Transition(
    property: TransitionProperty,
    duration: Time,
    timingFunction: TransitionTimingFunction,
): Transition =
    "$property $duration $timingFunction".unsafeCast<Transition>()

inline fun Transition(
    property: TransitionProperty,
    duration: Time,
    delay: Time,
): Transition =
    "$property $duration $delay".unsafeCast<Transition>()

inline fun Transition(
    property: TransitionProperty,
    duration: Time,
    timingFunction: TransitionTimingFunction,
    delay: Time,
): Transition =
    "$property $duration $timingFunction $delay".unsafeCast<Transition>()
