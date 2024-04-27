// Automatically generated - do not modify!

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
