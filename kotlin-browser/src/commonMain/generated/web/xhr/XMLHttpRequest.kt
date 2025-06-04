// Automatically generated - do not modify!

package web.xhr

import js.buffer.BufferSource
import js.core.JsAny
import web.blob.Blob
import web.dom.Document
import web.events.*
import web.form.FormData
import web.http.RequestMethod
import web.url.URL
import web.url.URLSearchParams
import kotlin.js.definedExternally

/**
 * `XMLHttpRequest` (XHR) objects are used to interact with servers.
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
     * The **XMLHttpRequest.readyState** property returns the state an XMLHttpRequest client is in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/readyState)
     */
    val readyState: ReadyState

    /**
     * The XMLHttpRequest **`response`** property returns the response's body content as an ArrayBuffer, a Blob, a Document, a JavaScript Object, or a string, depending on the value of the request's XMLHttpRequest.responseType property.
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
     * The read-only **`XMLHttpRequest.responseURL`** property returns the serialized URL of the response or the empty string if the URL is `null`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/responseURL)
     */
    val responseURL: String

    /**
     * The **`XMLHttpRequest.responseXML`** read-only property returns a Document containing the HTML or XML retrieved by the request; or `null` if the request was unsuccessful, has not yet been sent, or if the data can't be parsed as XML or HTML.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/responseXML)
     */
    val responseXML: Document?

    /**
     * The read-only **`XMLHttpRequest.status`** property returns the numerical HTTP status code of the `XMLHttpRequest`'s response.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/status)
     */
    val status: Short

    /**
     * The read-only **`XMLHttpRequest.statusText`** property returns a string containing the response's status message as returned by the HTTP server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/statusText)
     */
    val statusText: String

    /**
     * The **`XMLHttpRequest.timeout`** property is an `unsigned long` representing the number of milliseconds a request can take before automatically being terminated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/timeout)
     */
    var timeout: Int

    /**
     * The XMLHttpRequest `upload` property returns an XMLHttpRequestUpload object that can be observed to monitor an upload's progress.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/upload)
     */
    val upload: XMLHttpRequestUpload

    /**
     * The **`XMLHttpRequest.withCredentials`** property is a boolean value that indicates whether or not cross-site `Access-Control` requests should be made using credentials such as cookies, authentication headers or TLS client certificates.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/withCredentials)
     */
    var withCredentials: Boolean

    /**
     * The **`XMLHttpRequest.abort()`** method aborts the request if it has already been sent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/abort)
     */
    fun abort()

    /**
     * The XMLHttpRequest method **`getAllResponseHeaders()`** returns all the response headers, separated by CRLF, as a string, or returns `null` if no response has been received.
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
     * The XMLHttpRequest method **`setRequestHeader()`** sets the value of an HTTP request header.
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

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/abort_event)
     */
    @JsEvent("abort")
    val abortEvent: EventInstance<ProgressEvent, XMLHttpRequest /* this */, XMLHttpRequest /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/error_event)
     */
    @JsEvent("error")
    val errorEvent: EventInstance<ProgressEvent, XMLHttpRequest /* this */, XMLHttpRequest /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/load_event)
     */
    @JsEvent("load")
    val loadEvent: EventInstance<ProgressEvent, XMLHttpRequest /* this */, XMLHttpRequest /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/loadend_event)
     */
    @JsEvent("loadend")
    val loadEndEvent: EventInstance<ProgressEvent, XMLHttpRequest /* this */, XMLHttpRequest /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/loadstart_event)
     */
    @JsEvent("loadstart")
    val loadStartEvent: EventInstance<ProgressEvent, XMLHttpRequest /* this */, XMLHttpRequest /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/progress_event)
     */
    @JsEvent("progress")
    val progressEvent: EventInstance<ProgressEvent, XMLHttpRequest /* this */, XMLHttpRequest /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/readystatechange_event)
     */
    @JsEvent("readystatechange")
    val readyStateChangeEvent: EventInstance<Event, XMLHttpRequest /* this */, XMLHttpRequest /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/timeout_event)
     */
    @JsEvent("timeout")
    val timeoutEvent: EventInstance<ProgressEvent, XMLHttpRequest /* this */, XMLHttpRequest /* this */>

    companion object {
        val UNSENT: ReadyState
        val OPENED: ReadyState
        val HEADERS_RECEIVED: ReadyState
        val LOADING: ReadyState
        val DONE: ReadyState
    }

    sealed interface ReadyState
}
