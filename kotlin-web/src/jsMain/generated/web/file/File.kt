// Automatically generated - do not modify!

package web.file

import js.array.ReadonlyArray
import web.time.EpochTimeStamp

/**
 * Provides information about files and allows JavaScript in a web page to access their content.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/File)
 */
external class File(
    fileBits: ReadonlyArray<BlobPart>,
    fileName: String,
    options: FilePropertyBag = definedExternally,
) : Blob {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/File/lastModified)
     */
    val lastModified: EpochTimeStamp

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/File/name)
     */
    val name: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/File/webkitRelativePath)
     */
    val webkitRelativePath: String
}
