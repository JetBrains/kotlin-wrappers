// Automatically generated - do not modify!

package web.file

import js.core.JsAny
import web.blob.Blob
import web.errors.DOMException
import web.events.*
import kotlin.js.definedExternally

/**
 * The **`FileReader`** interface lets web applications asynchronously read the contents of files (or raw data buffers) stored on the user's computer, using File or Blob objects to specify the file or data to read.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader)
 */
open external class FileReader :
    EventTarget {
    /**
     * The **`error`** read-only property of the FileReader interface returns the error that occurred while reading the file.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/error)
     */
    val error: DOMException?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/abort_event)
     */
    var onabort: EventHandler<ProgressEvent, FileReader, FileReader>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/error_event)
     */
    var onerror: EventHandler<ProgressEvent, FileReader, FileReader>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/load_event)
     */
    var onload: EventHandler<ProgressEvent, FileReader, FileReader>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/loadend_event)
     */
    var onloadend: EventHandler<ProgressEvent, FileReader, FileReader>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/loadstart_event)
     */
    var onloadstart: EventHandler<ProgressEvent, FileReader, FileReader>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/progress_event)
     */
    var onprogress: EventHandler<ProgressEvent, FileReader, FileReader>?

    /**
     * The **`readyState`** read-only property of the FileReader interface provides the current state of the reading operation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/readyState)
     */
    val readyState: ReadyState

    /**
     * The **`result`** read-only property of the FileReader interface returns the file's contents.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/result)
     */
    val result: JsAny /* string | ArrayBuffer */?

    /**
     * The **`abort()`** method of the FileReader interface aborts the read operation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/abort)
     */
    fun abort()

    /**
     * The **`readAsArrayBuffer()`** method of the FileReader interface is used to start reading the contents of a specified Blob or File.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/readAsArrayBuffer)
     */
    fun readAsArrayBuffer(blob: Blob)

    /**
     * The **`readAsDataURL()`** method of the FileReader interface is used to read the contents of the specified file's data as a base64 encoded string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/readAsDataURL)
     */
    fun readAsDataURL(blob: Blob)

    /**
     * The **`readAsText()`** method of the FileReader interface is used to read the contents of the specified Blob or File.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/readAsText)
     */
    fun readAsText(
        blob: Blob,
        encoding: String = definedExternally,
    )

    val EMPTY: ReadyState
    val LOADING: ReadyState
    val DONE: ReadyState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/abort_event)
     */
    @JsEvent("abort")
    val abortEvent: EventInstance<ProgressEvent, FileReader /* this */, FileReader /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/error_event)
     */
    @JsEvent("error")
    val errorEvent: EventInstance<ProgressEvent, FileReader /* this */, FileReader /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/load_event)
     */
    @JsEvent("load")
    val loadEvent: EventInstance<ProgressEvent, FileReader /* this */, FileReader /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/loadend_event)
     */
    @JsEvent("loadend")
    val loadEndEvent: EventInstance<ProgressEvent, FileReader /* this */, FileReader /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/loadstart_event)
     */
    @JsEvent("loadstart")
    val loadStartEvent: EventInstance<ProgressEvent, FileReader /* this */, FileReader /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/progress_event)
     */
    @JsEvent("progress")
    val progressEvent: EventInstance<ProgressEvent, FileReader /* this */, FileReader /* this */>

    companion object {
        val EMPTY: ReadyState
        val LOADING: ReadyState
        val DONE: ReadyState
    }

    sealed interface ReadyState
}
