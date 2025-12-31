// Automatically generated - do not modify!

package tanstack.history

sealed external interface HistoryAction {
    companion object {
        @seskar.js.JsValue("PUSH")
        val PUSH: HistoryAction

        @seskar.js.JsValue("REPLACE")
        val REPLACE: HistoryAction

        @seskar.js.JsValue("FORWARD")
        val FORWARD: HistoryAction

        @seskar.js.JsValue("BACK")
        val BACK: HistoryAction

        @seskar.js.JsValue("GO")
        val GO: HistoryAction
    }
}
