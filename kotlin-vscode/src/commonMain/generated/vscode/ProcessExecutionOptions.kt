// Automatically generated - do not modify!

package vscode

import js.objects.Record

/**
 * Options for a process execution
 */
external interface ProcessExecutionOptions {
    /**
     * The current working directory of the executed program or shell.
     * If omitted the tools current workspace root is used.
     */
    var cwd: String?

    /**
     * The additional environment of the executed program or shell. If omitted
     * the parent process' environment is used. If provided it is merged with
     * the parent process' environment.
     */
    var env: Record<String, String>?
}
