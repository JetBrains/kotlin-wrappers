// Automatically generated - do not modify!

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
