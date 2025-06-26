// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mediacapabilities

import js.reflect.unsafeCast

sealed external interface ColorGamut {
    companion object
}

inline val ColorGamut.Companion.p3: ColorGamut
    get() = unsafeCast("p3")

inline val ColorGamut.Companion.rec2020: ColorGamut
    get() = unsafeCast("rec2020")

inline val ColorGamut.Companion.srgb: ColorGamut
    get() = unsafeCast("srgb")
