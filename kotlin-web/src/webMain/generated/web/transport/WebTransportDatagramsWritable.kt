// Automatically generated - do not modify!

package web.transport

import js.buffer.BufferSource
import js.numbers.Int53
import js.serialization.Transferable
import web.streams.WritableStream

/**
 * The **`WebTransportDatagramsWritable`** interface of the WebTransport API is a specialized WritableStream that can be used to write outgoing datagrams to a WebTransport connection.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramsWritable)
 */
open external class WebTransportDatagramsWritable
private constructor() :
    WritableStream<BufferSource>,
    Transferable {
    /**
     * The **`sendGroup`** property of the WebTransportDatagramsWritable interface represents the WebTransportSendGroup that this WebTransportDatagramsWritable is grouped under for the purposes of sendOrder prioritization.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramsWritable/sendGroup)
     */
    open var sendGroup: WebTransportSendGroup?

    /**
     * The **`sendOrder`** property of the WebTransportDatagramsWritable interface represents the priority of this stream's datagrams relative to other streams and datagrams in the same sendGroup, as an integer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramsWritable/sendOrder)
     */
    open var sendOrder: Int53
}
