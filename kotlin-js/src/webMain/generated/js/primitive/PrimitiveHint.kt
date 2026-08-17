// Automatically generated - do not modify!

package js.primitive

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface PrimitiveHint

inline val PrimitiveHint.Companion.number: PrimitiveHint
    get() = unsafeCast("number")

inline val PrimitiveHint.Companion.string: PrimitiveHint
    get() = unsafeCast("string")

inline val PrimitiveHint.Companion.default: PrimitiveHint
    get() = unsafeCast("default")
