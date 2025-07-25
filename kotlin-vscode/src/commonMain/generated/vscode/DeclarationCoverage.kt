// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.core.JsAny
import kotlin.js.JsModule

/**
 * Contains coverage information for a declaration. Depending on the reporter
 * and language, this may be types such as functions, methods, or namespaces.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DeclarationCoverage)
 */
open external class DeclarationCoverage {
    /**
     * Name of the declaration.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DeclarationCoverage.name)
     */
    var name: String

    /**
     * The number of times this declaration was executed, or a boolean
     * indicating whether it was executed if the exact count is unknown. If
     * zero or false, the declaration will be marked as un-covered.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DeclarationCoverage.executed)
     */
    var executed: JsAny /* number | boolean */

    /**
     * Declaration location.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DeclarationCoverage.location)
     */
    var location: JsAny /* Position | Range */

    /**
     * @param executed The number of times this declaration was executed, or a
     * boolean indicating  whether it was executed if the exact count is
     * unknown. If zero or false, the declaration will be marked as un-covered.
     * @param location The declaration position.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DeclarationCoverage.constructor)
     */
    constructor(
        name: String,
        executed: JsAny, /* number | boolean */
        location: JsAny, /* Position | Range */
    )
}
