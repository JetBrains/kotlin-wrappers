// Automatically generated - do not modify!

package web.navigation

import seskar.js.JsValue

sealed external interface NavigationType {
    companion object {
        @JsValue("push")
        val push: NavigationType

        @JsValue("reload")
        val reload: NavigationType

        @JsValue("replace")
        val replace: NavigationType

        @JsValue("traverse")
        val traverse: NavigationType
    }
}
