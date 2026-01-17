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
 * A breakpoint specified by a function name.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FunctionBreakpoint)
 */
open external class FunctionBreakpoint :
    Breakpoint {
    /**
     * The name of the function to which this breakpoint is attached.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FunctionBreakpoint.functionName)
     */
    val functionName: String

    /**
     * Create a new function breakpoint.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FunctionBreakpoint.constructor)
     */
    constructor(
        functionName: String,
        enabled: Boolean = definedExternally,
        condition: String = definedExternally,
        hitCondition: String = definedExternally,
        logMessage: String = definedExternally,
    )
}
