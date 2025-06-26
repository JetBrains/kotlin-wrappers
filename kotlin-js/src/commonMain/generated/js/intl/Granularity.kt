// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import js.reflect.unsafeCast

sealed external interface Granularity {
    companion object
}

inline val Granularity.Companion.grapheme: Granularity
    get() = unsafeCast("grapheme")

inline val Granularity.Companion.word: Granularity
    get() = unsafeCast("word")

inline val Granularity.Companion.sentence: Granularity
    get() = unsafeCast("sentence")
