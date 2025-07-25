// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * The base class of all breakpoint types.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Breakpoint)
 */
open external class Breakpoint {
    /**
     * The unique ID of the breakpoint.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Breakpoint.id)
     */
    val id: String

    /**
     * Is breakpoint enabled.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Breakpoint.enabled)
     */
    val enabled: Boolean

    /**
     * An optional expression for conditional breakpoints.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Breakpoint.condition)
     */
    val condition: String?

    /**
     * An optional expression that controls how many hits of the breakpoint are ignored.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Breakpoint.hitCondition)
     */
    val hitCondition: String?

    /**
     * An optional message that gets logged when this breakpoint is hit. Embedded expressions within {} are interpolated by the debug adapter.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Breakpoint.logMessage)
     */
    val logMessage: String?

    /**
     * Creates a new breakpoint
     *
     * @param enabled Is breakpoint enabled.
     * @param condition Expression for conditional breakpoints
     * @param hitCondition Expression that controls how many hits of the breakpoint are ignored
     * @param logMessage Log message to display when breakpoint is hit
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Breakpoint.constructor)
     */
    protected constructor(
        enabled: Boolean = definedExternally,
        condition: String = definedExternally,
        hitCondition: String = definedExternally,
        logMessage: String = definedExternally,
    )
}
