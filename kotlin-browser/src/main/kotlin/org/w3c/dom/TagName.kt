@file:Suppress(
    "NOTHING_TO_INLINE",
)

package org.w3c.dom

sealed external interface TagName<T : Element>

inline fun <T : Element> TagName(
    tagName: String,
): TagName<T> =
    tagName.unsafeCast<TagName<T>>()
