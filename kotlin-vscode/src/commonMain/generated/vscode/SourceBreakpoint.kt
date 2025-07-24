// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A breakpoint specified by a source location.
 */
open external class SourceBreakpoint :
    Breakpoint {
    /**
     * The source and line position of this breakpoint.
     */
    val location: Location

    /**
     * Create a new breakpoint for a source location.
     */
    constructor(
        location: Location,
        enabled: Boolean = definedExternally,
        condition: String = definedExternally,
        hitCondition: String = definedExternally,
        logMessage: String = definedExternally,
    )
}
