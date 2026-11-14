// Automatically generated - do not modify!

package web.animations

import js.array.ReadonlyArray
import js.internal.InternalApi
import web.errors.DOMExceptionType.SyntaxError
import web.errors.JsThrows

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface Animatable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animate)
     */
    fun animate(
        keyframes: ReadonlyArray<Keyframe>?,
        options: Double = definedExternally,
    ): Animation

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animate)
     */
    fun animate(
        keyframes: ReadonlyArray<Keyframe>?,
        options: KeyframeAnimationOptions,
    ): Animation

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animate)
     */
    fun animate(
        keyframes: PropertyIndexedKeyframes?,
        options: Double = definedExternally,
    ): Animation

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animate)
     */
    fun animate(
        keyframes: PropertyIndexedKeyframes?,
        options: KeyframeAnimationOptions,
    ): Animation

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAnimations)
     */
    @JsThrows(SyntaxError::class)
    fun getAnimations(options: GetAnimationsOptions = definedExternally): ReadonlyArray<Animation>
}
