// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsAny
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Contains coverage information for a single statement or line.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#StatementCoverage)
 */
open external class StatementCoverage {
    /**
     * The number of times this statement was executed, or a boolean indicating
     * whether it was executed if the exact count is unknown. If zero or false,
     * the statement will be marked as un-covered.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#StatementCoverage.executed)
     */
    var executed: JsAny /* number | boolean */

    /**
     * Statement location.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#StatementCoverage.location)
     */
    var location: JsAny /* Position | Range */

    /**
     * Coverage from branches of this line or statement. If it's not a
     * conditional, this will be empty.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#StatementCoverage.branches)
     */
    var branches: ReadonlyArray<BranchCoverage>

    /**
     * @param location The statement position.
     * @param executed The number of times this statement was executed, or a
     * boolean indicating  whether it was executed if the exact count is
     * unknown. If zero or false, the statement will be marked as un-covered.
     * @param branches Coverage from branches of this line.  If it's not a
     * conditional, this should be omitted.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#StatementCoverage.constructor)
     */
    constructor(
        executed: JsAny, /* number | boolean */
        location: Position,
        branches: ReadonlyArray<BranchCoverage> = definedExternally,
    )

    constructor(
        executed: JsAny, /* number | boolean */
        location: Range,
        branches: ReadonlyArray<BranchCoverage> = definedExternally,
    )
}
