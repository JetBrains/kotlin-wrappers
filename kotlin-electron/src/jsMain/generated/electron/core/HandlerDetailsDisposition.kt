// Generated by Karakum - do not modify it manually!

package electron.core

sealed external interface HandlerDetailsDisposition {
    companion object {
        @seskar.js.JsValue("default")
        val default: HandlerDetailsDisposition

        @seskar.js.JsValue("foreground-tab")
        val foregroundTab: HandlerDetailsDisposition

        @seskar.js.JsValue("background-tab")
        val backgroundTab: HandlerDetailsDisposition

        @seskar.js.JsValue("new-window")
        val newWindow: HandlerDetailsDisposition

        @seskar.js.JsValue("other")
        val other: HandlerDetailsDisposition
    }
}
