// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPUIndexFormat {
    companion object {
        @JsValue("uint16")
        val uint16: GPUIndexFormat

        @JsValue("uint32")
        val uint32: GPUIndexFormat
    }
}
