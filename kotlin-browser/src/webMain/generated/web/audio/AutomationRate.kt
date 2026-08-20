// Automatically generated - do not modify!

package web.audio

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/automationRate)
 */
@JsUnion
sealed /* union */
external interface AutomationRate

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/automationRate#a-rate)
 */
inline val AutomationRate.Companion.aRate: AutomationRate
    get() = unsafeCast("a-rate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/automationRate#k-rate)
 */
inline val AutomationRate.Companion.kRate: AutomationRate
    get() = unsafeCast("k-rate")
