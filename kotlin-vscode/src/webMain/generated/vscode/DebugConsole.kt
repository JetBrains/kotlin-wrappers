// Automatically generated - do not modify!

package vscode

/**
 * Represents the debug console.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugConsole)
 */
external interface DebugConsole {
    /**
     * Append the given value to the debug console.
     *
     * @param value A string, falsy values will not be printed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugConsole.append)
     */
    fun append(value: String)

    /**
     * Append the given value and a line feed character
     * to the debug console.
     *
     * @param value A string, falsy values will be printed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugConsole.appendLine)
     */
    fun appendLine(value: String)
}
