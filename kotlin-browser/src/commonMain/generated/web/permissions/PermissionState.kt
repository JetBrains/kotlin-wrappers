// Automatically generated - do not modify!

package web.permissions

import seskar.js.JsValue

sealed external interface PermissionState {
    companion object {
        @JsValue("denied")
        val denied: PermissionState

        @JsValue("granted")
        val granted: PermissionState

        @JsValue("prompt")
        val prompt: PermissionState
    }
}
