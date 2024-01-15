// Automatically generated - do not modify!

package web.file

import web.blob.BlobPropertyBag
import web.time.EpochTimeStamp

sealed external interface FilePropertyBag :
    BlobPropertyBag {
    var lastModified: EpochTimeStamp?
}
