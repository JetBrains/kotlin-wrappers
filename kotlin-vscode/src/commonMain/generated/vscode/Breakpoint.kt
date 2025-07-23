// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * The base class of all breakpoint types.
 */
open external class Breakpoint {
    /**
     * The unique ID of the breakpoint.
     */
    val id: String

    /**
     * Is breakpoint enabled.
     */
    val enabled: Boolean

    /**
     * An optional expression for conditional breakpoints.
     */
    val condition: String?

    /**
     * An optional expression that controls how many hits of the breakpoint are ignored.
     */
    val hitCondition: String?

    /**
     * An optional message that gets logged when this breakpoint is hit. Embedded expressions within {} are interpolated by the debug adapter.
     */
    val logMessage: String?

    /**
     * Creates a new breakpoint
     *
     * @param enabled Is breakpoint enabled.
     * @param condition Expression for conditional breakpoints
     * @param hitCondition Expression that controls how many hits of the breakpoint are ignored
     * @param logMessage Log message to display when breakpoint is hit
     */
    protected constructor(
        enabled: Boolean = definedExternally,
        condition: String = definedExternally,
        hitCondition: String = definedExternally,
        logMessage: String = definedExternally,
    )
}
