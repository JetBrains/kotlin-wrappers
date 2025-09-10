// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsAny
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Contains coverage information for a branch of a [StatementCoverage].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#BranchCoverage)
 */
open external class BranchCoverage {
    /**
     * The number of times this branch was executed, or a boolean indicating
     * whether it was executed if the exact count is unknown. If zero or false,
     * the branch will be marked as un-covered.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#BranchCoverage.executed)
     */
    var executed: JsAny /* number | boolean */

    /**
     * Branch location.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#BranchCoverage.location)
     */
    var location: JsAny /* Position | Range */?

    /**
     * Label for the branch, used in the context of "the ${label} branch was
     * not taken," for example.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#BranchCoverage.label)
     */
    var label: String?

    /**
     * @param executed The number of times this branch was executed, or a
     * boolean indicating  whether it was executed if the exact count is
     * unknown. If zero or false, the branch will be marked as un-covered.
     * @param location The branch position.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#BranchCoverage.constructor)
     */
    constructor(
        executed: JsAny, /* number | boolean */
        location: JsAny /* Position | Range */ = definedExternally,
        label: String = definedExternally,
    )
}
