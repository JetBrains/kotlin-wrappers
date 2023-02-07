// Automatically generated - do not modify!

package web.file

import web.buffer.Blob
import web.errors.DOMException
import web.events.EventHandler
import web.events.EventTarget
import web.events.ProgressEvent

external class FileReader :
    EventTarget {
    val error: DOMException?
    var onabort: EventHandler<ProgressEvent<FileReader>>?
    var onerror: EventHandler<ProgressEvent<FileReader>>?
    var onload: EventHandler<ProgressEvent<FileReader>>?
    var onloadend: EventHandler<ProgressEvent<FileReader>>?
    var onloadstart: EventHandler<ProgressEvent<FileReader>>?
    var onprogress: EventHandler<ProgressEvent<FileReader>>?
    val readyState: Short
    val result: Any /* string | ArrayBuffer */?
    fun abort()
    fun readAsArrayBuffer(blob: Blob)
    fun readAsBinaryString(blob: Blob)
    fun readAsDataURL(blob: Blob)
    fun readAsText(
        blob: Blob,
        encoding: String = definedExternally,
    )

    val EMPTY: Short
    val LOADING: Short
    val DONE: Short

    companion object {
        val EMPTY: Short
        val LOADING: Short
        val DONE: Short
    }
}
