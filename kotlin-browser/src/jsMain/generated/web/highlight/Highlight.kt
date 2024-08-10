// Automatically generated - do not modify!

package web.highlight

import js.array.JsTuple2
import js.collections.MutableSetLike
import js.iterable.JsIterator
import web.ranges.AbstractRange

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Highlight)
 */
external class Highlight(
    vararg initialRanges: AbstractRange,
) : MutableSetLike<AbstractRange> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Highlight/priority)
     */
    var priority: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Highlight/type)
     */
    var type: HighlightType

    override val size: Int

    override fun add(value: AbstractRange)
    override fun clear()
    override fun delete(value: AbstractRange): Boolean
    override fun entries(): JsIterator<JsTuple2<AbstractRange, AbstractRange>>
    override fun forEach(action: (value: AbstractRange) -> Unit)
    override fun has(key: AbstractRange): Boolean
    override fun keys(): JsIterator<AbstractRange>
    override fun values(): JsIterator<AbstractRange>
}
