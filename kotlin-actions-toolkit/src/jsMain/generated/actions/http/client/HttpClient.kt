// Automatically generated - do not modify!

@file:JsModule("@actions/http-client")

package actions.http.client

import js.core.ReadonlyArray
import js.errors.JsError
import js.promise.Promise

external class HttpClient {
    var userAgent: String?
    var handlers: ReadonlyArray<RequestHandler>
    var requestOptions: RequestOptions?

    constructor(
        userAgent: String = definedExternally,
        handlers: ReadonlyArray<RequestHandler> = definedExternally,
        requestOptions: RequestOptions = definedExternally,
    )

    fun options(
        requestUrl: String,
        additionalHeaders: node.http.OutgoingHttpHeaders = definedExternally,
    ): Promise<HttpClientResponse>

    fun get(
        requestUrl: String,
        additionalHeaders: node.http.OutgoingHttpHeaders = definedExternally,
    ): Promise<HttpClientResponse>

    fun del(
        requestUrl: String,
        additionalHeaders: node.http.OutgoingHttpHeaders = definedExternally,
    ): Promise<HttpClientResponse>

    fun post(
        requestUrl: String,
        data: String,
        additionalHeaders: node.http.OutgoingHttpHeaders = definedExternally,
    ): Promise<HttpClientResponse>

    fun patch(
        requestUrl: String,
        data: String,
        additionalHeaders: node.http.OutgoingHttpHeaders = definedExternally,
    ): Promise<HttpClientResponse>

    fun put(
        requestUrl: String,
        data: String,
        additionalHeaders: node.http.OutgoingHttpHeaders = definedExternally,
    ): Promise<HttpClientResponse>

    fun head(
        requestUrl: String,
        additionalHeaders: node.http.OutgoingHttpHeaders = definedExternally,
    ): Promise<HttpClientResponse>

    fun sendStream(
        verb: String,
        requestUrl: String,
        stream: node.ReadableStream,
        additionalHeaders: node.http.OutgoingHttpHeaders = definedExternally,
    ): Promise<HttpClientResponse>

    /**
     * Gets a typed object from an endpoint
     * Be aware that not found returns a null.  Other errors (4xx, 5xx) reject the promise
     */
    fun <T> getJson(
        requestUrl: String,
        additionalHeaders: node.http.OutgoingHttpHeaders = definedExternally,
    ): Promise<TypedResponse<T>>

    fun <T> postJson(
        requestUrl: String,
        obj: Any?,
        additionalHeaders: node.http.OutgoingHttpHeaders = definedExternally,
    ): Promise<TypedResponse<T>>

    fun <T> putJson(
        requestUrl: String,
        obj: Any?,
        additionalHeaders: node.http.OutgoingHttpHeaders = definedExternally,
    ): Promise<TypedResponse<T>>

    fun <T> patchJson(
        requestUrl: String,
        obj: Any?,
        additionalHeaders: node.http.OutgoingHttpHeaders = definedExternally,
    ): Promise<TypedResponse<T>>

    /**
     * Makes a raw http request.
     * All other methods such as get, post, patch, and request ultimately call this.
     * Prefer get, del, post and patch
     */
    fun request(
        verb: String,
        requestUrl: String,
        data: String?,
        headers: node.http.OutgoingHttpHeaders = definedExternally,
    ): Promise<HttpClientResponse>

    fun request(
        verb: String,
        requestUrl: String,
        data: node.ReadableStream?,
        headers: node.http.OutgoingHttpHeaders = definedExternally,
    ): Promise<HttpClientResponse>

    /**
     * Needs to be called if keepAlive is set to true in request options.
     */
    fun dispose()

    /**
     * Raw request.
     * @param info
     * @param data
     */
    fun requestRaw(
        info: RequestInfo,
        data: String?,
    ): Promise<HttpClientResponse>

    fun requestRaw(
        info: RequestInfo,
        data: node.ReadableStream?,
    ): Promise<HttpClientResponse>

    /**
     * Raw request with callback.
     * @param info
     * @param data
     * @param onResult
     */
    fun requestRawWithCallback(
        info: RequestInfo,
        data: String?,
        onResult: (err: JsError?, res: HttpClientResponse?) -> Unit,
    )

    fun requestRawWithCallback(
        info: RequestInfo,
        data: node.ReadableStream?,
        onResult: (err: JsError?, res: HttpClientResponse?) -> Unit,
    )

    /**
     * Gets an http agent. This function is useful when you need an http agent that handles
     * routing through a proxy server - depending upon the url and proxy environment variables.
     * @param serverUrl  The server URL where the request will be sent. For example, https://api.github.com
     */
    fun getAgent(serverUrl: String): node.http.Agent
    fun getAgentDispatcher(serverUrl: String): Any /* ProxyAgent */?
}
