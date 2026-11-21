// Automatically generated - do not modify!

package js.primitive

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/toPrimitive#description)
 */
@JsUnion
sealed /* union */
external interface PrimitiveHint

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/toPrimitive#:~:text=number)
 */
inline val PrimitiveHint.Companion.number: PrimitiveHint
    get() = unsafeCast("number")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/toPrimitive#:~:text=string)
 */
inline val PrimitiveHint.Companion.string: PrimitiveHint
    get() = unsafeCast("string")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/toPrimitive#:~:text=default)
 */
inline val PrimitiveHint.Companion.default: PrimitiveHint
    get() = unsafeCast("default")
