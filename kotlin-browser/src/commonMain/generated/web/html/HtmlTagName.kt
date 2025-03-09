// Automatically generated - do not modify!

package web.html

import js.reflect.unsafeCast

sealed external interface HtmlTagName<T : HTMLElement>

inline fun <T : HTMLElement> HtmlTagName(
    tagName: String,
): HtmlTagName<T> =
    unsafeCast(tagName)
