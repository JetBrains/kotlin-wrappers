// Automatically generated - do not modify!

@file:JsModule("node:http")
@file:JsNonModule

package node.http

import kotlinx.js.ReadonlyArray
import node.buffer.Buffer
import node.events.Event
import node.events.EventType
import node.net.Socket
import node.stream.Readable

external class ClientRequest : OutgoingMessage {
    /**
     * The `request.aborted` property will be `true` if the request has
     * been aborted.
     * @since v0.11.14
     * @deprecated Since v17.0.0,v16.12.0 - Check `destroyed` instead.
     */
    var aborted: Boolean

    /**
     * The request host.
     * @since v14.5.0, v12.19.0
     */
    var host: String

    /**
     * The request protocol.
     * @since v14.5.0, v12.19.0
     */
    var protocol: String

    /**
     * When sending request through a keep-alive enabled agent, the underlying socket
     * might be reused. But if server closes connection at unfortunate time, client
     * may run into a 'ECONNRESET' error.
     *
     * ```js
     * const http = require('http');
     *
     * // Server has a 5 seconds keep-alive timeout by default
     * http
     *   .createServer((req, res) => {
     *     res.write('hello\n');
     *     res.end();
     *   })
     *   .listen(3000);
     *
     * setInterval(() => {
     *   // Adapting a keep-alive agent
     *   http.get('http://localhost:3000', { agent }, (res) => {
     *     res.on('data', (data) => {
     *       // Do nothing
     *     });
     *   });
     * }, 5000); // Sending request on 5s interval so it's easy to hit idle timeout
     * ```
     *
     * By marking a request whether it reused socket or not, we can do
     * automatic error retry base on it.
     *
     * ```js
     * const http = require('http');
     * const agent = new http.Agent({ keepAlive: true });
     *
     * function retriableRequest() {
     *   const req = http
     *     .get('http://localhost:3000', { agent }, (res) => {
     *       // ...
     *     })
     *     .on('error', (err) => {
     *       // Check if retry is needed
     *       if (req.reusedSocket &#x26;&#x26; err.code === 'ECONNRESET') {
     *         retriableRequest();
     *       }
     *     });
     * }
     *
     * retriableRequest();
     * ```
     * @since v13.0.0, v12.16.0
     */
    var reusedSocket: Boolean

    /**
     * Limits maximum response headers count. If set to 0, no limit will be applied.
     */
    var maxHeadersCount: Number

    constructor(
        url: Any, /* string | URL | ClientRequestArgs */
        callback: (res: IncomingMessage) -> Unit = definedExternally,
    )

    /**
     * The request method.
     * @since v0.1.97
     */
    var method: String

    /**
     * The request path.
     * @since v0.4.0
     */
    var path: String

    /**
     * Marks the request as aborting. Calling this will cause remaining data
     * in the response to be dropped and the socket to be destroyed.
     * @since v0.3.8
     * @deprecated Since v14.1.0,v13.14.0 - Use `destroy` instead.
     */
    fun abort()
    fun onSocket(socket: Socket)

    /**
     * Once a socket is assigned to this request and is connected `socket.setTimeout()` will be called.
     * @since v0.5.9
     * @param timeout Milliseconds before a request times out.
     * @param callback Optional function to be called when a timeout occurs. Same as binding to the `'timeout'` event.
     */
    override fun setTimeout(
        msecs: Number,
        callback: () -> Unit,
    ) /* : this */

    /**
     * Once a socket is assigned to this request and is connected `socket.setNoDelay()` will be called.
     * @since v0.5.9
     */
    fun setNoDelay(noDelay: Boolean = definedExternally)

    /**
     * Once a socket is assigned to this request and is connected `socket.setKeepAlive()` will be called.
     * @since v0.5.9
     */
    fun setSocketKeepAlive(
        enable: Boolean = definedExternally,
        initialDelay: Number = definedExternally,
    )

    /**
     * Returns an array containing the unique names of the current outgoing raw
     * headers. Header names are returned with their exact casing being set.
     *
     * ```js
     * request.setHeader('Foo', 'bar');
     * request.setHeader('Set-Cookie', ['foo=bar', 'bar=baz']);
     *
     * const headerNames = request.getRawHeaderNames();
     * // headerNames === ['Foo', 'Set-Cookie']
     * ```
     * @since v15.13.0, v14.17.0
     */
    fun getRawHeaderNames(): ReadonlyArray<String>

    /**
     * @deprecated
     */
    fun addListener(
        event: Event.ABORT,
        listener: () -> Unit,
    ) /* : this */

    fun addListener(
        event: Event.CONNECT,
        listener: (
            response: IncomingMessage,
            socket: Socket,
            head: Buffer,
        ) -> Unit,
    ) /* : this */

    fun addListener(
        event: Event.CONTINUE,
        listener: () -> Unit,
    ) /* : this */

    fun addListener(
        event: Event.INFORMATION,
        listener: (info: InformationEvent) -> Unit,
    ) /* : this */

    fun addListener(
        event: Event.RESPONSE,
        listener: (response: IncomingMessage) -> Unit,
    ) /* : this */

    fun addListener(
        event: Event.SOCKET,
        listener: (socket: Socket) -> Unit,
    ) /* : this */

    fun addListener(
        event: Event.TIMEOUT,
        listener: () -> Unit,
    ) /* : this */

    fun addListener(
        event: Event.UPGRADE,
        listener: (
            response: IncomingMessage,
            socket: Socket,
            head: Buffer,
        ) -> Unit,
    ) /* : this */

    override fun addListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    override fun addListener(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    override fun addListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    override fun addListener(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    override fun addListener(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun addListener(
        event: Event.UNPIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun addListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    /**
     * @deprecated
     */
    fun on(
        event: Event.ABORT,
        listener: () -> Unit,
    ) /* : this */

    fun on(
        event: Event.CONNECT,
        listener: (
            response: IncomingMessage,
            socket: Socket,
            head: Buffer,
        ) -> Unit,
    ) /* : this */

    fun on(
        event: Event.CONTINUE,
        listener: () -> Unit,
    ) /* : this */

    fun on(
        event: Event.INFORMATION,
        listener: (info: InformationEvent) -> Unit,
    ) /* : this */

    fun on(
        event: Event.RESPONSE,
        listener: (response: IncomingMessage) -> Unit,
    ) /* : this */

    fun on(
        event: Event.SOCKET,
        listener: (socket: Socket) -> Unit,
    ) /* : this */

    fun on(
        event: Event.TIMEOUT,
        listener: () -> Unit,
    ) /* : this */

    fun on(
        event: Event.UPGRADE,
        listener: (
            response: IncomingMessage,
            socket: Socket,
            head: Buffer,
        ) -> Unit,
    ) /* : this */

    override fun on(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    override fun on(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    override fun on(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    override fun on(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    override fun on(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun on(
        event: Event.UNPIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun on(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    /**
     * @deprecated
     */
    fun once(
        event: Event.ABORT,
        listener: () -> Unit,
    ) /* : this */

    fun once(
        event: Event.CONNECT,
        listener: (
            response: IncomingMessage,
            socket: Socket,
            head: Buffer,
        ) -> Unit,
    ) /* : this */

    fun once(
        event: Event.CONTINUE,
        listener: () -> Unit,
    ) /* : this */

    fun once(
        event: Event.INFORMATION,
        listener: (info: InformationEvent) -> Unit,
    ) /* : this */

    fun once(
        event: Event.RESPONSE,
        listener: (response: IncomingMessage) -> Unit,
    ) /* : this */

    fun once(
        event: Event.SOCKET,
        listener: (socket: Socket) -> Unit,
    ) /* : this */

    fun once(
        event: Event.TIMEOUT,
        listener: () -> Unit,
    ) /* : this */

    fun once(
        event: Event.UPGRADE,
        listener: (
            response: IncomingMessage,
            socket: Socket,
            head: Buffer,
        ) -> Unit,
    ) /* : this */

    override fun once(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    override fun once(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    override fun once(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    override fun once(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    override fun once(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun once(
        event: Event.UNPIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun once(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    /**
     * @deprecated
     */
    fun prependListener(
        event: Event.ABORT,
        listener: () -> Unit,
    ) /* : this */

    fun prependListener(
        event: Event.CONNECT,
        listener: (
            response: IncomingMessage,
            socket: Socket,
            head: Buffer,
        ) -> Unit,
    ) /* : this */

    fun prependListener(
        event: Event.CONTINUE,
        listener: () -> Unit,
    ) /* : this */

    fun prependListener(
        event: Event.INFORMATION,
        listener: (info: InformationEvent) -> Unit,
    ) /* : this */

    fun prependListener(
        event: Event.RESPONSE,
        listener: (response: IncomingMessage) -> Unit,
    ) /* : this */

    fun prependListener(
        event: Event.SOCKET,
        listener: (socket: Socket) -> Unit,
    ) /* : this */

    fun prependListener(
        event: Event.TIMEOUT,
        listener: () -> Unit,
    ) /* : this */

    fun prependListener(
        event: Event.UPGRADE,
        listener: (
            response: IncomingMessage,
            socket: Socket,
            head: Buffer,
        ) -> Unit,
    ) /* : this */

    override fun prependListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    override fun prependListener(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    override fun prependListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    override fun prependListener(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    override fun prependListener(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun prependListener(
        event: Event.UNPIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun prependListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    /**
     * @deprecated
     */
    fun prependOnceListener(
        event: Event.ABORT,
        listener: () -> Unit,
    ) /* : this */

    fun prependOnceListener(
        event: Event.CONNECT,
        listener: (
            response: IncomingMessage,
            socket: Socket,
            head: Buffer,
        ) -> Unit,
    ) /* : this */

    fun prependOnceListener(
        event: Event.CONTINUE,
        listener: () -> Unit,
    ) /* : this */

    fun prependOnceListener(
        event: Event.INFORMATION,
        listener: (info: InformationEvent) -> Unit,
    ) /* : this */

    fun prependOnceListener(
        event: Event.RESPONSE,
        listener: (response: IncomingMessage) -> Unit,
    ) /* : this */

    fun prependOnceListener(
        event: Event.SOCKET,
        listener: (socket: Socket) -> Unit,
    ) /* : this */

    fun prependOnceListener(
        event: Event.TIMEOUT,
        listener: () -> Unit,
    ) /* : this */

    fun prependOnceListener(
        event: Event.UPGRADE,
        listener: (
            response: IncomingMessage,
            socket: Socket,
            head: Buffer,
        ) -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.DRAIN,
        listener: () -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.FINISH,
        listener: () -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.PIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: Event.UNPIPE,
        listener: (src: Readable) -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */
}
