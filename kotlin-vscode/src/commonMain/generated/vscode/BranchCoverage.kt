// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
// ORIGINAL SOURCE

/**
 * Contains coverage information for a branch of a {@link StatementCoverage}.
*/
export class BranchCoverage {
/**
 * The number of times this branch was executed, or a boolean indicating
 * whether it was executed if the exact count is unknown. If zero or false,
 * the branch will be marked as un-covered.
*/
executed: number | boolean;

/**
 * Branch location.
*/
location?: Position | Range;

/**
 * Label for the branch, used in the context of "the ${label} branch was
 * not taken," for example.
*/
label?: string;

/**
 * @param executed The number of times this branch was executed, or a
 * boolean indicating  whether it was executed if the exact count is
 * unknown. If zero or false, the branch will be marked as un-covered.
 * @param location The branch position.
*/
constructor(executed: number | boolean, location?: Position | Range, label?: string);
}

// ORIGINAL SOURCE
 **/
