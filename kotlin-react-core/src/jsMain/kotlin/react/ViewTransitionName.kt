// Automatically generated - do not modify!

package react

import js.reflect.unsafeCast
import react.canary.ReactCanary
import seskar.js.JsValue

@ReactCanary
sealed external interface ViewTransitionName {
    companion object {
        @JsValue("auto")
        val auto: ViewTransitionName
    }
}

@ReactCanary
inline fun ViewTransitionName(
    value: String,
): ViewTransitionName =
    unsafeCast(value)
