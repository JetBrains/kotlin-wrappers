// Automatically generated - do not modify!

package js.intl

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RoundingPriority

inline val RoundingPriority.Companion.auto: RoundingPriority
    get() = unsafeCast("auto")

inline val RoundingPriority.Companion.morePrecision: RoundingPriority
    get() = unsafeCast("morePrecision")

inline val RoundingPriority.Companion.lessPrecision: RoundingPriority
    get() = unsafeCast("lessPrecision")
