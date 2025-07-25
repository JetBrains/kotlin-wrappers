// Automatically generated - do not modify!

package vscode

import js.core.JsString
import js.objects.JsPlainObject
import js.objects.Record

/**
 * Options for a process execution
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ProcessExecutionOptions)
 */
@JsPlainObject
external interface ProcessExecutionOptions {
    /**
     * The current working directory of the executed program or shell.
     * If omitted the tools current workspace root is used.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ProcessExecutionOptions.cwd)
     */
    var cwd: String?

    /**
     * The additional environment of the executed program or shell. If omitted
     * the parent process' environment is used. If provided it is merged with
     * the parent process' environment.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ProcessExecutionOptions.env)
     */
    var env: Record<JsString, JsString>?
}
