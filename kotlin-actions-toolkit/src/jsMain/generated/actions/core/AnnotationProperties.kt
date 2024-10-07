// Automatically generated - do not modify!

package actions.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface AnnotationProperties {
    /**
     * A title for the annotation.
     */
    val title: String?

    /**
     * The path of the file for which the annotation should be created.
     */
    val file: String?

    /**
     * The start line for the annotation.
     */
    val startLine: Number?

    /**
     * The end line for the annotation. Defaults to `startLine` when `startLine` is provided.
     */
    val endLine: Number?

    /**
     * The start column for the annotation. Cannot be sent when `startLine` and `endLine` are different values.
     */
    val startColumn: Number?

    /**
     * The end column for the annotation. Cannot be sent when `startLine` and `endLine` are different values.
     * Defaults to `startColumn` when `startColumn` is provided.
     */
    val endColumn: Number?
}
