// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.JsString
import js.objects.Record
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * McpStdioServerDefinition represents an MCP server available by running
 * a local process and operating on its stdin and stdout streams. The process
 * will be spawned as a child process of the extension host and by default
 * will not run in a shell environment.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#McpStdioServerDefinition)
 */
open external class McpStdioServerDefinition {
    /**
     * The human-readable name of the server.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#McpStdioServerDefinition.label)
     */
    val label: String

    /**
     * The working directory used to start the server.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#McpStdioServerDefinition.cwd)
     */
    var cwd: Uri?

    /**
     * The command used to start the server. Node.js-based servers may use
     * `process.execPath` to use the editor's version of Node.js to run the script.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#McpStdioServerDefinition.command)
     */
    var command: String

    /**
     * Additional command-line arguments passed to the server.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#McpStdioServerDefinition.args)
     */
    var args: ReadonlyArray<JsString>

    /**
     * Optional additional environment information for the server. Variables
     * in this environment will overwrite or remove (if null) the default
     * environment variables of the editor's extension host.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#McpStdioServerDefinition.env)
     */
    var env: Record<JsString, JsString?>

    /**
     * Optional version identification for the server. If this changes, the
     * editor will indicate that tools have changed and prompt to refresh them.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#McpStdioServerDefinition.version)
     */
    var version: String?

    /**
     * @param label The human-readable name of the server.
     * @param command The command used to start the server.
     * @param args Additional command-line arguments passed to the server.
     * @param env Optional additional environment information for the server.
     * @param version Optional version identification for the server.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#McpStdioServerDefinition.constructor)
     */
    constructor(
        label: String,
        command: String,
        args: ReadonlyArray<JsString> = definedExternally,
        env: Record<JsString, JsString?> = definedExternally,
        version: String = definedExternally,
    )
}
