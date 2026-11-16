// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue

sealed /* union */
external interface SnackbarCloseReason {
    companion object {
        @JsValue("timeout")
        val timeout: SnackbarCloseReason

        @JsValue("clickaway")
        val clickaway: SnackbarCloseReason

        @JsValue("escapeKeyDown")
        val escapeKeyDown: SnackbarCloseReason
    }
}

sealed /* union */
external interface SnackbarOriginVertical {
    companion object {
        @JsValue("top")
        val top: SnackbarOriginVertical

        @JsValue("bottom")
        val bottom: SnackbarOriginVertical
    }
}

sealed /* union */
external interface SnackbarOriginHorizontal {
    companion object {
        @JsValue("left")
        val left: SnackbarOriginHorizontal

        @JsValue("center")
        val center: SnackbarOriginHorizontal

        @JsValue("right")
        val right: SnackbarOriginHorizontal
    }
}
