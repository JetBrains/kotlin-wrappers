// Automatically generated - do not modify!

package web.file

import web.blob.Blob
import web.errors.DOMException
import web.events.EventHandler
import web.events.EventTarget
import web.events.ProgressEvent

/**
 * Lets web applications asynchronously read the contents of files (or raw data buffers) stored on the user's computer, using File or Blob objects to specify the file or data to read.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader)
 */
open external class FileReader :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/error)
     */
    val error: DOMException?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/abort_event)
     */
    var onabort: EventHandler<ProgressEvent<FileReader>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/error_event)
     */
    var onerror: EventHandler<ProgressEvent<FileReader>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/load_event)
     */
    var onload: EventHandler<ProgressEvent<FileReader>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/loadend_event)
     */
    var onloadend: EventHandler<ProgressEvent<FileReader>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/loadstart_event)
     */
    var onloadstart: EventHandler<ProgressEvent<FileReader>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/progress_event)
     */
    var onprogress: EventHandler<ProgressEvent<FileReader>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/readyState)
     */
    val readyState: ReadyState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/result)
     */
    val result: Any /* string | ArrayBuffer */?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/abort)
     */
    fun abort()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/readAsArrayBuffer)
     */
    fun readAsArrayBuffer(blob: Blob)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/readAsDataURL)
     */
    fun readAsDataURL(blob: Blob)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/readAsText)
     */
    fun readAsText(
        blob: Blob,
        encoding: String = definedExternally,
    )

    val EMPTY: ReadyState
    val LOADING: ReadyState
    val DONE: ReadyState

    companion object {
        val EMPTY: ReadyState
        val LOADING: ReadyState
        val DONE: ReadyState
    }

    sealed interface ReadyState
}
