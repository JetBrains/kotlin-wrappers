// Generated by Karakum - do not modify it manually!

package electron.core

sealed external interface WebviewTagStopFindInPageAction {
    companion object {
        @seskar.js.JsValue("clearSelection")
        val clearSelection: WebviewTagStopFindInPageAction

        @seskar.js.JsValue("keepSelection")
        val keepSelection: WebviewTagStopFindInPageAction

        @seskar.js.JsValue("activateSelection")
        val activateSelection: WebviewTagStopFindInPageAction
    }
}
