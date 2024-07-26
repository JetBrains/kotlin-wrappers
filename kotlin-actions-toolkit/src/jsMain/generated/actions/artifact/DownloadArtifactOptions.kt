// Automatically generated - do not modify!

package actions.artifact

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface DownloadArtifactOptions {
    /**
     * Denotes where the artifact will be downloaded to. If not specified then the artifact is download to GITHUB_WORKSPACE
     */
    var path: String?
}
