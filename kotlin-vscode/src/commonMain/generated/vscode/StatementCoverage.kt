// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Contains coverage information for a single statement or line.
 */
open external class StatementCoverage {
    /**
     * The number of times this statement was executed, or a boolean indicating
     * whether it was executed if the exact count is unknown. If zero or false,
     * the statement will be marked as un-covered.
     */
//  executed: number | boolean

    /**
     * Statement location.
     */
//  location: Position | Range

    /**
     * Coverage from branches of this line or statement. If it's not a
     * conditional, this will be empty.
     */
//  branches: BranchCoverage[]

    /**
     * @param location The statement position.
     * @param executed The number of times this statement was executed, or a
     * boolean indicating  whether it was executed if the exact count is
     * unknown. If zero or false, the statement will be marked as un-covered.
     * @param branches Coverage from branches of this line.  If it's not a
     * conditional, this should be omitted.
     */
//  constructor(executed: number | boolean, location: Position | Range, branches?: BranchCoverage[])
}
