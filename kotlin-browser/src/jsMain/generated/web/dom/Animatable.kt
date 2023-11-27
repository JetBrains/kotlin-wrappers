// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.dom

import js.core.ReadonlyArray
import web.animations.Animation
import web.animations.Keyframe
import web.animations.KeyframeAnimationOptions
import web.animations.PropertyIndexedKeyframes

sealed external interface Animatable {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animate) */
    fun animate(
        keyframes: ReadonlyArray<Keyframe>?,
        options: Number = definedExternally,
    ): Animation = definedExternally

    fun animate(
        keyframes: ReadonlyArray<Keyframe>?,
        options: KeyframeAnimationOptions,
    ): Animation = definedExternally

    fun animate(
        keyframes: PropertyIndexedKeyframes?,
        options: Number = definedExternally,
    ): Animation = definedExternally

    fun animate(
        keyframes: PropertyIndexedKeyframes?,
        options: KeyframeAnimationOptions,
    ): Animation = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAnimations) */
    fun getAnimations(options: GetAnimationsOptions = definedExternally): ReadonlyArray<Animation> = definedExternally
}
