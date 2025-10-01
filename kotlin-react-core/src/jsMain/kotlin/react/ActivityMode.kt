@file:JsModule("react")

package react

import seskar.js.JsValue

sealed external interface ActivityMode {
    companion object {
        @JsValue("hidden")
        val hidden: ActivityMode

        @JsValue("visible")
        val visible: ActivityMode
    }
}
