// Automatically generated - do not modify!

package mui.base

import seskar.js.JsValue

sealed external interface SnackbarCloseReason {
    companion object {
        @JsValue("timeout")
        val timeout: SnackbarCloseReason

        @JsValue("clickaway")
        val clickaway: SnackbarCloseReason

        @JsValue("escapeKeyDown")
        val escapeKeyDown: SnackbarCloseReason
    }
}
