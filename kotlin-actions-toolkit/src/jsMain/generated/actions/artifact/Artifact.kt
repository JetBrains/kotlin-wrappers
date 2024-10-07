// Automatically generated - do not modify!

package actions.artifact

import js.date.Date
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface Artifact {
    /**
     * The name of the artifact
     */
    val name: String

    /**
     * The ID of the artifact
     */
    val id: Number

    /**
     * The size of the artifact in bytes
     */
    val size: Number

    /**
     * The time when the artifact was created
     */
    val createdAt: Date?
}
