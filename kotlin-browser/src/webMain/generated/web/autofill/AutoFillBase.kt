// Automatically generated - do not modify!

package web.autofill

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface AutoFillBase :
    AutoFill

inline val AutoFillBase.Companion.none: AutoFillBase
    get() = unsafeCast("")

inline val AutoFillBase.Companion.off: AutoFillBase
    get() = unsafeCast("off")

inline val AutoFillBase.Companion.on: AutoFillBase
    get() = unsafeCast("on")
