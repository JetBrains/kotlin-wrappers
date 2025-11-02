// Automatically generated - do not modify!

package web.animations

import kotlin.js.definedExternally

/**
 * The **`AnimationEffect`** interface of the Web Animations API is an interface representing animation effects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect)
 */
open external class AnimationEffect
private constructor() {
    /**
     * The **`getComputedTiming()`** method of the AnimationEffect interface returns the calculated timing properties for this animation effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/getComputedTiming)
     */
    fun getComputedTiming(): ComputedEffectTiming

    /**
     * The **`AnimationEffect.getTiming()`** method of the AnimationEffect interface returns an object containing the timing properties for the Animation Effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/getTiming)
     */
    fun getTiming(): EffectTiming

    /**
     * The **`updateTiming()`** method of the AnimationEffect interface updates the specified timing properties for an animation effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/updateTiming)
     */
    fun updateTiming(timing: OptionalEffectTiming = definedExternally)
}
