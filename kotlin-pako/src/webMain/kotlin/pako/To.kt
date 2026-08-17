package pako

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface To

inline val To.Companion.string: To
    get() = unsafeCast("string")
