// Automatically generated - do not modify!

package web.imagecapture

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface FillLightMode

inline val FillLightMode.Companion.auto: FillLightMode
    get() = unsafeCast("auto")

inline val FillLightMode.Companion.flash: FillLightMode
    get() = unsafeCast("flash")

inline val FillLightMode.Companion.off: FillLightMode
    get() = unsafeCast("off")
