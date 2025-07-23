// Automatically generated - do not modify!

package vscode

/**
 * Represents the debug console.
 */
external interface DebugConsole {
    /**
     * Append the given value to the debug console.
     *
     * @param value A string, falsy values will not be printed.
     */
    fun append(value: String)

    /**
     * Append the given value and a line feed character
     * to the debug console.
     *
     * @param value A string, falsy values will be printed.
     */
    fun appendLine(value: String)
}
