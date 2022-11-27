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
    val lastModified: EpochTimeStamp
    val name: String
    val webkitRelativePath: String
}
