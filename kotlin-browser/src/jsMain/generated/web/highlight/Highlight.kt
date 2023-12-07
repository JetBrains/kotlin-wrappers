// Automatically generated - do not modify!

package web.highlight

import js.collections.MutableSetLike
import js.core.JsTuple2
import js.iterable.IterableIterator
import web.dom.AbstractRange

external class Highlight(
    vararg initialRanges: AbstractRange,
) : MutableSetLike<AbstractRange> {
    var priority: Int
    var type: HighlightType

    override val size: Int

    override fun add(value: AbstractRange)
    override fun clear()
    override fun delete(value: AbstractRange): Boolean
    override fun entries(): IterableIterator<JsTuple2<AbstractRange, AbstractRange>>
    override fun forEach(action: (value: AbstractRange) -> Unit)
    override fun has(value: AbstractRange): Boolean
    override fun keys(): IterableIterator<AbstractRange>
    override fun values(): IterableIterator<AbstractRange>
}
