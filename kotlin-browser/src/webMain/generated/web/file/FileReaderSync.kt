// Automatically generated - do not modify!

package web.file

import js.buffer.ArrayBuffer
import web.blob.Blob
import web.errors.DOMExceptionType.*
import web.errors.JsThrows

/**
 * The **`FileReaderSync`** interface allows to read File or Blob objects synchronously. This interface is only available in workers as it enables synchronous I/O that could potentially block.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReaderSync)
 */
open external class FileReaderSync {
    /**
     * The **`readAsArrayBuffer()`** method of the FileReaderSync interface allows to read File or Blob objects in a synchronous way into an ArrayBuffer. This interface is only available in workers as it enables synchronous I/O that could potentially block.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReaderSync/readAsArrayBuffer)
     */
    @JsThrows(EncodingError::class)
    @JsThrows(NotFoundError::class)
    @JsThrows(NotReadableError::class)
    @JsThrows(SecurityError::class)
    fun readAsArrayBuffer(blob: Blob): ArrayBuffer

    /**
     * The **`readAsDataURL()`** method of the FileReaderSync interface allows to read File or Blob objects in a synchronous way into a string representing a data URL. This interface is only available in workers as it enables synchronous I/O that could potentially block.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReaderSync/readAsDataURL)
     */
    @JsThrows(EncodingError::class)
    @JsThrows(NotFoundError::class)
    @JsThrows(NotReadableError::class)
    @JsThrows(SecurityError::class)
    fun readAsDataURL(blob: Blob): String

    /**
     * The **`readAsText()`** method of the FileReaderSync interface allows to read File or Blob objects in a synchronous way into a string. This interface is only available in workers as it enables synchronous I/O that could potentially block.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReaderSync/readAsText)
     */
    @JsThrows(EncodingError::class)
    @JsThrows(NotFoundError::class)
    @JsThrows(NotReadableError::class)
    @JsThrows(SecurityError::class)
    fun readAsText(
        blob: Blob,
        encoding: String = definedExternally,
    ): String
}
