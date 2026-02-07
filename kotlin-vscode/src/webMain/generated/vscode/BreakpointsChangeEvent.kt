// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * An event describing the changes to the set of [breakpoints][Breakpoint].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#BreakpointsChangeEvent)
 */
@JsPlainObject
external interface BreakpointsChangeEvent {
    /**
     * Added breakpoints.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#BreakpointsChangeEvent.added)
     */
    val added: ReadonlyArray<Breakpoint>

    /**
     * Removed breakpoints.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#BreakpointsChangeEvent.removed)
     */
    val removed: ReadonlyArray<Breakpoint>

    /**
     * Changed breakpoints.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#BreakpointsChangeEvent.changed)
     */
    val changed: ReadonlyArray<Breakpoint>
}
