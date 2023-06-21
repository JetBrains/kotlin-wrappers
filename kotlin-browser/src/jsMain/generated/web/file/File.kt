// Automatically generated - do not modify!

package web.file

import js.core.EpochTimeStamp
import js.core.ReadonlyArray
import web.buffer.Blob
import web.buffer.BlobPart

external class File(
    fileBits: ReadonlyArray<BlobPart>,
    fileName: String,
    options: FilePropertyBag = definedExternally,
) : Blob {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/File/lastModified) */
    val lastModified: EpochTimeStamp

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/File/name) */
    val name: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/File/webkitRelativePath) */
    val webkitRelativePath: String
}
