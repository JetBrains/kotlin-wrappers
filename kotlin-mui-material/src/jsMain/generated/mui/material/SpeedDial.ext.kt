// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue

sealed external interface CloseReason {
    companion object {
        @JsValue("toggle")
        val toggle: CloseReason

        @JsValue("blur")
        val blur: CloseReason

        @JsValue("mouseLeave")
        val mouseLeave: CloseReason

        @JsValue("escapeKeyDown")
        val escapeKeyDown: CloseReason
    }
}

sealed external interface OpenReason {
    companion object {
        @JsValue("toggle")
        val toggle: OpenReason

        @JsValue("focus")
        val focus: OpenReason

        @JsValue("mouseEnter")
        val mouseEnter: OpenReason
    }
}

sealed external interface SpeedDialDirection {
    companion object {
        @JsValue("up")
        val up: SpeedDialDirection

        @JsValue("down")
        val down: SpeedDialDirection

        @JsValue("left")
        val left: SpeedDialDirection

        @JsValue("right")
        val right: SpeedDialDirection
    }
}
