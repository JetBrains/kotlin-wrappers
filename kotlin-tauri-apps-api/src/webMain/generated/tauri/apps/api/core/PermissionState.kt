// Automatically generated - do not modify!

package tauri.apps.api.core

sealed external interface PermissionState {
    companion object {
        @seskar.js.JsValue("granted")
        val granted: PermissionState

        @seskar.js.JsValue("denied")
        val denied: PermissionState

        @seskar.js.JsValue("prompt")
        val prompt: PermissionState

        @seskar.js.JsValue("prompt-with-rationale")
        val promptWithRationale: PermissionState
    }
}
