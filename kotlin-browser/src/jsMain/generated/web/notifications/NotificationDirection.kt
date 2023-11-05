// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.notifications

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface NotificationDirection {
    companion object {
        @JsValue("auto")
        val auto: NotificationDirection

        @JsValue("ltr")
        val ltr: NotificationDirection

        @JsValue("rtl")
        val rtl: NotificationDirection
    }
}
