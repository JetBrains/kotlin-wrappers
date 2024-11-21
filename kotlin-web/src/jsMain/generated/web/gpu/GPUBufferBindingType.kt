// Automatically generated - do not modify!

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
