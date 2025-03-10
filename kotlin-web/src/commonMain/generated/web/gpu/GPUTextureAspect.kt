// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
