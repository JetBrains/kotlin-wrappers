// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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

@JsVirtual
sealed external interface SnackbarOriginVertical {
    companion object {
        @JsValue("top")
        val top: SnackbarOriginVertical

        @JsValue("bottom")
        val bottom: SnackbarOriginVertical
    }
}

@JsVirtual
sealed external interface SnackbarOriginHorizontal {
    companion object {
        @JsValue("left")
        val left: SnackbarOriginHorizontal

        @JsValue("center")
        val center: SnackbarOriginHorizontal

        @JsValue("right")
        val right: SnackbarOriginHorizontal
    }
}
