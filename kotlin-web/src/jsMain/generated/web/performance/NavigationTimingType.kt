// Automatically generated - do not modify!

package web.performance

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
