// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/dimension)
 */
@JsUnion
sealed /* union */
external interface GPUTextureDimension

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/dimension#1d)
 */
inline val GPUTextureDimension.Companion._1d: GPUTextureDimension
    get() = unsafeCast("1d")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/dimension#2d)
 */
inline val GPUTextureDimension.Companion._2d: GPUTextureDimension
    get() = unsafeCast("2d")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUTexture/dimension#3d)
 */
inline val GPUTextureDimension.Companion._3d: GPUTextureDimension
    get() = unsafeCast("3d")
