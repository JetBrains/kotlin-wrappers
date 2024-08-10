// Generated by Karakum - do not modify it manually!

package node.http2

sealed external interface ServerHttp2Session : Http2Session {
    val server: Any /* Http2Server | Http2SecureServer */

    /**
     * Submits an `ALTSVC` frame (as defined by [RFC 7838](https://tools.ietf.org/html/rfc7838)) to the connected client.
     *
     * ```js
     * const http2 = require('node:http2');
     *
     * const server = http2.createServer();
     * server.on('session', (session) => {
     *   // Set altsvc for origin https://example.org:80
     *   session.altsvc('h2=":8000"', 'https://example.org:80');
     * });
     *
     * server.on('stream', (stream) => {
     *   // Set altsvc for a specific stream
     *   stream.session.altsvc('h2=":8000"', stream.id);
     * });
     * ```
     *
     * Sending an `ALTSVC` frame with a specific stream ID indicates that the alternate
     * service is associated with the origin of the given `Http2Stream`.
     *
     * The `alt` and origin string _must_ contain only ASCII bytes and are
     * strictly interpreted as a sequence of ASCII bytes. The special value `'clear'`may be passed to clear any previously set alternative service for a given
     * domain.
     *
     * When a string is passed for the `originOrStream` argument, it will be parsed as
     * a URL and the origin will be derived. For instance, the origin for the
     * HTTP URL `'https://example.org/foo/bar'` is the ASCII string`'https://example.org'`. An error will be thrown if either the given string
     * cannot be parsed as a URL or if a valid origin cannot be derived.
     *
     * A `URL` object, or any object with an `origin` property, may be passed as`originOrStream`, in which case the value of the `origin` property will be
     * used. The value of the `origin` property _must_ be a properly serialized
     * ASCII origin.
     * @since v9.4.0
     * @param alt A description of the alternative service configuration as defined by `RFC 7838`.
     * @param originOrStream Either a URL string specifying the origin (or an `Object` with an `origin` property) or the numeric identifier of an active `Http2Stream` as given by the
     * `http2stream.id` property.
     */
    fun altsvc(alt: String, originOrStream: Double): Unit

    /**
     * Submits an `ALTSVC` frame (as defined by [RFC 7838](https://tools.ietf.org/html/rfc7838)) to the connected client.
     *
     * ```js
     * const http2 = require('node:http2');
     *
     * const server = http2.createServer();
     * server.on('session', (session) => {
     *   // Set altsvc for origin https://example.org:80
     *   session.altsvc('h2=":8000"', 'https://example.org:80');
     * });
     *
     * server.on('stream', (stream) => {
     *   // Set altsvc for a specific stream
     *   stream.session.altsvc('h2=":8000"', stream.id);
     * });
     * ```
     *
     * Sending an `ALTSVC` frame with a specific stream ID indicates that the alternate
     * service is associated with the origin of the given `Http2Stream`.
     *
     * The `alt` and origin string _must_ contain only ASCII bytes and are
     * strictly interpreted as a sequence of ASCII bytes. The special value `'clear'`may be passed to clear any previously set alternative service for a given
     * domain.
     *
     * When a string is passed for the `originOrStream` argument, it will be parsed as
     * a URL and the origin will be derived. For instance, the origin for the
     * HTTP URL `'https://example.org/foo/bar'` is the ASCII string`'https://example.org'`. An error will be thrown if either the given string
     * cannot be parsed as a URL or if a valid origin cannot be derived.
     *
     * A `URL` object, or any object with an `origin` property, may be passed as`originOrStream`, in which case the value of the `origin` property will be
     * used. The value of the `origin` property _must_ be a properly serialized
     * ASCII origin.
     * @since v9.4.0
     * @param alt A description of the alternative service configuration as defined by `RFC 7838`.
     * @param originOrStream Either a URL string specifying the origin (or an `Object` with an `origin` property) or the numeric identifier of an active `Http2Stream` as given by the
     * `http2stream.id` property.
     */
    fun altsvc(alt: String, originOrStream: String): Unit

    /**
     * Submits an `ALTSVC` frame (as defined by [RFC 7838](https://tools.ietf.org/html/rfc7838)) to the connected client.
     *
     * ```js
     * const http2 = require('node:http2');
     *
     * const server = http2.createServer();
     * server.on('session', (session) => {
     *   // Set altsvc for origin https://example.org:80
     *   session.altsvc('h2=":8000"', 'https://example.org:80');
     * });
     *
     * server.on('stream', (stream) => {
     *   // Set altsvc for a specific stream
     *   stream.session.altsvc('h2=":8000"', stream.id);
     * });
     * ```
     *
     * Sending an `ALTSVC` frame with a specific stream ID indicates that the alternate
     * service is associated with the origin of the given `Http2Stream`.
     *
     * The `alt` and origin string _must_ contain only ASCII bytes and are
     * strictly interpreted as a sequence of ASCII bytes. The special value `'clear'`may be passed to clear any previously set alternative service for a given
     * domain.
     *
     * When a string is passed for the `originOrStream` argument, it will be parsed as
     * a URL and the origin will be derived. For instance, the origin for the
     * HTTP URL `'https://example.org/foo/bar'` is the ASCII string`'https://example.org'`. An error will be thrown if either the given string
     * cannot be parsed as a URL or if a valid origin cannot be derived.
     *
     * A `URL` object, or any object with an `origin` property, may be passed as`originOrStream`, in which case the value of the `origin` property will be
     * used. The value of the `origin` property _must_ be a properly serialized
     * ASCII origin.
     * @since v9.4.0
     * @param alt A description of the alternative service configuration as defined by `RFC 7838`.
     * @param originOrStream Either a URL string specifying the origin (or an `Object` with an `origin` property) or the numeric identifier of an active `Http2Stream` as given by the
     * `http2stream.id` property.
     */
    fun altsvc(alt: String, originOrStream: web.url.URL): Unit

    /**
     * Submits an `ALTSVC` frame (as defined by [RFC 7838](https://tools.ietf.org/html/rfc7838)) to the connected client.
     *
     * ```js
     * const http2 = require('node:http2');
     *
     * const server = http2.createServer();
     * server.on('session', (session) => {
     *   // Set altsvc for origin https://example.org:80
     *   session.altsvc('h2=":8000"', 'https://example.org:80');
     * });
     *
     * server.on('stream', (stream) => {
     *   // Set altsvc for a specific stream
     *   stream.session.altsvc('h2=":8000"', stream.id);
     * });
     * ```
     *
     * Sending an `ALTSVC` frame with a specific stream ID indicates that the alternate
     * service is associated with the origin of the given `Http2Stream`.
     *
     * The `alt` and origin string _must_ contain only ASCII bytes and are
     * strictly interpreted as a sequence of ASCII bytes. The special value `'clear'`may be passed to clear any previously set alternative service for a given
     * domain.
     *
     * When a string is passed for the `originOrStream` argument, it will be parsed as
     * a URL and the origin will be derived. For instance, the origin for the
     * HTTP URL `'https://example.org/foo/bar'` is the ASCII string`'https://example.org'`. An error will be thrown if either the given string
     * cannot be parsed as a URL or if a valid origin cannot be derived.
     *
     * A `URL` object, or any object with an `origin` property, may be passed as`originOrStream`, in which case the value of the `origin` property will be
     * used. The value of the `origin` property _must_ be a properly serialized
     * ASCII origin.
     * @since v9.4.0
     * @param alt A description of the alternative service configuration as defined by `RFC 7838`.
     * @param originOrStream Either a URL string specifying the origin (or an `Object` with an `origin` property) or the numeric identifier of an active `Http2Stream` as given by the
     * `http2stream.id` property.
     */
    fun altsvc(alt: String, originOrStream: AlternativeServiceOptions): Unit

    /**
     * Submits an `ORIGIN` frame (as defined by [RFC 8336](https://tools.ietf.org/html/rfc8336)) to the connected client
     * to advertise the set of origins for which the server is capable of providing
     * authoritative responses.
     *
     * ```js
     * const http2 = require('node:http2');
     * const options = getSecureOptionsSomehow();
     * const server = http2.createSecureServer(options);
     * server.on('stream', (stream) => {
     *   stream.respond();
     *   stream.end('ok');
     * });
     * server.on('session', (session) => {
     *   session.origin('https://example.com', 'https://example.org');
     * });
     * ```
     *
     * When a string is passed as an `origin`, it will be parsed as a URL and the
     * origin will be derived. For instance, the origin for the HTTP URL `'https://example.org/foo/bar'` is the ASCII string` 'https://example.org'`. An error will be thrown if either the given
     * string
     * cannot be parsed as a URL or if a valid origin cannot be derived.
     *
     * A `URL` object, or any object with an `origin` property, may be passed as
     * an `origin`, in which case the value of the `origin` property will be
     * used. The value of the `origin` property _must_ be a properly serialized
     * ASCII origin.
     *
     * Alternatively, the `origins` option may be used when creating a new HTTP/2
     * server using the `http2.createSecureServer()` method:
     *
     * ```js
     * const http2 = require('node:http2');
     * const options = getSecureOptionsSomehow();
     * options.origins = ['https://example.com', 'https://example.org'];
     * const server = http2.createSecureServer(options);
     * server.on('stream', (stream) => {
     *   stream.respond();
     *   stream.end('ok');
     * });
     * ```
     * @since v10.12.0
     * @param origins One or more URL Strings passed as separate arguments.
     */
    fun origin(
        vararg origins: Array<Any /* string | url.URL | {
    origin: string;
} */>,
    ): Unit

    fun addListener(
        event: ServerHttp2SessionEvent.CONNECT,
        listener: (session: ServerHttp2Session, socket: Any /* net.Socket | tls.TLSSocket */) -> Unit,
    ): Unit /* this */

    fun addListener(
        event: ServerHttp2SessionEvent.STREAM,
        listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Double) -> Unit,
    ): Unit /* this */

    override fun addListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun addListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    fun emit(event: ServerHttp2SessionEvent.CONNECT, session: ServerHttp2Session, socket: node.net.Socket): Boolean

    fun emit(event: ServerHttp2SessionEvent.CONNECT, session: ServerHttp2Session, socket: node.tls.TLSSocket): Boolean
    fun emit(
        event: ServerHttp2SessionEvent.STREAM,
        stream: ServerHttp2Stream,
        headers: IncomingHttpHeaders,
        flags: Number,
    ): Boolean

    override fun emit(event: String, vararg args: Any?): Boolean

    override fun emit(event: js.symbol.Symbol, vararg args: Any?): Boolean
    fun on(
        event: ServerHttp2SessionEvent.CONNECT,
        listener: (session: ServerHttp2Session, socket: Any /* net.Socket | tls.TLSSocket */) -> Unit,
    ): Unit /* this */

    fun on(
        event: ServerHttp2SessionEvent.STREAM,
        listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Double) -> Unit,
    ): Unit /* this */

    override fun on(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun on(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun once(
        event: ServerHttp2SessionEvent.CONNECT,
        listener: (session: ServerHttp2Session, socket: Any /* net.Socket | tls.TLSSocket */) -> Unit,
    ): Unit /* this */

    fun once(
        event: ServerHttp2SessionEvent.STREAM,
        listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Double) -> Unit,
    ): Unit /* this */

    override fun once(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun once(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */
    fun prependListener(
        event: ServerHttp2SessionEvent.CONNECT,
        listener: (session: ServerHttp2Session, socket: Any /* net.Socket | tls.TLSSocket */) -> Unit,
    ): Unit /* this */

    fun prependListener(
        event: ServerHttp2SessionEvent.STREAM,
        listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Double) -> Unit,
    ): Unit /* this */

    override fun prependListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    override fun prependListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    fun prependOnceListener(
        event: ServerHttp2SessionEvent.CONNECT,
        listener: (session: ServerHttp2Session, socket: Any /* net.Socket | tls.TLSSocket */) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: ServerHttp2SessionEvent.STREAM,
        listener: (stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Double) -> Unit,
    ): Unit /* this */

    override fun prependOnceListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    override fun prependOnceListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */
}
