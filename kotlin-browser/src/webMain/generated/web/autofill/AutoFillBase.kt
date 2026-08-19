// Automatically generated - do not modify!

package web.autofill

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/autocomplete)
 */
@JsUnion
sealed /* union */
external interface AutoFillBase :
    AutoFill

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/autocomplete#sect)
 */
inline val AutoFillBase.Companion.none: AutoFillBase
    get() = unsafeCast("")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/autocomplete#off)
 */
inline val AutoFillBase.Companion.off: AutoFillBase
    get() = unsafeCast("off")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/autocomplete#on)
 */
inline val AutoFillBase.Companion.on: AutoFillBase
    get() = unsafeCast("on")
