// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.highlight

import js.reflect.unsafeCast

sealed external interface HighlightType {
    companion object
}

inline val HighlightType.Companion.grammarError: HighlightType
    get() = unsafeCast("grammarError")

inline val HighlightType.Companion.highlight: HighlightType
    get() = unsafeCast("highlight")

inline val HighlightType.Companion.spellingError: HighlightType
    get() = unsafeCast("spellingError")
