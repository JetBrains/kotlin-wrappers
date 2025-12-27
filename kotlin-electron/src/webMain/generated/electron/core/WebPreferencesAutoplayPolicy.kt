// Automatically generated - do not modify!

package electron.core

sealed external interface WebPreferencesAutoplayPolicy {
    companion object {
        @seskar.js.JsValue("no-user-gesture-required")
        val noUserGestureRequired: WebPreferencesAutoplayPolicy

        @seskar.js.JsValue("user-gesture-required")
        val userGestureRequired: WebPreferencesAutoplayPolicy

        @seskar.js.JsValue("document-user-activation-required")
        val documentUserActivationRequired: WebPreferencesAutoplayPolicy
    }
}
