// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.animations

import js.array.ReadonlyArray
import js.internal.InternalApi

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface Animatable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animate)
     */
    fun animate(
        keyframes: ReadonlyArray<Keyframe>?,
        options: Double = definedExternally,
    ): Animation = definedExternally

    fun animate(
        keyframes: ReadonlyArray<Keyframe>?,
        options: KeyframeAnimationOptions,
    ): Animation = definedExternally

    fun animate(
        keyframes: PropertyIndexedKeyframes?,
        options: Double = definedExternally,
    ): Animation = definedExternally

    fun animate(
        keyframes: PropertyIndexedKeyframes?,
        options: KeyframeAnimationOptions,
    ): Animation = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAnimations)
     */
    fun getAnimations(options: GetAnimationsOptions = definedExternally): ReadonlyArray<Animation> = definedExternally
}
