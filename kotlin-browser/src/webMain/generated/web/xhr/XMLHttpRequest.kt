// Automatically generated - do not modify!

package web.xhr

import js.buffer.BufferSource
import web.blob.Blob
import web.dom.Document
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.ProgressEvent
import web.form.FormData
import web.http.RequestMethod
import web.url.URL
import web.url.URLSearchParams
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * **`XMLHttpRequest`** (XHR) objects are used to interact with servers. You can retrieve data from a URL without having to do a full page refresh. This enables a Web page to update just part of a page without disrupting what the user is doing.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest)
 */
open external class XMLHttpRequest :
    XMLHttpRequestEventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/readystatechange_event)
     */
    var onreadystatechange: EventHandler<Event, XMLHttpRequest, XMLHttpRequest>?

    /**
     * The **`XMLHttpRequest.readyState`** property returns the state an XMLHttpRequest client is in. An XHR client exists in one of the following states:
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/readyState)
     */
    val readyState: ReadyState

    /**
     * The XMLHttpRequest **`response`** property returns the response's body content as an ArrayBuffer, a Blob, a Document, a JavaScript Object, or a string, depending on the value of the request's responseType property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/response)
     */
    val response: JsAny?

    /**
     * The read-only XMLHttpRequest property **`responseText`** returns the text received from a server following a request being sent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/responseText)
     */
    val responseText: String

    /**
     * The XMLHttpRequest property **`responseType`** is an enumerated string value specifying the type of data contained in the response.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/responseType)
     */
    var responseType: XMLHttpRequestResponseType

    /**
     * The read-only **`XMLHttpRequest.responseURL`** property returns the serialized URL of the response or the empty string if the URL is null. If the URL is returned, any URL fragment present in the URL will be stripped away. The value of responseURL will be the final URL obtained after any redirects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/responseURL)
     */
    val responseURL: String

    /**
     * The **`XMLHttpRequest.responseXML`** read-only property returns a Document containing the HTML or XML retrieved by the request; or null if the request was unsuccessful, has not yet been sent, or if the data can't be parsed as XML or HTML.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/responseXML)
     */
    val responseXML: Document?

    /**
     * The read-only **`XMLHttpRequest.status`** property returns the numerical HTTP status code of the XMLHttpRequest's response.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/status)
     */
    val status: Short

    /**
     * The read-only **`XMLHttpRequest.statusText`** property returns a string containing the response's status message as returned by the HTTP server. Unlike XMLHttpRequest.status which indicates a numerical status code, this property contains the text of the response status, such as "OK" or "Not Found". If the request's readyState is in UNSENT or OPENED state, the value of statusText will be an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/statusText)
     */
    val statusText: String

    /**
     * The **`XMLHttpRequest.timeout`** property is an unsigned long representing the number of milliseconds a request can take before automatically being terminated. The default value is 0, which means there is no timeout. Timeout shouldn't be used for synchronous XMLHttpRequests requests used in a document environment or it will throw an InvalidAccessError exception. When a timeout happens, a timeout event is fired.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/timeout)
     */
    var timeout: Int

    /**
     * The XMLHttpRequest **`upload`** property returns an XMLHttpRequestUpload object that can be observed to monitor an upload's progress.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/upload)
     */
    val upload: XMLHttpRequestUpload

    /**
     * The **`XMLHttpRequest.withCredentials`** property is a boolean value that indicates whether or not cross-site Access-Control requests should be made using credentials such as cookies, authentication headers or TLS client certificates. Setting withCredentials has no effect on same-origin requests.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/withCredentials)
     */
    var withCredentials: Boolean

    /**
     * The **`XMLHttpRequest.abort()`** method aborts the request if it has already been sent. When a request is aborted, its readyState is changed to XMLHttpRequest.UNSENT (0) and the request's status code is set to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/abort)
     */
    fun abort()

    /**
     * The XMLHttpRequest method **`getAllResponseHeaders()`** returns all the response headers, separated by CRLF, as a string, or returns null if no response has been received.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/getAllResponseHeaders)
     */
    fun getAllResponseHeaders(): String

    /**
     * The XMLHttpRequest method **`getResponseHeader()`** returns the string containing the text of a particular header's value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/getResponseHeader)
     */
    fun getResponseHeader(name: String): String?

    /**
     * The XMLHttpRequest method **`open()`** initializes a newly-created request, or re-initializes an existing one.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/open)
     */
    fun open(
        method: RequestMethod,
        url: String,
    )

    fun open(
        method: RequestMethod,
        url: URL,
    )

    fun open(
        method: RequestMethod,
        url: String,
        async: Boolean,
        username: String? = definedExternally,
        password: String? = definedExternally,
    )

    fun open(
        method: RequestMethod,
        url: URL,
        async: Boolean,
        username: String? = definedExternally,
        password: String? = definedExternally,
    )

    /**
     * The XMLHttpRequest method **`overrideMimeType()`** specifies a MIME type other than the one provided by the server to be used instead when interpreting the data being transferred in a request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/overrideMimeType)
     */
    fun overrideMimeType(mime: String)

    /**
     * The XMLHttpRequest method **`send()`** sends the request to the server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/send)
     */
    fun send(body: Document? = definedExternally)
    fun send(body: Blob?)
    fun send(body: BufferSource?)
    fun send(body: FormData?)
    fun send(body: URLSearchParams?)
    fun send(body: String?)

    /**
     * The XMLHttpRequest method **`setRequestHeader()`** sets the value of an HTTP request header. When using setRequestHeader(), you must call it after calling open(), but before calling send(). If this method is called several times with the same header, the values are merged into one single request header.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/setRequestHeader)
     */
    fun setRequestHeader(
        name: String,
        value: String,
    )

    val UNSENT: ReadyState
    val OPENED: ReadyState
    val HEADERS_RECEIVED: ReadyState
    val LOADING: ReadyState
    val DONE: ReadyState

    companion object {
        val UNSENT: ReadyState
        val OPENED: ReadyState
        val HEADERS_RECEIVED: ReadyState
        val LOADING: ReadyState
        val DONE: ReadyState
    }

    sealed interface ReadyState
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/abort_event)
 */
inline val <C : XMLHttpRequest> C.abortEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, "abort")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/error_event)
 */
inline val <C : XMLHttpRequest> C.errorEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, "error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/load_event)
 */
inline val <C : XMLHttpRequest> C.loadEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, "load")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/loadend_event)
 */
inline val <C : XMLHttpRequest> C.loadEndEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, "loadend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/loadstart_event)
 */
inline val <C : XMLHttpRequest> C.loadStartEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, "loadstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/progress_event)
 */
inline val <C : XMLHttpRequest> C.progressEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, "progress")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/readystatechange_event)
 */
inline val <C : XMLHttpRequest> C.readyStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "readystatechange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/timeout_event)
 */
inline val <C : XMLHttpRequest> C.timeoutEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, "timeout")
