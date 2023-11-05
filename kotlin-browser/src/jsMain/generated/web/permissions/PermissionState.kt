// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.permissions

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
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
