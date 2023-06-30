@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.buffer.Buffer
import node.events.EventEmitter as NodeEventEmitter


external class IncomingMessage : NodeEventEmitter {
// Docs: https://electronjs.org/docs/api/incoming-message
    /**
     * Emitted when a request has been canceled during an ongoing HTTP transaction.
     */
    fun on(event: IncomingMessageEvent.ABORTED, listener: Function<*>): Unit /* this */

    /**
     * The `data` event is the usual method of transferring response data into
     * applicative code.
     */
    fun on(
        event: IncomingMessageEvent.DATA, listener: (
            /**
             * A chunk of response body's data.
             */
            chunk: Buffer
        ) -> Unit
    ): Unit /* this */

    /**
     * Indicates that response body has ended. Must be placed before 'data' event.
     */
    fun on(event: IncomingMessageEvent.END, listener: Function<*>): Unit /* this */

    /**
     * Returns:
     *
     * `error` Error - Typically holds an error string identifying failure root cause.
     *
     * Emitted when an error was encountered while streaming response data events. For
     * instance, if the server closes the underlying while the response is still
     * streaming, an `error` event will be emitted on the response object and a `close`
     * event will subsequently follow on the request object.
     */
    fun on(event: IncomingMessageEvent.ERROR, listener: Function<*>): Unit /* this */
    fun once(event: IncomingMessageEvent.ABORTED, listener: Function<*>): Unit /* this */
    fun once(
        event: IncomingMessageEvent.DATA, listener: (
            /**
             * A chunk of response body's data.
             */
            chunk: Buffer
        ) -> Unit
    ): Unit /* this */

    fun once(event: IncomingMessageEvent.END, listener: Function<*>): Unit /* this */
    fun once(event: IncomingMessageEvent.ERROR, listener: Function<*>): Unit /* this */
    fun addListener(event: IncomingMessageEvent.ABORTED, listener: Function<*>): Unit /* this */
    fun addListener(
        event: IncomingMessageEvent.DATA, listener: (
            /**
             * A chunk of response body's data.
             */
            chunk: Buffer
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: IncomingMessageEvent.END, listener: Function<*>): Unit /* this */
    fun addListener(event: IncomingMessageEvent.ERROR, listener: Function<*>): Unit /* this */
    fun removeListener(event: IncomingMessageEvent.ABORTED, listener: Function<*>): Unit /* this */
    fun removeListener(
        event: IncomingMessageEvent.DATA, listener: (
            /**
             * A chunk of response body's data.
             */
            chunk: Buffer
        ) -> Unit
    ): Unit /* this */

    fun removeListener(event: IncomingMessageEvent.END, listener: Function<*>): Unit /* this */
    fun removeListener(event: IncomingMessageEvent.ERROR, listener: Function<*>): Unit /* this */

    /**
     * A `Record<string, string | string[]>` representing the HTTP response headers.
     * The `headers` object is formatted as follows:
     *
     * * All header names are lowercased.
     * * Duplicates of `age`, `authorization`, `content-length`, `content-type`,
     * `etag`, `expires`, `from`, `host`, `if-modified-since`, `if-unmodified-since`,
     * `last-modified`, `location`, `max-forwards`, `proxy-authorization`, `referer`,
     * `retry-after`, `server`, or `user-agent` are discarded.
     * * `set-cookie` is always an array. Duplicates are added to the array.
     * * For duplicate `cookie` headers, the values are joined together with '; '.
     * * For all other headers, the values are joined together with ', '.
     */
    var headers: js.core.ReadonlyRecord<String, Any /* (string) | (string[]) */>

    /**
     * A `string` indicating the HTTP protocol version number. Typical values are '1.0'
     * or '1.1'. Additionally `httpVersionMajor` and `httpVersionMinor` are two
     * Integer-valued readable properties that return respectively the HTTP major and
     * minor version numbers.
     */
    var httpVersion: String

    /**
     * An `Integer` indicating the HTTP protocol major version number.
     */
    var httpVersionMajor: Double

    /**
     * An `Integer` indicating the HTTP protocol minor version number.
     */
    var httpVersionMinor: Double

    /**
     * A `string[]` containing the raw HTTP response headers exactly as they were
     * received. The keys and values are in the same list. It is not a list of tuples.
     * So, the even-numbered offsets are key values, and the odd-numbered offsets are
     * the associated values. Header names are not lowercased, and duplicates are not
     * merged.
     */
    var rawHeaders: js.core.ReadonlyArray<String>

    /**
     * An `Integer` indicating the HTTP response status code.
     */
    var statusCode: Double

    /**
     * A `string` representing the HTTP status message.
     */
    var statusMessage: String
}
