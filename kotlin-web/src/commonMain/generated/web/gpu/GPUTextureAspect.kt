// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPUTextureAspect {
    companion object {
        @JsValue("all")
        val all: GPUTextureAspect

        @JsValue("depth-only")
        val depthOnly: GPUTextureAspect

        @JsValue("stencil-only")
        val stencilOnly: GPUTextureAspect
    }
}
