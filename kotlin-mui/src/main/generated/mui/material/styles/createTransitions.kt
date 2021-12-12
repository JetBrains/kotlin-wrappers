// Automatically generated - do not modify!

@file:JsModule("@mui/material/styles/createTransitions")
@file:JsNonModule

package mui.material.styles

import kotlinext.js.ReadonlyArray

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
    var easing: dynamic

    var duration: dynamic

    var create: ((props: ReadonlyArray<String>?, options: dynamic) -> String)?

    var getAutoHeightDuration: ((height: Number) -> Number)?
}

external interface Transitions {
    var easing: dynamic

    var duration: dynamic

    var create: dynamic

    var getAutoHeightDuration: dynamic
}
