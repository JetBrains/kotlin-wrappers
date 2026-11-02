// Automatically generated - do not modify!

package electron.core

external interface Protocol {
// Docs: https://electronjs.org/docs/api/protocol
    /**
     * The source registered for `scheme` with `protocol.registerSource`, or `null`.
     *
     * @experimental
     */
    fun getSource(scheme: String): ProtocolSource?

    /**
     * Register a protocol handler for `scheme`. Requests made to URLs with this scheme
     * will delegate to this handler to determine what response should be sent.
     *
     * In addition to the standard `Request` fields, `request.initiatorOrigin` is set
     * to the origin that issued the request (for example `https://example.com`, or
     * `null` for an opaque origin) when web content made it; it is absent for requests
     * the browser started itself. Unlike `request.referrer` it is not controlled by
     * the requesting page, so prefer it when deciding whether to serve a request.
     *
     * Either a `Response` or a `Promise<Response>` can be returned.
     *
     * Example:
     *
     * See the MDN docs for `Request` and `Response` for more details.
     */
    fun handle(
        scheme: String,
        handler: (request: GlobalRequest) -> Any, /* (GlobalResponse) | (Promise<GlobalResponse>) */
    )

    /**
     * Whether `scheme` already has a handler or a source.
     */
    fun isProtocolHandled(scheme: String): Boolean

    /**
     * > [!NOTE] This method can only be used before the `ready` event of the `app`
     * module gets emitted and can be called only once.
     *
     * Registers the `scheme` as standard, secure, bypasses content security policy for
     * resources, allows registering ServiceWorker, supports fetch API, streaming
     * video/audio, and V8 code cache. Specify a privilege with the value of `true` to
     * enable the capability.
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
    fun registerSchemesAsPrivileged(customSchemes: js.array.ReadonlyArray<CustomScheme>)

    /**
     * Serves `scheme` from directories on disk without a JavaScript handler. Each
     * request is matched against `routes` (a route with a `host` wins over one
     * without, then the longest `path` prefix wins), the rest of the URL's path is
     * resolved inside that route's `root`, and the file is streamed to the requester
     * the way `file:` URLs are, including from `asar` archives, with `Content-Type`
     * taken from the file extension. A path that resolves outside `root`, a missing
     * file, a request that matches no route, or a method other than `GET`/`HEAD` fails
     * with `net::ERR_FILE_NOT_FOUND`. A URL whose path ends in `/` serves the route's
     * `index` file.
     *
     * Use this instead of `protocol.handle` when a scheme only serves an app's own
     * bundled files: no request touches the main thread, so pages and their
     * subresources load at the same speed whether or not the main process is busy.
     *
     * A scheme has either a handler or a source; `protocol.unhandle` removes either,
     * and `protocol.isProtocolHandled` reports both. `webRequest` listeners apply to
     * these requests as to any other.
     *
     * @experimental
     */
    fun registerSource(
        scheme: String,
        source: ProtocolSource,
    )

    /**
     * Removes a protocol handler registered with `protocol.handle` or a source
     * registered with `protocol.registerSource`.
     */
    fun unhandle(scheme: String)
}
