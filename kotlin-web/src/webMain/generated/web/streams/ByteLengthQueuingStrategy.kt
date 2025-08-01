// Automatically generated - do not modify!

package web.streams

import js.buffer.ArrayBufferView

/**
 * The **`ByteLengthQueuingStrategy`** interface of the Streams API provides a built-in byte length queuing strategy that can be used when constructing streams.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ByteLengthQueuingStrategy)
 */
open external class ByteLengthQueuingStrategy(
    init: QueuingStrategyInit,
) : QueuingStrategy<ArrayBufferView<*>> {
    /**
     * The read-only **`ByteLengthQueuingStrategy.highWaterMark`** property returns the total number of bytes that can be contained in the internal queue before backpressure is applied.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ByteLengthQueuingStrategy/highWaterMark)
     */
    override val highWaterMark: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ByteLengthQueuingStrategy/size)
     */
    override val size: QueuingStrategySize<ArrayBufferView<*>>
}
