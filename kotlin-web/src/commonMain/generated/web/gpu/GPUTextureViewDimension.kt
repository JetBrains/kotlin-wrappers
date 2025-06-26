// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.reflect.unsafeCast

sealed external interface GPUTextureViewDimension {
    companion object
}

inline val GPUTextureViewDimension.Companion._1d: GPUTextureViewDimension
    get() = unsafeCast("1d")

inline val GPUTextureViewDimension.Companion._2d: GPUTextureViewDimension
    get() = unsafeCast("2d")

inline val GPUTextureViewDimension.Companion._2dArray: GPUTextureViewDimension
    get() = unsafeCast("2d-array")

inline val GPUTextureViewDimension.Companion._3d: GPUTextureViewDimension
    get() = unsafeCast("3d")

inline val GPUTextureViewDimension.Companion.cube: GPUTextureViewDimension
    get() = unsafeCast("cube")

inline val GPUTextureViewDimension.Companion.cubeArray: GPUTextureViewDimension
    get() = unsafeCast("cube-array")
