// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * The confidence of a {@link TerminalShellExecutionCommandLine} value.
 */
sealed /* enum */
external interface TerminalShellExecutionCommandLineConfidence {
    companion object {
        /**
         * The command line value confidence is low. This means that the value was read from the
         * terminal buffer using markers reported by the shell integration script. Additionally one
         * of the following conditions will be met:
         *
         * - The command started on the very left-most column which is unusual, or
         * - The command is multi-line which is more difficult to accurately detect due to line
         *   continuation characters and right prompts.
         * - Command line markers were not reported by the shell integration script.
         */
        val Low: TerminalShellExecutionCommandLineConfidence // 0

        /**
         * The command line value confidence is medium. This means that the value was read from the
         * terminal buffer using markers reported by the shell integration script. The command is
         * single-line and does not start on the very left-most column (which is unusual).
         */
        val Medium: TerminalShellExecutionCommandLineConfidence // 1

        /**
         * The command line value confidence is high. This means that the value was explicitly sent
         * from the shell integration script or the command was executed via the
         * {@link TerminalShellIntegration.executeCommand} API.
         */
        val High: TerminalShellExecutionCommandLineConfidence // 2
    }
}
