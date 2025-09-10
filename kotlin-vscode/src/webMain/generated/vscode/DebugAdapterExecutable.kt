// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * Represents a debug adapter executable and optional arguments and runtime options passed to it.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterExecutable)
 */
open external class DebugAdapterExecutable {
    /**
     * Creates a description for a debug adapter based on an executable program.
     *
     * @param command The command or executable path that implements the debug adapter.
     * @param args Optional arguments to be passed to the command or executable.
     * @param options Optional options to be used when starting the command or executable.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterExecutable.constructor)
     */
    constructor(
        command: String,
        args: ReadonlyArray<JsString> = definedExternally,
        options: DebugAdapterExecutableOptions = definedExternally,
    )

    /**
     * The command or path of the debug adapter executable.
     * A command must be either an absolute path of an executable or the name of an command to be looked up via the PATH environment variable.
     * The special value 'node' will be mapped to the editor's built-in Node.js runtime.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterExecutable.command)
     */
    val command: String

    /**
     * The arguments passed to the debug adapter executable. Defaults to an empty array.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterExecutable.args)
     */
    val args: ReadonlyArray<JsString>

    /**
     * Optional options to be used when the debug adapter is started.
     * Defaults to undefined.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterExecutable.options)
     */
    val options: DebugAdapterExecutableOptions?
}
