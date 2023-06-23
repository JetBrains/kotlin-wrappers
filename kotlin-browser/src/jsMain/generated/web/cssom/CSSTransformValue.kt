// Automatically generated - do not modify!

package web.cssom

import js.collections.ListLike
import js.core.JsIterable
import js.core.JsTuple2
import js.core.ReadonlyArray
import web.geometry.DOMMatrix

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformValue) */
external class CSSTransformValue(
    transforms: ReadonlyArray<CSSTransformComponent>,
) : CSSStyleValue,
    ListLike<CSSTransformComponent> {
    override val length: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformValue/is2D) */
    val is2D: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSTransformValue/toMatrix) */
    fun toMatrix(): DOMMatrix

    override fun entries(): JsIterable.Iterator<JsTuple2<Int, CSSTransformComponent>>
    override fun keys(): JsIterable.Iterator<Int>
    override fun values(): JsIterable.Iterator<CSSTransformComponent>
    override fun forEach(action: (item: CSSTransformComponent) -> Unit)
}
