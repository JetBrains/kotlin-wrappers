// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue

sealed external interface GPUTextureAspect {
    companion object {
        @JsValue("all")
        val all: GPUTextureAspect

        @JsValue("stencil-only")
        val stencilOnly: GPUTextureAspect

        @JsValue("depth-only")
        val depthOnly: GPUTextureAspect
    }
}
