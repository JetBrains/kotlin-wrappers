// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue

sealed external interface GPUTextureViewDimension {
    companion object {
        @JsValue("1d")
        val _1d: GPUTextureViewDimension

        @JsValue("2d")
        val _2d: GPUTextureViewDimension

        @JsValue("2d-array")
        val _2dArray: GPUTextureViewDimension

        @JsValue("cube")
        val cube: GPUTextureViewDimension

        @JsValue("cube-array")
        val cubeArray: GPUTextureViewDimension

        @JsValue("3d")
        val _3d: GPUTextureViewDimension
    }
}
