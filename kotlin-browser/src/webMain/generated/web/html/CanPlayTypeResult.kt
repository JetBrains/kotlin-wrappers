// Automatically generated - do not modify!

package web.html

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/string))
 */
@JsUnion
sealed /* union */
external interface CanPlayTypeResult

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/string)#sect)
 */
inline val CanPlayTypeResult.Companion.none: CanPlayTypeResult
    get() = unsafeCast("")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/string)#maybe)
 */
inline val CanPlayTypeResult.Companion.maybe: CanPlayTypeResult
    get() = unsafeCast("maybe")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/string)#probably)
 */
inline val CanPlayTypeResult.Companion.probably: CanPlayTypeResult
    get() = unsafeCast("probably")
