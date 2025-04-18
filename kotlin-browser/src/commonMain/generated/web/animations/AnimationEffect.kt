// Automatically generated - do not modify!

package web.animations

import kotlin.js.definedExternally

/**
 * The `AnimationEffect` interface of the Web Animations API is an interface representing animation effects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect)
 */
open external class AnimationEffect
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/getComputedTiming)
     */
    fun getComputedTiming(): ComputedEffectTiming

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/getTiming)
     */
    fun getTiming(): EffectTiming

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/updateTiming)
     */
    fun updateTiming(timing: OptionalEffectTiming = definedExternally)
}
