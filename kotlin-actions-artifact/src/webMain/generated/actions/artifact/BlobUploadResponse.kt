// Automatically generated - do not modify!

package actions.artifact

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface BlobUploadResponse {
    /**
     * The total reported upload size in bytes. Empty if the upload failed
     */
    val uploadSize: Number?

    /**
     * The SHA256 hash of the uploaded file. Empty if the upload failed
     */
    val sha256Hash: String?
}
