// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package dom.html

sealed external interface HtmlTagName<T : HTMLElement>

inline fun <T : HTMLElement> HtmlTagName(
    tagName: String,
): HtmlTagName<T> =
    tagName.unsafeCast<HtmlTagName<T>>()
