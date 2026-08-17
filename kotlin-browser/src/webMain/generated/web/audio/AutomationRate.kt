// Automatically generated - do not modify!

package web.audio

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface AutomationRate

inline val AutomationRate.Companion.aRate: AutomationRate
    get() = unsafeCast("a-rate")

inline val AutomationRate.Companion.kRate: AutomationRate
    get() = unsafeCast("k-rate")
