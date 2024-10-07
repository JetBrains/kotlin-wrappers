// Automatically generated - do not modify!

package actions.artifact

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface UploadZipSpecification {
    /**
     * An absolute source path that points to a file that will be added to a zip. Null if creating a new directory
     */
    val sourcePath: String?

    /**
     * The destination path in a zip for a file
     */
    val destinationPath: String
}
