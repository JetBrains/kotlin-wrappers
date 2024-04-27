// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GPUBufferBindingType {
    companion object {
        @JsValue("uniform")
        val uniform: GPUBufferBindingType

        @JsValue("storage")
        val storage: GPUBufferBindingType

        @JsValue("read-only-storage")
        val readOnlyStorage: GPUBufferBindingType
    }
}
