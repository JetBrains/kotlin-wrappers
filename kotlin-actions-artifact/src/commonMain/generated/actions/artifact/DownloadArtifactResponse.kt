// Automatically generated - do not modify!

package actions.artifact

import js.objects.JsPlainObject

@JsPlainObject
external interface DownloadArtifactResponse {
    /**
     * The path where the artifact was downloaded to
     */
    val downloadPath: String?

    /**
     * Returns true if the digest of the downloaded artifact does not match the expected hash
     */
    val digestMismatch: Boolean?
}
