// Automatically generated - do not modify!

package web.locks

import seskar.js.JsValue

sealed external interface LockMode {
    companion object {
        @JsValue("exclusive")
        val exclusive: LockMode

        @JsValue("shared")
        val shared: LockMode
    }
}
