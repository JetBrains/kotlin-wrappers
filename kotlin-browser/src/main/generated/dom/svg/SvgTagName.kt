// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package dom.svg

sealed external interface SvgTagName<T : SVGElement>

inline fun <T : SVGElement> SvgTagName(
    tagName: String,
): SvgTagName<T> =
    tagName.unsafeCast<SvgTagName<T>>()
