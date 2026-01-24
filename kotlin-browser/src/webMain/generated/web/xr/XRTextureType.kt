// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.xr

import js.reflect.unsafeCast

sealed external interface XRTextureType {
    companion object
}

inline val XRTextureType.Companion.texture: XRTextureType
    get() = unsafeCast("texture")

inline val XRTextureType.Companion.textureArray: XRTextureType
    get() = unsafeCast("texture-array")
