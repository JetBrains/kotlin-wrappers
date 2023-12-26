// Automatically generated - do not modify!

package web.file

import js.buffer.ArrayBuffer
import web.buffer.Blob

external class FileReaderSync {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReaderSync/readAsArrayBuffer)
     */
    fun readAsArrayBuffer(blob: Blob): ArrayBuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReaderSync/readAsDataURL)
     */
    fun readAsDataURL(blob: Blob): String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReaderSync/readAsText)
     */
    fun readAsText(
        blob: Blob,
        encoding: String = definedExternally,
    ): String
}
