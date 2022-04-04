// Automatically generated - do not modify!

package mui.material.styles

import kotlinx.js.ReadonlyArray

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

external interface TransitionsOptions {
    var easing: Easing?

    var duration: Duration?

    var create: ((props: ReadonlyArray<String>, options: TransitionCreateOptions?) -> String)?

    var getAutoHeightDuration: ((height: Number) -> Number)?
}

external interface Transitions {
    var easing: Easing

    var duration: Duration

    var create: (props: ReadonlyArray<String>, options: TransitionCreateOptions?) -> String

    var getAutoHeightDuration: (height: Number) -> Number
}

external interface TransitionCreateOptions {
    var duration: Number?
    var easing: String?
    var delay: Number?
}
