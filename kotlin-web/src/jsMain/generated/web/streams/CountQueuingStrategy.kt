// Automatically generated - do not modify!

package web.streams

import js.core.Void

/**
 * This Streams API interface provides a built-in byte length queuing strategy that can be used when constructing streams.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CountQueuingStrategy)
 */
external class CountQueuingStrategy(
    init: QueuingStrategyInit,
) : QueuingStrategy<Void> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CountQueuingStrategy/highWaterMark) */
    override val highWaterMark: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CountQueuingStrategy/size) */
    override val size: QueuingStrategySize<Void>
}
