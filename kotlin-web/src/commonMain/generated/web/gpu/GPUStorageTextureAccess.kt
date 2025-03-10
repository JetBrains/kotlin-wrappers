// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPUStorageTextureAccess {
    companion object {
        @JsValue("read-only")
        val readOnly: GPUStorageTextureAccess

        @JsValue("read-write")
        val readWrite: GPUStorageTextureAccess

        @JsValue("write-only")
        val writeOnly: GPUStorageTextureAccess
    }
}
