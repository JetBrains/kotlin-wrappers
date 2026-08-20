// Automatically generated - do not modify!

package web.animations

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/composite)
 */
@JsUnion
sealed /* union */
external interface CompositeOperation

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/composite#accumulate)
 */
inline val CompositeOperation.Companion.accumulate: CompositeOperation
    get() = unsafeCast("accumulate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/composite#add)
 */
inline val CompositeOperation.Companion.add: CompositeOperation
    get() = unsafeCast("add")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyframeEffect/composite#replace)
 */
inline val CompositeOperation.Companion.replace: CompositeOperation
    get() = unsafeCast("replace")
