// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.locks

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface LockMode {
    companion object {
        @JsValue("exclusive")
        val exclusive: LockMode

        @JsValue("shared")
        val shared: LockMode
    }
}
