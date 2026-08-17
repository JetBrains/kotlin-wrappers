// Automatically generated - do not modify!

package js.temporal

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface Disambiguation

inline val Disambiguation.Companion.compatible: Disambiguation
    get() = unsafeCast("compatible")

inline val Disambiguation.Companion.earlier: Disambiguation
    get() = unsafeCast("earlier")

inline val Disambiguation.Companion.later: Disambiguation
    get() = unsafeCast("later")

inline val Disambiguation.Companion.reject: Disambiguation
    get() = unsafeCast("reject")
