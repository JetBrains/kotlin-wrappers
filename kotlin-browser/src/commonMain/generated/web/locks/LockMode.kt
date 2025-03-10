// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

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
