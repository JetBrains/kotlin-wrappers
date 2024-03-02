// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
