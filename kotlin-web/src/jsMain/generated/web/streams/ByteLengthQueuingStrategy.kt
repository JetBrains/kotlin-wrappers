// Automatically generated - do not modify!

package web.streams

import js.buffer.ArrayBufferView

/**
 * This Streams API interface provides a built-in byte length queuing strategy that can be used when constructing streams.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ByteLengthQueuingStrategy)
 */
external class ByteLengthQueuingStrategy(
    init: QueuingStrategyInit,
) : QueuingStrategy<ArrayBufferView> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ByteLengthQueuingStrategy/highWaterMark) */
    override val highWaterMark: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ByteLengthQueuingStrategy/size) */
    override val size: QueuingStrategySize<ArrayBufferView>
}
