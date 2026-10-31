// Automatically generated - do not modify!

package mui.base

import seskar.js.JsRawValue
import seskar.js.JsValue

sealed external interface ClickAwayListenerMouseEvent {
    companion object {
        @JsValue("onClick")
        val onClick: ClickAwayListenerMouseEvent

        @JsValue("onMouseDown")
        val onMouseDown: ClickAwayListenerMouseEvent

        @JsValue("onMouseUp")
        val onMouseUp: ClickAwayListenerMouseEvent

        @JsValue("onPointerDown")
        val onPointerDown: ClickAwayListenerMouseEvent

        @JsValue("onPointerUp")
        val onPointerUp: ClickAwayListenerMouseEvent

        @JsRawValue("false")
        val `false`: ClickAwayListenerMouseEvent
    }
}

sealed external interface ClickAwayListenerTouchEvent {
    companion object {
        @JsValue("onTouchStart")
        val onTouchStart: ClickAwayListenerTouchEvent

        @JsValue("onTouchEnd")
        val onTouchEnd: ClickAwayListenerTouchEvent

        @JsRawValue("false")
        val `false`: ClickAwayListenerTouchEvent
    }
}
