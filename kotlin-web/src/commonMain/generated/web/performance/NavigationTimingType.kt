// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.performance

import seskar.js.JsValue

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
