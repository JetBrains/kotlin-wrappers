// Automatically generated - do not modify!

package web.mathml

import js.reflect.unsafeCast

sealed external interface MathMLTagName<T : MathMLElement>

inline fun <T : MathMLElement> MathMLTagName(
    tagName: String,
): MathMLTagName<T> =
    unsafeCast(tagName)
