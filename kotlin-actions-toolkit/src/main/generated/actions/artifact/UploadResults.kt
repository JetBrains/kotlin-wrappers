// Automatically generated - do not modify!

package actions.artifact

import js.core.ReadonlyArray

sealed external interface UploadResults {
    /**
     * The size in bytes of data that was transferred during the upload process to the actions backend service. This takes into account possible
     * gzip compression to reduce the amount of data that needs to be transferred
     */
    var uploadSize: Number

    /**
     * The raw size of the files that were specified for upload
     */
    var totalSize: Number

    /**
     * An array of files that failed to upload
     */
    var failedItems: ReadonlyArray<String>
}
