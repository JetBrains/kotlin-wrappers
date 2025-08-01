// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.clipboard

import js.reflect.unsafeCast

sealed external interface PresentationStyle {
    companion object
}

inline val PresentationStyle.Companion.attachment: PresentationStyle
    get() = unsafeCast("attachment")

inline val PresentationStyle.Companion.inline: PresentationStyle
    get() = unsafeCast("inline")

inline val PresentationStyle.Companion.unspecified: PresentationStyle
    get() = unsafeCast("unspecified")
