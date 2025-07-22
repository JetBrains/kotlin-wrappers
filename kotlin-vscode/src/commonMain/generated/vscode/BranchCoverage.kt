// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Contains coverage information for a branch of a {@link StatementCoverage}.
 */
open external class BranchCoverage {
    /**
     * The number of times this branch was executed, or a boolean indicating
     * whether it was executed if the exact count is unknown. If zero or false,
     * the branch will be marked as un-covered.
     */
    var executed: Any /* number | boolean */

    /**
     * Branch location.
     */
    var location: Any /* Position | Range */?

    /**
     * Label for the branch, used in the context of "the ${label} branch was
     * not taken," for example.
     */
    var label: String?

    /**
     * @param executed The number of times this branch was executed, or a
     * boolean indicating  whether it was executed if the exact count is
     * unknown. If zero or false, the branch will be marked as un-covered.
     * @param location The branch position.
     */
    constructor(
        executed: Any, /* number | boolean */
        location: Any /* Position | Range */ = definedExternally,
        label: String = definedExternally,
    )
}
