// Automatically generated - do not modify!

package web.mediacapabilities

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ColorGamut

inline val ColorGamut.Companion.p3: ColorGamut
    get() = unsafeCast("p3")

inline val ColorGamut.Companion.rec2020: ColorGamut
    get() = unsafeCast("rec2020")

inline val ColorGamut.Companion.srgb: ColorGamut
    get() = unsafeCast("srgb")
