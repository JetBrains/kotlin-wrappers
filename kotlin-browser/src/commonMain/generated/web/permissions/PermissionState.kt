// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

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
