@file:Suppress(
    "NOTHING_TO_INLINE",
)

package dom

import org.w3c.dom.Element

sealed external interface TagName<T : Element>

inline fun <T : Element> TagName(
    tagName: String,
): TagName<T> =
    tagName.unsafeCast<TagName<T>>()
