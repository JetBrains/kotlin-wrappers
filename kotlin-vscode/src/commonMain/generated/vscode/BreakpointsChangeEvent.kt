// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * An event describing the changes to the set of [breakpoints][Breakpoint].
 */
external interface BreakpointsChangeEvent {
    /**
     * Added breakpoints.
     */
    val added: ReadonlyArray<Breakpoint>

    /**
     * Removed breakpoints.
     */
    val removed: ReadonlyArray<Breakpoint>

    /**
     * Changed breakpoints.
     */
    val changed: ReadonlyArray<Breakpoint>
}
