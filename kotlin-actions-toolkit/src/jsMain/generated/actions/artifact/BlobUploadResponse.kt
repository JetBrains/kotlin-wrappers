// Automatically generated - do not modify!

package actions.artifact

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface BlobUploadResponse {
    /**
     * The total reported upload size in bytes. Empty if the upload failed
     */
    var uploadSize: Number?

    /**
     * The SHA256 hash of the uploaded file. Empty if the upload failed
     */
    var sha256Hash: String?
}
