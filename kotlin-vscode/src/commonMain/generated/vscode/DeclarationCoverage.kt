// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.core.JsAny

/**
 * Contains coverage information for a declaration. Depending on the reporter
 * and language, this may be types such as functions, methods, or namespaces.
 */
open external class DeclarationCoverage {
    /**
     * Name of the declaration.
     */
    var name: String

    /**
     * The number of times this declaration was executed, or a boolean
     * indicating whether it was executed if the exact count is unknown. If
     * zero or false, the declaration will be marked as un-covered.
     */
    var executed: JsAny /* number | boolean */

    /**
     * Declaration location.
     */
    var location: JsAny /* Position | Range */

    /**
     * @param executed The number of times this declaration was executed, or a
     * boolean indicating  whether it was executed if the exact count is
     * unknown. If zero or false, the declaration will be marked as un-covered.
     * @param location The declaration position.
     */
    constructor(
        name: String,
        executed: JsAny, /* number | boolean */
        location: JsAny, /* Position | Range */
    )
}
