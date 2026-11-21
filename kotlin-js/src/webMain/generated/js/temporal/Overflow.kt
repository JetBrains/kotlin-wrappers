// Automatically generated - do not modify!

package js.temporal

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Temporal/Instant/since)
 */
@JsUnion
sealed /* union */
external interface Overflow

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Temporal/Instant/since#:~:text=constrain)
 */
inline val Overflow.Companion.constrain: Overflow
    get() = unsafeCast("constrain")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Temporal/Instant/since#:~:text=reject)
 */
inline val Overflow.Companion.reject: Overflow
    get() = unsafeCast("reject")
