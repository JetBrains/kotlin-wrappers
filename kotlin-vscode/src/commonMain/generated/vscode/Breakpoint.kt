// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
// ORIGINAL SOURCE

/**
 * The base class of all breakpoint types.
*/
export class Breakpoint {
/**
 * The unique ID of the breakpoint.
*/
readonly id: string;
/**
 * Is breakpoint enabled.
*/
readonly enabled: boolean;
/**
 * An optional expression for conditional breakpoints.
*/
readonly condition?: string | undefined;
/**
 * An optional expression that controls how many hits of the breakpoint are ignored.
*/
readonly hitCondition?: string | undefined;
/**
 * An optional message that gets logged when this breakpoint is hit. Embedded expressions within {} are interpolated by the debug adapter.
*/
readonly logMessage?: string | undefined;

/**
 * Creates a new breakpoint
 *
 * @param enabled Is breakpoint enabled.
 * @param condition Expression for conditional breakpoints
 * @param hitCondition Expression that controls how many hits of the breakpoint are ignored
 * @param logMessage Log message to display when breakpoint is hit
*/
protected constructor(enabled?: boolean, condition?: string, hitCondition?: string, logMessage?: string);
}

// ORIGINAL SOURCE
 **/
