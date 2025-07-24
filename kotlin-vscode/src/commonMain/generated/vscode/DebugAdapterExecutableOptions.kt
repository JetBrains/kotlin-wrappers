// Automatically generated - do not modify!

package vscode

import js.core.JsString
import js.objects.Record

/**
 * Options for a debug adapter executable.
 */
external interface DebugAdapterExecutableOptions {
    /**
     * The additional environment of the executed program or shell. If omitted
     * the parent process' environment is used. If provided it is merged with
     * the parent process' environment.
     */
    var env: Record<JsString, JsString>?

    /**
     * The current working directory for the executed debug adapter.
     */
    var cwd: String?
}
