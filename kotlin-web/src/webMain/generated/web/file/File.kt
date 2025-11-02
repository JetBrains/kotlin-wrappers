// Automatically generated - do not modify!

package web.file

import js.array.ReadonlyArray
import js.serialization.Serializable
import web.blob.Blob
import web.blob.BlobPart
import web.time.EpochTimeStamp
import kotlin.js.definedExternally

/**
 * The **`File`** interface provides information about files and allows JavaScript in a web page to access their content.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/File)
 */
open external class File(
    fileBits: ReadonlyArray<BlobPart>,
    fileName: String,
    options: FilePropertyBag = definedExternally,
) : Blob,
    Serializable {
    /**
     * The **`lastModified`** read-only property of the File interface provides the last modified date of the file as the number of milliseconds since the Unix epoch (January 1, 1970 at midnight). Files without a known last modified date return the current date.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/File/lastModified)
     */
    val lastModified: EpochTimeStamp

    /**
     * The **`name`** read-only property of the File interface returns the name of the file represented by a File object. For security reasons, the path is excluded from this property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/File/name)
     */
    val name: String

    /**
     * The **`webkitRelativePath`** read-only property of the File interface contains a string which specifies the file's path relative to the directory selected by the user in an <input> element with its webkitdirectory attribute set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/File/webkitRelativePath)
     */
    val webkitRelativePath: String
}
