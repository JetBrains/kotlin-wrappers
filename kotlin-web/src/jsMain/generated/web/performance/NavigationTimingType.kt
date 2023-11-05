// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.performance

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface NavigationTimingType {
    companion object {
        @JsValue("back_forward")
        val back_forward: NavigationTimingType

        @JsValue("navigate")
        val navigate: NavigationTimingType

        @JsValue("prerender")
        val prerender: NavigationTimingType

        @JsValue("reload")
        val reload: NavigationTimingType
    }
}
