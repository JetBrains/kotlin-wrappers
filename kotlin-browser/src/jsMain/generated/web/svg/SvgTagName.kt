// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.svg

import js.reflect.unsafeCast

sealed external interface SvgTagName<T : SVGElement>

inline fun <T : SVGElement> SvgTagName(
    tagName: String,
): SvgTagName<T> =
    unsafeCast(tagName)
