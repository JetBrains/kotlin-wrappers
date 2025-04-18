// Automatically generated - do not modify!

package web.streams

import js.core.Void

/**
 * The **`CountQueuingStrategy`** interface of the Streams API provides a built-in chunk counting queuing strategy that can be used when constructing streams.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CountQueuingStrategy)
 */
open external class CountQueuingStrategy(
    init: QueuingStrategyInit,
) : QueuingStrategy<Void> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CountQueuingStrategy/highWaterMark)
     */
    override val highWaterMark: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CountQueuingStrategy/size)
     */
    override val size: QueuingStrategySize<Void>
}
