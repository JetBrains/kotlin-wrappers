// Generated by Karakum - do not modify it manually!

package electron.core


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
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
