// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast

sealed external interface StringType :
    Content,
    FontFamily

inline fun string(
    value: String,
): StringType =
    unsafeCast(value)
