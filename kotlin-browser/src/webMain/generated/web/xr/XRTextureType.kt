// Automatically generated - do not modify!

package web.xr

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface XRTextureType

inline val XRTextureType.Companion.texture: XRTextureType
    get() = unsafeCast("texture")

inline val XRTextureType.Companion.textureArray: XRTextureType
    get() = unsafeCast("texture-array")
