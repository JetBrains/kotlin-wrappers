// Automatically generated - do not modify!

package web.animations

import js.array.ReadonlyArray
import web.dom.Element
import kotlin.js.definedExternally

/**
 * The **`KeyframeEffect`** interface of the Web Animations API lets us create sets of animatable properties and values, called **keyframes.** These can then be played using the Animation.Animation constructor.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect)
 */
open external class KeyframeEffect(
    /**
     * The **`target`** property of a KeyframeEffect interface represents the element or pseudo-element being animated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/target)
     */
    var target: Element?,
    keyframes: ReadonlyArray<Keyframe>?,
    options: Double = definedExternally,
) : AnimationEffect {
    constructor(
        target: Element?,
        keyframes: ReadonlyArray<Keyframe>?,
        options: KeyframeEffectOptions,
    )

    constructor(
        target: Element?,
        keyframes: PropertyIndexedKeyframes?,
        options: Double = definedExternally,
    )

    constructor(
        target: Element?,
        keyframes: PropertyIndexedKeyframes?,
        options: KeyframeEffectOptions,
    )

    constructor(source: KeyframeEffect)

    /**
     * The **`composite`** property of a KeyframeEffect resolves how an element's animation impacts its underlying property values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/composite)
     */
    var composite: CompositeOperation

    /**
     * The **`iterationComposite`** property of a KeyframeEffect resolves how the animation's property value changes accumulate or override each other upon each of the animation's iterations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/iterationComposite)
     */
    var iterationComposite: IterationCompositeOperation

    /**
     * The **`pseudoElement`** property of a KeyframeEffect interface is a string representing the pseudo-element being animated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/pseudoElement)
     */
    var pseudoElement: String?

    /**
     * The **`getKeyframes()`** method of a KeyframeEffect returns an Array of the computed keyframes that make up this animation along with their computed offsets.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/getKeyframes)
     */
    fun getKeyframes(): ReadonlyArray<ComputedKeyframe>

    /**
     * The **`setKeyframes()`** method of the KeyframeEffect interface replaces the keyframes that make up the affected `KeyframeEffect` with a new set of keyframes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/setKeyframes)
     */
    fun setKeyframes(keyframes: ReadonlyArray<Keyframe>?)
    fun setKeyframes(keyframes: PropertyIndexedKeyframes?)
}
