// Automatically generated - do not modify!

package mui.material.styles

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.cssom.Transition

external interface Easing {
    var easeInOut: String

    var easeOut: String

    var easeIn: String

    var sharp: String
}

external interface Duration {
    var shortest: Number

    var shorter: Number

    var short: Number

    var standard: Number

    var complex: Number

    var enteringScreen: Number

    var leavingScreen: Number
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

external interface TransitionCreateOptions {
    var duration: Number?
    var easing: String?
    var delay: Number?
}
