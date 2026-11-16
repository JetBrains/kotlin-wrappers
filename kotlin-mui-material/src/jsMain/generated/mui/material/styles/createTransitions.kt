// Automatically generated - do not modify!

package mui.material.styles

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.cssom.Transition

@JsPlainObject
external interface Easing {
    val easeInOut: String

    val easeOut: String

    val easeIn: String

    val sharp: String
}

@JsPlainObject
external interface Duration {
    val shortest: Number

    val shorter: Number

    val short: Number

    val standard: Number

    val complex: Number

    val enteringScreen: Number

    val leavingScreen: Number
}

@JsPlainObject
external interface TransitionsOptions : mui.system.Transitions {
    val easing: Easing?

    val duration: Duration?

    val create: ((props: ReadonlyArray<String>, options: TransitionCreateOptions?) -> Transition)?

    val getAutoHeightDuration: ((height: Number) -> Number)?
}

@JsPlainObject
external interface Transitions : mui.system.Transitions {
    val easing: Easing

    val duration: Duration

    val create: (props: ReadonlyArray<String>, options: TransitionCreateOptions?) -> Transition

    val getAutoHeightDuration: (height: Number) -> Number
}

@JsPlainObject
external interface TransitionCreateOptions {
    val duration: Number?
    val easing: String?
    val delay: Number?
}
