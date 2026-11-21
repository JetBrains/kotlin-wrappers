// Automatically generated - do not modify!

package js.temporal

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Temporal/PlainDateTime/toZonedDateTime#disambiguation)
 */
@JsUnion
sealed /* union */
external interface Disambiguation

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Temporal/PlainDateTime/toZonedDateTime#:~:text=compatible)
 */
inline val Disambiguation.Companion.compatible: Disambiguation
    get() = unsafeCast("compatible")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Temporal/PlainDateTime/toZonedDateTime#:~:text=earlier)
 */
inline val Disambiguation.Companion.earlier: Disambiguation
    get() = unsafeCast("earlier")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Temporal/PlainDateTime/toZonedDateTime#:~:text=later)
 */
inline val Disambiguation.Companion.later: Disambiguation
    get() = unsafeCast("later")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Temporal/PlainDateTime/toZonedDateTime#:~:text=reject)
 */
inline val Disambiguation.Companion.reject: Disambiguation
    get() = unsafeCast("reject")
