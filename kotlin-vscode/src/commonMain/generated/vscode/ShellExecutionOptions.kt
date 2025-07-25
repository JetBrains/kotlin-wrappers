// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsString
import js.objects.JsPlainObject
import js.objects.Record

/**
 * Options for a shell execution
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ShellExecutionOptions)
 */
@JsPlainObject
external interface ShellExecutionOptions {
    /**
     * The shell executable.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ShellExecutionOptions.executable)
     */
    var executable: String?

    /**
     * The arguments to be passed to the shell executable used to run the task. Most shells
     * require special arguments to execute a command. For  example `bash` requires the `-c`
     * argument to execute a command, `PowerShell` requires `-Command` and `cmd` requires both
     * `/d` and `/c`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ShellExecutionOptions.shellArgs)
     */
    var shellArgs: ReadonlyArray<JsString>?

    /**
     * The shell quotes supported by this shell.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ShellExecutionOptions.shellQuoting)
     */
    var shellQuoting: ShellQuotingOptions?

    /**
     * The current working directory of the executed shell.
     * If omitted the tools current workspace root is used.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ShellExecutionOptions.cwd)
     */
    var cwd: String?

    /**
     * The additional environment of the executed shell. If omitted
     * the parent process' environment is used. If provided it is merged with
     * the parent process' environment.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ShellExecutionOptions.env)
     */
    var env: Record<JsString, JsString>?
}
