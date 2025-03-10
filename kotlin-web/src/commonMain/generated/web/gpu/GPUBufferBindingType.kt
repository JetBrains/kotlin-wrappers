// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPUBufferBindingType {
    companion object {
        @JsValue("read-only-storage")
        val readOnlyStorage: GPUBufferBindingType

        @JsValue("storage")
        val storage: GPUBufferBindingType

        @JsValue("uniform")
        val uniform: GPUBufferBindingType
    }
}
