// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    // Temp WA for KT-83572
    "CALL_TO_JS_MODULE_WITHOUT_MODULE_SYSTEM",
)

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A breakpoint specified by a source location.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceBreakpoint)
 */
open external class SourceBreakpoint :
    Breakpoint {
    /**
     * The source and line position of this breakpoint.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceBreakpoint.location)
     */
    val location: Location

    /**
     * Create a new breakpoint for a source location.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceBreakpoint.constructor)
     */
    constructor(
        location: Location,
        enabled: Boolean = definedExternally,
        condition: String = definedExternally,
        hitCondition: String = definedExternally,
        logMessage: String = definedExternally,
    )
}
