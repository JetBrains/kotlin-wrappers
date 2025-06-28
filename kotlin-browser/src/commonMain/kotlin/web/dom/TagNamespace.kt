package web.dom

import js.reflect.unsafeCast

sealed external interface TagNamespace<T : Element>

inline fun <T : Element> TagNamespace(
    value: String,
): TagNamespace<T> =
    unsafeCast(value)
