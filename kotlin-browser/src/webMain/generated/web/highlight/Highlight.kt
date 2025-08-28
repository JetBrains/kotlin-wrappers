// Automatically generated - do not modify!

package web.highlight

import js.array.Tuple2
import js.collections.MutableSetLike
import js.iterable.JsIterator
import web.ranges.AbstractRange

/**
 * The **`Highlight`** interface of the CSS Custom Highlight API is used to represent a collection of Range instances to be styled using the API.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Highlight)
 */
open external class Highlight(
    vararg initialRanges: AbstractRange,
) : MutableSetLike<AbstractRange> {
    /**
     * The `priority` property of the Highlight interface is a number used to determine which highlight's styles should be used to resolve style conflicts in overlapping parts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Highlight/priority)
     */
    var priority: Int

    /**
     * The `type` property of the Highlight interface is an enumerated String used to specify the meaning of the highlight.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Highlight/type)
     */
    var type: HighlightType

    override val size: Int

    override fun add(value: AbstractRange)
    override fun clear()
    override fun delete(value: AbstractRange): Boolean
    override fun entries(): JsIterator<Tuple2<AbstractRange, AbstractRange>>
    override fun forEach(action: (value: AbstractRange) -> Unit)
    override fun has(key: AbstractRange): Boolean
    override fun keys(): JsIterator<AbstractRange>
    override fun values(): JsIterator<AbstractRange>
}
