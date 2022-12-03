// Automatically generated - do not modify!

package web.xhr

import dom.Document
import web.events.Event
import web.events.EventHandler
import web.url.URL

external class XMLHttpRequest :
    XMLHttpRequestEventTarget {
    var onreadystatechange: EventHandler<Event>?

    /** Returns client's state. */
    val readyState: Short

    /** Returns the response body. */
    val response: Any?

    /**
     * Returns response as text.
     *
     * Throws an "InvalidStateError" DOMException if responseType is not the empty string or "text".
     */
    val responseText: String

    /**
     * Returns the response type.
     *
     * Can be set to change the response type. Values are: the empty string (default), "arraybuffer", "blob", "document", "json", and "text".
     *
     * When set: setting to "document" is ignored if current global object is not a Window object.
     *
     * When set: throws an "InvalidStateError" DOMException if state is loading or done.
     *
     * When set: throws an "InvalidAccessError" DOMException if the synchronous flag is set and current global object is a Window object.
     */
    var responseType: XMLHttpRequestResponseType
    val responseURL: String

    /**
     * Returns the response as document.
     *
     * Throws an "InvalidStateError" DOMException if responseType is not the empty string or "document".
     */
    val responseXML: Document?
    val status: Int
    val statusText: String

    /**
     * Can be set to a time in milliseconds. When set to a non-zero value will cause fetching to terminate after the given time has passed. When the time has passed, the request has not yet completed, and this's synchronous flag is unset, a timeout event will then be dispatched, or a "TimeoutError" DOMException will be thrown otherwise (for the send() method).
     *
     * When set: throws an "InvalidAccessError" DOMException if the synchronous flag is set and current global object is a Window object.
     */
    var timeout: Int

    /** Returns the associated XMLHttpRequestUpload object. It can be used to gather transmission information when data is transferred to a server. */
    val upload: XMLHttpRequestUpload

    /**
     * True when credentials are to be included in a cross-origin request. False when they are to be excluded in a cross-origin request and when cookies are to be ignored in its response. Initially false.
     *
     * When set: throws an "InvalidStateError" DOMException if state is not unsent or opened, or if the send() flag is set.
     */
    var withCredentials: Boolean

    /** Cancels any network activity. */
    fun abort()
    fun getAllResponseHeaders(): String
    fun getResponseHeader(name: String): String?

    /**
     * Sets the request method, request URL, and synchronous flag.
     *
     * Throws a "SyntaxError" DOMException if either method is not a valid method or url cannot be parsed.
     *
     * Throws a "SecurityError" DOMException if method is a case-insensitive match for `CONNECT`, `TRACE`, or `TRACK`.
     *
     * Throws an "InvalidAccessError" DOMException if async is false, current global object is a Window object, and the timeout attribute is not zero or the responseType attribute is not the empty string.
     */
    fun open(
        method: String,
        url: String,
    )

    fun open(
        method: String,
        url: URL,
    )

    fun open(
        method: String,
        url: String,
        async: Boolean,
        username: String? = definedExternally,
        password: String? = definedExternally,
    )

    fun open(
        method: String,
        url: URL,
        async: Boolean,
        username: String? = definedExternally,
        password: String? = definedExternally,
    )

    /**
     * Acts as if the `Content-Type` header value for a response is mime. (It does not change the header.)
     *
     * Throws an "InvalidStateError" DOMException if state is loading or done.
     */
    fun overrideMimeType(mime: String)

    /**
     * Initiates the request. The body argument provides the request body, if any, and is ignored if the request method is GET or HEAD.
     *
     * Throws an "InvalidStateError" DOMException if either state is not opened or the send() flag is set.
     */
    fun send(body: Document? = definedExternally)
    fun send(body: XMLHttpRequestBodyInit?)

    /**
     * Combines a header in author request headers.
     *
     * Throws an "InvalidStateError" DOMException if either state is not opened or the send() flag is set.
     *
     * Throws a "SyntaxError" DOMException if name is not a header name or if value is not a header value.
     */
    fun setRequestHeader(
        name: String,
        value: String,
    )

    val DONE: Short
    val HEADERS_RECEIVED: Short
    val LOADING: Short
    val OPENED: Short
    val UNSENT: Short

    companion object {
        val DONE: Short
        val HEADERS_RECEIVED: Short
        val LOADING: Short
        val OPENED: Short
        val UNSENT: Short
    }
}
