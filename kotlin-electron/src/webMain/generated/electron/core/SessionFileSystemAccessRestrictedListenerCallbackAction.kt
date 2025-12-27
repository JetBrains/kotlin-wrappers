// Automatically generated - do not modify!

package electron.core

sealed external interface SessionFileSystemAccessRestrictedListenerCallbackAction {
    companion object {
        @seskar.js.JsValue("allow")
        val allow: SessionFileSystemAccessRestrictedListenerCallbackAction

        @seskar.js.JsValue("deny")
        val deny: SessionFileSystemAccessRestrictedListenerCallbackAction

        @seskar.js.JsValue("tryAgain")
        val tryAgain: SessionFileSystemAccessRestrictedListenerCallbackAction
    }
}
