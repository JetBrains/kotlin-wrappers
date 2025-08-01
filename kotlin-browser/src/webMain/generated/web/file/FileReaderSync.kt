// Automatically generated - do not modify!

package web.file

import js.buffer.ArrayBuffer
import web.blob.Blob
import kotlin.js.definedExternally

/**
 * The **`FileReaderSync`** interface allows to read File or Blob objects synchronously.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReaderSync)
 */
open external class FileReaderSync {
    /**
     * The **`readAsArrayBuffer()`** method of the FileReaderSync interface allows to read File or Blob objects in a synchronous way into an ArrayBuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReaderSync/readAsArrayBuffer)
     */
    fun readAsArrayBuffer(blob: Blob): ArrayBuffer

    /**
     * The **`readAsDataURL()`** method of the FileReaderSync interface allows to read File or Blob objects in a synchronous way into a string representing a data URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReaderSync/readAsDataURL)
     */
    fun readAsDataURL(blob: Blob): String

    /**
     * The **`readAsText()`** method of the FileReaderSync interface allows to read File or Blob objects in a synchronous way into a string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReaderSync/readAsText)
     */
    fun readAsText(
        blob: Blob,
        encoding: String = definedExternally,
    ): String
}
