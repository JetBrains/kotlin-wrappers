// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
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
