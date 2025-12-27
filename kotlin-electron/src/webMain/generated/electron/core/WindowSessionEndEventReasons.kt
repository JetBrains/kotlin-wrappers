// Automatically generated - do not modify!

package electron.core

sealed external interface WindowSessionEndEventReasons {
    companion object {
        @seskar.js.JsValue("shutdown")
        val shutdown: WindowSessionEndEventReasons

        @seskar.js.JsValue("close-app")
        val closeApp: WindowSessionEndEventReasons

        @seskar.js.JsValue("critical")
        val critical: WindowSessionEndEventReasons

        @seskar.js.JsValue("logoff")
        val logoff: WindowSessionEndEventReasons
    }
}
