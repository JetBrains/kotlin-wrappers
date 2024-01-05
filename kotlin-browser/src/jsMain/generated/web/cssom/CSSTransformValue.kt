// Automatically generated - do not modify!

package web.cssom

import js.array.JsTuple2
import js.collections.ListLike
import js.core.ReadonlyArray
import js.iterable.IterableIterator
import web.geometry.DOMMatrix

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformValue)
 */
external class CSSTransformValue(
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

    override fun entries(): IterableIterator<JsTuple2<Int, CSSTransformComponent>>
    override fun keys(): IterableIterator<Int>
    override fun values(): IterableIterator<CSSTransformComponent>
    override fun forEach(action: (item: CSSTransformComponent) -> Unit)
}
