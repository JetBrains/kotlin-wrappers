// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface GPUTextureViewDimension

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
