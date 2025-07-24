// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * Represents a related message and source code location for a diagnostic. This should be
 * used to point to code locations that cause or related to a diagnostics, e.g. when duplicating
 * a symbol in a scope.
 */
open external class DiagnosticRelatedInformation {
    /**
     * The location of this related diagnostic information.
     */
    var location: Location

    /**
     * The message of this related diagnostic information.
     */
    var message: String

    /**
     * Creates a new related diagnostic information object.
     *
     * @param location The location.
     * @param message The message.
     */
    constructor(
        location: Location,
        message: String,
    )
}
