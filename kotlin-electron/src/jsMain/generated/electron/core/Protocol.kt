package electron.core


external interface Protocol {
// Docs: https://electronjs.org/docs/api/protocol
    /**
     * Whether the protocol was successfully intercepted
     *
     * Intercepts `scheme` protocol and uses `handler` as the protocol's new handler
     * which sends a `Buffer` as a response.
     */
    fun interceptBufferProtocol(scheme: String, handler: (request: ProtocolRequest, callback: (response: Any /* (Buffer) | (ProtocolResponse) */) -> Unit) -> Unit): Boolean

    /**
     * Whether the protocol was successfully intercepted
     *
     * Intercepts `scheme` protocol and uses `handler` as the protocol's new handler
     * which sends a file as a response.
     */
    fun interceptFileProtocol(scheme: String, handler: (request: ProtocolRequest, callback: (response: Any /* (string) | (ProtocolResponse) */) -> Unit) -> Unit): Boolean

    /**
     * Whether the protocol was successfully intercepted
     *
     * Intercepts `scheme` protocol and uses `handler` as the protocol's new handler
     * which sends a new HTTP request as a response.
     */
    fun interceptHttpProtocol(scheme: String, handler: (request: ProtocolRequest, callback: (response: ProtocolResponse) -> Unit) -> Unit): Boolean

    /**
     * Whether the protocol was successfully intercepted
     *
     * Same as `protocol.registerStreamProtocol`, except that it replaces an existing
     * protocol handler.
     */
    fun interceptStreamProtocol(scheme: String, handler: (request: ProtocolRequest, callback: (response: Any /* (NodeJS.ReadableStream) | (ProtocolResponse) */) -> Unit) -> Unit): Boolean

    /**
     * Whether the protocol was successfully intercepted
     *
     * Intercepts `scheme` protocol and uses `handler` as the protocol's new handler
     * which sends a `string` as a response.
     */
    fun interceptStringProtocol(scheme: String, handler: (request: ProtocolRequest, callback: (response: Any /* (string) | (ProtocolResponse) */) -> Unit) -> Unit): Boolean

    /**
     * Whether `scheme` is already intercepted.
     */
    fun isProtocolIntercepted(scheme: String): Boolean

    /**
     * Whether `scheme` is already registered.
     */
    fun isProtocolRegistered(scheme: String): Boolean

    /**
     * Whether the protocol was successfully registered
     *
     * Registers a protocol of `scheme` that will send a `Buffer` as a response.
     *
     * The usage is the same with `registerFileProtocol`, except that the `callback`
     * should be called with either a `Buffer` object or an object that has the `data`
     * property.
     *
     * Example:
     */
    fun registerBufferProtocol(scheme: String, handler: (request: ProtocolRequest, callback: (response: Any /* (Buffer) | (ProtocolResponse) */) -> Unit) -> Unit): Boolean

    /**
     * Whether the protocol was successfully registered
     *
     * Registers a protocol of `scheme` that will send a file as the response. The
     * `handler` will be called with `request` and `callback` where `request` is an
     * incoming request for the `scheme`.
     *
     * To handle the `request`, the `callback` should be called with either the file's
     * path or an object that has a `path` property, e.g. `callback(filePath)` or
     * `callback({ path: filePath })`. The `filePath` must be an absolute path.
     *
     * By default the `scheme` is treated like `http:`, which is parsed differently
     * from protocols that follow the "generic URI syntax" like `file:`.
     */
    fun registerFileProtocol(scheme: String, handler: (request: ProtocolRequest, callback: (response: Any /* (string) | (ProtocolResponse) */) -> Unit) -> Unit): Boolean

    /**
     * Whether the protocol was successfully registered
     *
     * Registers a protocol of `scheme` that will send an HTTP request as a response.
     *
     * The usage is the same with `registerFileProtocol`, except that the `callback`
     * should be called with an object that has the `url` property.
     */
    fun registerHttpProtocol(scheme: String, handler: (request: ProtocolRequest, callback: (response: ProtocolResponse) -> Unit) -> Unit): Boolean

    /**
     * **Note:** This method can only be used before the `ready` event of the `app`
     * module gets emitted and can be called only once.
     *
     * Registers the `scheme` as standard, secure, bypasses content security policy for
     * resources, allows registering ServiceWorker, supports fetch API, and streaming
     * video/audio. Specify a privilege with the value of `true` to enable the
     * capability.
     *
     * An example of registering a privileged scheme, that bypasses Content Security
     * Policy:
     *
     * A standard scheme adheres to what RFC 3986 calls generic URI syntax. For example
     * `http` and `https` are standard schemes, while `file` is not.
     *
     * Registering a scheme as standard allows relative and absolute resources to be
     * resolved correctly when served. Otherwise the scheme will behave like the `file`
     * protocol, but without the ability to resolve relative URLs.
     *
     * For example when you load following page with custom protocol without
     * registering it as standard scheme, the image will not be loaded because
     * non-standard schemes can not recognize relative URLs:
     *
     * Registering a scheme as standard will allow access to files through the
     * FileSystem API. Otherwise the renderer will throw a security error for the
     * scheme.
     *
     * By default web storage apis (localStorage, sessionStorage, webSQL, indexedDB,
     * cookies) are disabled for non standard schemes. So in general if you want to
     * register a custom protocol to replace the `http` protocol, you have to register
     * it as a standard scheme.
     *
     * Protocols that use streams (http and stream protocols) should set `stream:
     * true`. The `<video>` and `<audio>` HTML elements expect protocols to buffer
     * their responses by default. The `stream` flag configures those elements to
     * correctly expect streaming responses.
     */
    fun registerSchemesAsPrivileged(customSchemes: js.core.ReadonlyArray<CustomScheme>): Unit

    /**
     * Whether the protocol was successfully registered
     *
     * Registers a protocol of `scheme` that will send a stream as a response.
     *
     * The usage is the same with `registerFileProtocol`, except that the `callback`
     * should be called with either a `ReadableStream` object or an object that has the
     * `data` property.
     *
     * Example:
     *
     * It is possible to pass any object that implements the readable stream API (emits
     * `data`/`end`/`error` events). For example, here's how a file could be returned:
     */
    fun registerStreamProtocol(scheme: String, handler: (request: ProtocolRequest, callback: (response: Any /* (NodeJS.ReadableStream) | (ProtocolResponse) */) -> Unit) -> Unit): Boolean

    /**
     * Whether the protocol was successfully registered
     *
     * Registers a protocol of `scheme` that will send a `string` as a response.
     *
     * The usage is the same with `registerFileProtocol`, except that the `callback`
     * should be called with either a `string` or an object that has the `data`
     * property.
     */
    fun registerStringProtocol(scheme: String, handler: (request: ProtocolRequest, callback: (response: Any /* (string) | (ProtocolResponse) */) -> Unit) -> Unit): Boolean

    /**
     * Whether the protocol was successfully unintercepted
     *
     * Remove the interceptor installed for `scheme` and restore its original handler.
     */
    fun uninterceptProtocol(scheme: String): Boolean

    /**
     * Whether the protocol was successfully unregistered
     *
     * Unregisters the custom protocol of `scheme`.
     */
    fun unregisterProtocol(scheme: String): Boolean
}
