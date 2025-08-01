// Automatically generated - do not modify!

package actions.artifact

import js.objects.JsPlainObject

@JsPlainObject
external interface DownloadArtifactOptions {
    /**
     * Denotes where the artifact will be downloaded to. If not specified then the artifact is download to GITHUB_WORKSPACE
     */
    val path: String?

    /**
     * The hash that was computed for the artifact during upload. If provided, the outcome of the download
     * will provide a digestMismatch property indicating whether the hash of the downloaded artifact
     * matches the expected hash.
     */
    val expectedHash: String?
}
