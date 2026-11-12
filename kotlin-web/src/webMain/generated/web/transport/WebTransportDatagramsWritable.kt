// Automatically generated - do not modify!

package web.transport

import js.buffer.BufferSource
import js.numbers.Int53
import js.serialization.Transferable
import web.streams.WritableStream

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramsWritable)
 */
open external class WebTransportDatagramsWritable
private constructor() :
    WritableStream<BufferSource>,
    Transferable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramsWritable/sendGroup)
     */
    open var sendGroup: WebTransportSendGroup?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramsWritable/sendOrder)
     */
    open var sendOrder: Int53
}
