// Automatically generated - do not modify!

package web.cssom

import js.array.ReadonlyArray
import js.array.Tuple2
import js.collections.ListLike
import js.core.JsInt
import js.iterable.JsIterator
import web.geometry.DOMMatrix

/**
 * The **`CSSTransformValue`** interface of the CSS Typed Object Model API represents `transform-list` values as used by the CSS transform property.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformValue)
 */
open external class CSSTransformValue(
    transforms: ReadonlyArray<CSSTransformComponent>,
) : CSSStyleValue,
    ListLike<CSSTransformComponent> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformValue/is2D)
     */
    val is2D: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformValue/length)
     */
    override val length: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformValue/toMatrix)
     */
    fun toMatrix(): DOMMatrix

    override fun entries(): JsIterator<Tuple2<JsInt, CSSTransformComponent>>
    override fun keys(): JsIterator<JsInt>
    override fun values(): JsIterator<CSSTransformComponent>
    override fun forEach(action: (item: CSSTransformComponent) -> Unit)
}
