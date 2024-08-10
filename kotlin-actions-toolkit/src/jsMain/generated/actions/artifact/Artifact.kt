// Automatically generated - do not modify!

package actions.artifact

import js.date.Date
import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface Artifact {
    /**
     * The name of the artifact
     */
    var name: String

    /**
     * The ID of the artifact
     */
    var id: Number

    /**
     * The size of the artifact in bytes
     */
    var size: Number

    /**
     * The time when the artifact was created
     */
    var createdAt: Date?
}
