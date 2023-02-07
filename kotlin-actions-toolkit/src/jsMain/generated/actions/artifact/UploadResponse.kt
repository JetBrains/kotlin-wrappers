// Automatically generated - do not modify!

package actions.artifact

import js.core.ReadonlyArray

sealed external interface UploadResponse {
    /**
     * The name of the artifact that was uploaded
     */
    var artifactName: String

    /**
     * A list of all items that are meant to be uploaded as part of the artifact
     */
    var artifactItems: ReadonlyArray<String>

    /**
     * Total size of the artifact in bytes that was uploaded
     */
    var size: Number

    /**
     * A list of items that were not uploaded as part of the artifact (includes queued items that were not uploaded if
     * continueOnError is set to false). This is a subset of artifactItems.
     */
    var failedItems: ReadonlyArray<String>
}
