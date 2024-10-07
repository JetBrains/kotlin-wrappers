// Automatically generated - do not modify!

package actions.artifact

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface UploadArtifactResponse {
    /**
     * Total size of the artifact in bytes. Not provided if no artifact was uploaded
     */
    val size: Number?

    /**
     * The id of the artifact that was created. Not provided if no artifact was uploaded
     * This ID can be used as input to other APIs to download, delete or get more information about an artifact: https://docs.github.com/en/rest/actions/artifacts
     */
    val id: Number?
}
