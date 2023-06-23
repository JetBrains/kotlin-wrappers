// Automatically generated - do not modify!

package web.animations

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect) */
sealed external class AnimationEffect {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/getComputedTiming) */
    fun getComputedTiming(): ComputedEffectTiming

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/getTiming) */
    fun getTiming(): EffectTiming

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEffect/updateTiming) */
    fun updateTiming(timing: OptionalEffectTiming = definedExternally)
}
