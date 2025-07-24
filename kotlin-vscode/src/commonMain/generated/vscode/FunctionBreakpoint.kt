// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A breakpoint specified by a function name.
 */
open external class FunctionBreakpoint :
    Breakpoint {
    /**
     * The name of the function to which this breakpoint is attached.
     */
    val functionName: String

    /**
     * Create a new function breakpoint.
     */
    constructor(
        functionName: String,
        enabled: Boolean = definedExternally,
        condition: String = definedExternally,
        hitCondition: String = definedExternally,
        logMessage: String = definedExternally,
    )
}
