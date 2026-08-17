// Automatically generated - do not modify!

package js.intl

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface Granularity

inline val Granularity.Companion.grapheme: Granularity
    get() = unsafeCast("grapheme")

inline val Granularity.Companion.word: Granularity
    get() = unsafeCast("word")

inline val Granularity.Companion.sentence: Granularity
    get() = unsafeCast("sentence")
