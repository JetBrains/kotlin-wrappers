package web.dom

import js.reflect.unsafeCast

sealed external interface TagName<T : Element>

inline fun <T : Element> TagName(
    value: String,
): TagName<T> =
    unsafeCast(value)
