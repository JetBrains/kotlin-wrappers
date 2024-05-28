// Automatically generated - do not modify!

package actions.artifact

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface DownloadResponse {
    /**
     * The name of the artifact that was downloaded
     */
    var artifactName: String

    /**
     * The full Path to where the artifact was downloaded
     */
    var downloadPath: String
}
