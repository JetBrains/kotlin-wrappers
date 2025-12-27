// Automatically generated - do not modify!

package node.util

sealed external interface CallSiteObject {
    /**
     * Returns the name of the function associated with this call site.
     */
    var functionName: String

    /**
     * Returns the name of the resource that contains the script for the
     * function for this call site.
     */
    var scriptName: String

    /**
     * Returns the unique id of the script, as in Chrome DevTools protocol
     * [`Runtime.ScriptId`](https://chromedevtools.github.io/devtools-protocol/1-3/Runtime/#type-ScriptId).
     * @since v22.14.0
     */
    var scriptId: String

    /**
     * Returns the number, 1-based, of the line for the associate function call.
     */
    var lineNumber: Double

    /**
     * Returns the 1-based column offset on the line for the associated function call.
     */
    var columnNumber: Double
}
