package web.dom

import js.reflect.unsafeCast
import js.string.StringLike

external interface DataTestId :
    StringLike

inline fun DataTestId(
    value: String,
): DataTestId =
    unsafeCast(value)
