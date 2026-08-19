// Automatically generated - do not modify!

package web.animations

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScrollTimeline/axis)
 */
@JsUnion
sealed /* union */
external interface ScrollAxis

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScrollTimeline/axis#block)
 */
inline val ScrollAxis.Companion.block: ScrollAxis
    get() = unsafeCast("block")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScrollTimeline/axis#inline)
 */
inline val ScrollAxis.Companion.inline: ScrollAxis
    get() = unsafeCast("inline")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScrollTimeline/axis#x)
 */
inline val ScrollAxis.Companion.x: ScrollAxis
    get() = unsafeCast("x")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScrollTimeline/axis#y)
 */
inline val ScrollAxis.Companion.y: ScrollAxis
    get() = unsafeCast("y")
