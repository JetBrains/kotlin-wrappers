// Automatically generated - do not modify!

package web.animations

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/iterationComposite)
 */
@JsUnion
sealed /* union */
external interface IterationCompositeOperation

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/iterationComposite#accumulate)
 */
inline val IterationCompositeOperation.Companion.accumulate: IterationCompositeOperation
    get() = unsafeCast("accumulate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/iterationComposite#replace)
 */
inline val IterationCompositeOperation.Companion.replace: IterationCompositeOperation
    get() = unsafeCast("replace")
