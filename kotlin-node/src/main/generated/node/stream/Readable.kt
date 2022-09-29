// Automatically generated - do not modify!

@file:JsModule("node:stream")
@file:JsNonModule

package node.stream

import node.events.Event
import node.events.EventType

open external class Readable : Stream, node.ReadableStream {
    /**
     * Returns whether the stream was destroyed or errored before emitting `'end'`.
     * @since v16.8.0
     * @experimental
     */
    open val readableAborted: Boolean

    /**
     * Is `true` if it is safe to call `readable.read()`, which means
     * the stream has not been destroyed or emitted `'error'` or `'end'`.
     * @since v11.4.0
     */
    override var readable: Boolean

    /**
     * Returns whether `'data'` has been emitted.
     * @since v16.7.0, v14.18.0
     * @experimental
     */
    open val readableDidRead: Boolean

    /**
     * Getter for the property `encoding` of a given `Readable` stream. The `encoding`property can be set using the `readable.setEncoding()` method.
     * @since v12.7.0
     */
    open val readableEncoding: node.buffer.BufferEncoding?

    /**
     * Becomes `true` when `'end'` event is emitted.
     * @since v12.9.0
     */
    open val readableEnded: Boolean

    /**
     * This property reflects the current state of a `Readable` stream as described
     * in the `Three states` section.
     * @since v9.4.0
     */
    open val readableFlowing: Boolean?

    /**
     * Returns the value of `highWaterMark` passed when creating this `Readable`.
     * @since v9.3.0
     */
    open val readableHighWaterMark: Number

    /**
     * This property contains the number of bytes (or objects) in the queue
     * ready to be read. The value provides introspection data regarding
     * the status of the `highWaterMark`.
     * @since v9.4.0
     */
    open val readableLength: Number

    /**
     * Getter for the property `objectMode` of a given `Readable` stream.
     * @since v12.3.0
     */
    open val readableObjectMode: Boolean

    /**
     * Is `true` after `readable.destroy()` has been called.
     * @since v18.0.0
     */
    open var destroyed: Boolean

    /**
     * Is true after 'close' has been emitted.
     * @since v8.0.0
     */
    open val closed: Boolean

    /**
     * Returns error if the stream has been destroyed with an error.
     * @since v18.0.0
     */
    open val errored: Error?

    constructor(opts: ReadableOptions = definedExternally)

    open var _construct: ((callback: (error: Error?) -> Unit) -> Unit)?
    open fun _read(size: Number)

    /**
     * The `readable.read()` method reads data out of the internal buffer and
     * returns it. If no data is available to be read, `null` is returned. By default,
     * the data is returned as a `Buffer` object unless an encoding has been
     * specified using the `readable.setEncoding()` method or the stream is operating
     * in object mode.
     *
     * The optional `size` argument specifies a specific number of bytes to read. If`size` bytes are not available to be read, `null` will be returned _unless_the stream has ended, in which
     * case all of the data remaining in the internal
     * buffer will be returned.
     *
     * If the `size` argument is not specified, all of the data contained in the
     * internal buffer will be returned.
     *
     * The `size` argument must be less than or equal to 1 GiB.
     *
     * The `readable.read()` method should only be called on `Readable` streams
     * operating in paused mode. In flowing mode, `readable.read()` is called
     * automatically until the internal buffer is fully drained.
     *
     * ```js
     * const readable = getReadableStreamSomehow();
     *
     * // 'readable' may be triggered multiple times as data is buffered in
     * readable.on('readable', () => {
     *   let chunk;
     *   console.log('Stream is readable (new data received in buffer)');
     *   // Use a loop to make sure we read all currently available data
     *   while (null !== (chunk = readable.read())) {
     *     console.log(`Read ${chunk.length} bytes of data...`);
     *   }
     * });
     *
     * // 'end' will be triggered once when there is no more data available
     * readable.on('end', () => {
     *   console.log('Reached end of stream.');
     * });
     * ```
     *
     * Each call to `readable.read()` returns a chunk of data, or `null`. The chunks
     * are not concatenated. A `while` loop is necessary to consume all data
     * currently in the buffer. When reading a large file `.read()` may return `null`,
     * having consumed all buffered content so far, but there is still more data to
     * come not yet buffered. In this case a new `'readable'` event will be emitted
     * when there is more data in the buffer. Finally the `'end'` event will be
     * emitted when there is no more data to come.
     *
     * Therefore to read a file's whole contents from a `readable`, it is necessary
     * to collect chunks across multiple `'readable'` events:
     *
     * ```js
     * const chunks = [];
     *
     * readable.on('readable', () => {
     *   let chunk;
     *   while (null !== (chunk = readable.read())) {
     *     chunks.push(chunk);
     *   }
     * });
     *
     * readable.on('end', () => {
     *   const content = chunks.join('');
     * });
     * ```
     *
     * A `Readable` stream in object mode will always return a single item from
     * a call to `readable.read(size)`, regardless of the value of the`size` argument.
     *
     * If the `readable.read()` method returns a chunk of data, a `'data'` event will
     * also be emitted.
     *
     * Calling {@link read} after the `'end'` event has
     * been emitted will return `null`. No runtime error will be raised.
     * @since v0.9.4
     * @param size Optional argument to specify how much data to read.
     */
    override fun read(size: Number): Any

    /**
     * The `readable.setEncoding()` method sets the character encoding for
     * data read from the `Readable` stream.
     *
     * By default, no encoding is assigned and stream data will be returned as`Buffer` objects. Setting an encoding causes the stream data
     * to be returned as strings of the specified encoding rather than as `Buffer`objects. For instance, calling `readable.setEncoding('utf8')` will cause the
     * output data to be interpreted as UTF-8 data, and passed as strings. Calling`readable.setEncoding('hex')` will cause the data to be encoded in hexadecimal
     * string format.
     *
     * The `Readable` stream will properly handle multi-byte characters delivered
     * through the stream that would otherwise become improperly decoded if simply
     * pulled from the stream as `Buffer` objects.
     *
     * ```js
     * const readable = getReadableStreamSomehow();
     * readable.setEncoding('utf8');
     * readable.on('data', (chunk) => {
     *   assert.equal(typeof chunk, 'string');
     *   console.log('Got %d characters of string data:', chunk.length);
     * });
     * ```
     * @since v0.9.4
     * @param encoding The encoding to use.
     */
    override fun setEncoding(encoding: node.buffer.BufferEncoding) /* : this */

    /**
     * The `readable.pause()` method will cause a stream in flowing mode to stop
     * emitting `'data'` events, switching out of flowing mode. Any data that
     * becomes available will remain in the internal buffer.
     *
     * ```js
     * const readable = getReadableStreamSomehow();
     * readable.on('data', (chunk) => {
     *   console.log(`Received ${chunk.length} bytes of data.`);
     *   readable.pause();
     *   console.log('There will be no additional data for 1 second.');
     *   setTimeout(() => {
     *     console.log('Now data will start flowing again.');
     *     readable.resume();
     *   }, 1000);
     * });
     * ```
     *
     * The `readable.pause()` method has no effect if there is a `'readable'`event listener.
     * @since v0.9.4
     */
    override fun pause() /* : this */

    /**
     * The `readable.resume()` method causes an explicitly paused `Readable` stream to
     * resume emitting `'data'` events, switching the stream into flowing mode.
     *
     * The `readable.resume()` method can be used to fully consume the data from a
     * stream without actually processing any of that data:
     *
     * ```js
     * getReadableStreamSomehow()
     *   .resume()
     *   .on('end', () => {
     *     console.log('Reached the end, but did not read anything.');
     *   });
     * ```
     *
     * The `readable.resume()` method has no effect if there is a `'readable'`event listener.
     * @since v0.9.4
     */
    override fun resume() /* : this */

    /**
     * The `readable.isPaused()` method returns the current operating state of the`Readable`. This is used primarily by the mechanism that underlies the`readable.pipe()` method. In most
     * typical cases, there will be no reason to
     * use this method directly.
     *
     * ```js
     * const readable = new stream.Readable();
     *
     * readable.isPaused(); // === false
     * readable.pause();
     * readable.isPaused(); // === true
     * readable.resume();
     * readable.isPaused(); // === false
     * ```
     * @since v0.11.14
     */
    override fun isPaused(): Boolean

    /**
     * The `readable.unpipe()` method detaches a `Writable` stream previously attached
     * using the {@link pipe} method.
     *
     * If the `destination` is not specified, then _all_ pipes are detached.
     *
     * If the `destination` is specified, but no pipe is set up for it, then
     * the method does nothing.
     *
     * ```js
     * const fs = require('fs');
     * const readable = getReadableStreamSomehow();
     * const writable = fs.createWriteStream('file.txt');
     * // All the data from readable goes into 'file.txt',
     * // but only for the first second.
     * readable.pipe(writable);
     * setTimeout(() => {
     *   console.log('Stop writing to file.txt.');
     *   readable.unpipe(writable);
     *   console.log('Manually close the file stream.');
     *   writable.end();
     * }, 1000);
     * ```
     * @since v0.9.4
     * @param destination Optional specific stream to unpipe
     */
    override fun unpipe(destination: node.WritableStream) /* : this */

    /**
     * Passing `chunk` as `null` signals the end of the stream (EOF) and behaves the
     * same as `readable.push(null)`, after which no more data can be written. The EOF
     * signal is put at the end of the buffer and any buffered data will still be
     * flushed.
     *
     * The `readable.unshift()` method pushes a chunk of data back into the internal
     * buffer. This is useful in certain situations where a stream is being consumed by
     * code that needs to "un-consume" some amount of data that it has optimistically
     * pulled out of the source, so that the data can be passed on to some other party.
     *
     * The `stream.unshift(chunk)` method cannot be called after the `'end'` event
     * has been emitted or a runtime error will be thrown.
     *
     * Developers using `stream.unshift()` often should consider switching to
     * use of a `Transform` stream instead. See the `API for stream implementers` section for more information.
     *
     * ```js
     * // Pull off a header delimited by \n\n.
     * // Use unshift() if we get too much.
     * // Call the callback with (error, header, stream).
     * const { StringDecoder } = require('string_decoder');
     * function parseHeader(stream, callback) {
     *   stream.on('error', callback);
     *   stream.on('readable', onReadable);
     *   const decoder = new StringDecoder('utf8');
     *   let header = '';
     *   function onReadable() {
     *     let chunk;
     *     while (null !== (chunk = stream.read())) {
     *       const str = decoder.write(chunk);
     *       if (str.includes('\n\n')) {
     *         // Found the header boundary.
     *         const split = str.split(/\n\n/);
     *         header += split.shift();
     *         const remaining = split.join('\n\n');
     *         const buf = Buffer.from(remaining, 'utf8');
     *         stream.removeListener('error', callback);
     *         // Remove the 'readable' listener before unshifting.
     *         stream.removeListener('readable', onReadable);
     *         if (buf.length)
     *           stream.unshift(buf);
     *         // Now the body of the message can be read from the stream.
     *         callback(null, header, stream);
     *         return;
     *       }
     *       // Still reading the header.
     *       header += str;
     *     }
     *   }
     * }
     * ```
     *
     * Unlike {@link push}, `stream.unshift(chunk)` will not
     * end the reading process by resetting the internal reading state of the stream.
     * This can cause unexpected results if `readable.unshift()` is called during a
     * read (i.e. from within a {@link _read} implementation on a
     * custom stream). Following the call to `readable.unshift()` with an immediate {@link push} will reset the reading state appropriately,
     * however it is best to simply avoid calling `readable.unshift()` while in the
     * process of performing a read.
     * @since v0.9.11
     * @param chunk Chunk of data to unshift onto the read queue. For streams not operating in object mode, `chunk` must be a string, `Buffer`, `Uint8Array` or `null`. For object mode
     * streams, `chunk` may be any JavaScript value.
     * @param encoding Encoding of string chunks. Must be a valid `Buffer` encoding, such as `'utf8'` or `'ascii'`.
     */
    override fun unshift(
        chunk: Any,
        encoding: node.buffer.BufferEncoding,
    )

    /**
     * Prior to Node.js 0.10, streams did not implement the entire `stream` module API
     * as it is currently defined. (See `Compatibility` for more information.)
     *
     * When using an older Node.js library that emits `'data'` events and has a {@link pause} method that is advisory only, the`readable.wrap()` method can be used to create a `Readable`
     * stream that uses
     * the old stream as its data source.
     *
     * It will rarely be necessary to use `readable.wrap()` but the method has been
     * provided as a convenience for interacting with older Node.js applications and
     * libraries.
     *
     * ```js
     * const { OldReader } = require('./old-api-module.js');
     * const { Readable } = require('stream');
     * const oreader = new OldReader();
     * const myReader = new Readable().wrap(oreader);
     *
     * myReader.on('readable', () => {
     *   myReader.read(); // etc.
     * });
     * ```
     * @since v0.9.4
     * @param stream An "old style" readable stream
     */
    override fun wrap(stream: node.ReadableStream) /* : this */
    open fun push(
        chunk: Any,
        encoding: node.buffer.BufferEncoding = definedExternally,
    ): Boolean

    open fun _destroy(
        error: Error?,
        callback: (error: Error?) -> Unit,
    )

    /**
     * Destroy the stream. Optionally emit an `'error'` event, and emit a `'close'`event (unless `emitClose` is set to `false`). After this call, the readable
     * stream will release any internal resources and subsequent calls to `push()`will be ignored.
     *
     * Once `destroy()` has been called any further calls will be a no-op and no
     * further errors except from `_destroy()` may be emitted as `'error'`.
     *
     * Implementors should not override this method, but instead implement `readable._destroy()`.
     * @since v8.0.0
     * @param error Error which will be passed as payload in `'error'` event
     */
    open fun destroy(error: Error = definedExternally) /* : this */

    /**
     * Event emitter
     * The defined events on documents including:
     * 1. close
     * 2. data
     * 3. end
     * 4. error
     * 5. pause
     * 6. readable
     * 7. resume
     */
    open fun addListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    open fun addListener(
        event: Event.DATA,
        listener: (chunk: Any) -> Unit,
    ) /* : this */

    open fun addListener(
        event: Event.END,
        listener: () -> Unit,
    ) /* : this */

    open fun addListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun addListener(
        event: Event.PAUSE,
        listener: () -> Unit,
    ) /* : this */

    open fun addListener(
        event: Event.READABLE,
        listener: () -> Unit,
    ) /* : this */

    open fun addListener(
        event: Event.RESUME,
        listener: () -> Unit,
    ) /* : this */

    override fun addListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    open fun emit(event: Event.CLOSE): Boolean
    open fun emit(
        event: Event.DATA,
        chunk: Any,
    ): Boolean

    open fun emit(event: Event.END): Boolean
    open fun emit(
        event: Event.ERROR,
        err: Error,
    ): Boolean

    open fun emit(event: Event.PAUSE): Boolean
    open fun emit(event: Event.READABLE): Boolean
    open fun emit(event: Event.RESUME): Boolean
    override fun emit(
        event: EventType,
        vararg args: Any,
    ): Boolean

    open fun on(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    open fun on(
        event: Event.DATA,
        listener: (chunk: Any) -> Unit,
    ) /* : this */

    open fun on(
        event: Event.END,
        listener: () -> Unit,
    ) /* : this */

    open fun on(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun on(
        event: Event.PAUSE,
        listener: () -> Unit,
    ) /* : this */

    open fun on(
        event: Event.READABLE,
        listener: () -> Unit,
    ) /* : this */

    open fun on(
        event: Event.RESUME,
        listener: () -> Unit,
    ) /* : this */

    override fun on(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    open fun once(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    open fun once(
        event: Event.DATA,
        listener: (chunk: Any) -> Unit,
    ) /* : this */

    open fun once(
        event: Event.END,
        listener: () -> Unit,
    ) /* : this */

    open fun once(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun once(
        event: Event.PAUSE,
        listener: () -> Unit,
    ) /* : this */

    open fun once(
        event: Event.READABLE,
        listener: () -> Unit,
    ) /* : this */

    open fun once(
        event: Event.RESUME,
        listener: () -> Unit,
    ) /* : this */

    override fun once(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    open fun prependListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    open fun prependListener(
        event: Event.DATA,
        listener: (chunk: Any) -> Unit,
    ) /* : this */

    open fun prependListener(
        event: Event.END,
        listener: () -> Unit,
    ) /* : this */

    open fun prependListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun prependListener(
        event: Event.PAUSE,
        listener: () -> Unit,
    ) /* : this */

    open fun prependListener(
        event: Event.READABLE,
        listener: () -> Unit,
    ) /* : this */

    open fun prependListener(
        event: Event.RESUME,
        listener: () -> Unit,
    ) /* : this */

    override fun prependListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.DATA,
        listener: (chunk: Any) -> Unit,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.END,
        listener: () -> Unit,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.PAUSE,
        listener: () -> Unit,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.READABLE,
        listener: () -> Unit,
    ) /* : this */

    open fun prependOnceListener(
        event: Event.RESUME,
        listener: () -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    open fun removeListener(
        event: Event.CLOSE,
        listener: () -> Unit,
    ) /* : this */

    open fun removeListener(
        event: Event.DATA,
        listener: (chunk: Any) -> Unit,
    ) /* : this */

    open fun removeListener(
        event: Event.END,
        listener: () -> Unit,
    ) /* : this */

    open fun removeListener(
        event: Event.ERROR,
        listener: (error: Error) -> Unit,
    ) /* : this */

    open fun removeListener(
        event: Event.PAUSE,
        listener: () -> Unit,
    ) /* : this */

    open fun removeListener(
        event: Event.READABLE,
        listener: () -> Unit,
    ) /* : this */

    open fun removeListener(
        event: Event.RESUME,
        listener: () -> Unit,
    ) /* : this */

    override fun removeListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */
    /* [Symbol.asyncIterator](): AsyncIterableIterator<any> */

    companion object {
        /**
         * A utility method for creating Readable Streams out of iterators.
         */
        fun from(
            iterable: Any, /* Iterable<any> | AsyncIterable<any> */
            options: ReadableOptions = definedExternally,
        ): Readable

        /**
         * A utility method for creating a `Readable` from a web `ReadableStream`.
         * @since v17.0.0
         * @experimental
         */
        fun fromWeb(
            readableStream: web.stream.ReadableStream<*>,
            options: ReadableOptions = definedExternally,
        ): Readable

        /**
         * Returns whether the stream has been read from or cancelled.
         * @since v16.8.0
         */
        fun isDisturbed(stream: Any /* Readable | NodeJS.ReadableStream */): Boolean

        /**
         * A utility method for creating a web `ReadableStream` from a `Readable`.
         * @since v17.0.0
         * @experimental
         */
        fun toWeb(streamReadable: Readable): web.stream.ReadableStream<*>
    }
}
