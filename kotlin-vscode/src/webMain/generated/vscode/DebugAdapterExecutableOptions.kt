// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject
import js.objects.ReadonlyRecord
import kotlin.js.JsString

/**
 * Options for a debug adapter executable.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterExecutableOptions)
 */
@JsPlainObject
external interface DebugAdapterExecutableOptions {
    /**
     * The additional environment of the executed program or shell. If omitted
     * the parent process' environment is used. If provided it is merged with
     * the parent process' environment.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterExecutableOptions.env)
     */
    var env: ReadonlyRecord<JsString, JsString>?

    /**
     * The current working directory for the executed debug adapter.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterExecutableOptions.cwd)
     */
    var cwd: String?
}
