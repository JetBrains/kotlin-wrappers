// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.wakelock

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface WakeLockType {
    companion object {
        @JsValue("screen")
        val screen: WakeLockType
    }
}
