// Automatically generated - do not modify!

package web.clipboard

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface PresentationStyle

inline val PresentationStyle.Companion.attachment: PresentationStyle
    get() = unsafeCast("attachment")

inline val PresentationStyle.Companion.inline: PresentationStyle
    get() = unsafeCast("inline")

inline val PresentationStyle.Companion.unspecified: PresentationStyle
    get() = unsafeCast("unspecified")
