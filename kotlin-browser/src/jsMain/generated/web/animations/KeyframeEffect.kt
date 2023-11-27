// Automatically generated - do not modify!

package web.animations

import js.core.ReadonlyArray
import web.dom.Element

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect) */
external class KeyframeEffect(
    target: Element?,
    keyframes: ReadonlyArray<Keyframe>?,
    options: Number = definedExternally,
) : AnimationEffect {
    constructor(
        target: Element?,
        keyframes: ReadonlyArray<Keyframe>?,
        options: KeyframeEffectOptions,
    )

    constructor(
        target: Element?,
        keyframes: PropertyIndexedKeyframes?,
        options: Number = definedExternally,
    )

    constructor(
        target: Element?,
        keyframes: PropertyIndexedKeyframes?,
        options: KeyframeEffectOptions,
    )

    constructor(source: KeyframeEffect)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/composite) */
    var composite: CompositeOperation

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/iterationComposite) */
    var iterationComposite: IterationCompositeOperation

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/pseudoElement) */
    var pseudoElement: String?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/target) */
    var target: Element?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/getKeyframes) */
    fun getKeyframes(): ReadonlyArray<ComputedKeyframe>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/setKeyframes) */
    fun setKeyframes(keyframes: ReadonlyArray<Keyframe>?)
    fun setKeyframes(keyframes: PropertyIndexedKeyframes?)
}
