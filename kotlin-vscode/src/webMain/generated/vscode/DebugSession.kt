// Automatically generated - do not modify!

package vscode

import js.promise.PromiseLike
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * A debug session.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugSession)
 */
external interface DebugSession {
    /**
     * The unique ID of this debug session.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugSession.id)
     */
    val id: String

    /**
     * The debug session's type from the [debug configuration][DebugConfiguration].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugSession.type)
     */
    val type: String

    /**
     * The parent session of this debug session, if it was created as a child.
     * @see DebugSessionOptions.parentSession
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugSession.parentSession)
     */
    val parentSession: DebugSession?

    /**
     * The debug session's name is initially taken from the [debug configuration][DebugConfiguration].
     * Any changes will be properly reflected in the UI.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugSession.name)
     */
    var name: String

    /**
     * The workspace folder of this session or `undefined` for a folderless setup.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugSession.workspaceFolder)
     */
    val workspaceFolder: WorkspaceFolder?

    /**
     * The "resolved" [debug configuration][DebugConfiguration] of this session.
     * "Resolved" means that
     * - all variables have been substituted and
     * - platform specific attribute sections have been "flattened" for the matching platform and removed for non-matching platforms.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugSession.configuration)
     */
    val configuration: DebugConfiguration

    /**
     * Send a custom request to the debug adapter.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugSession.customRequest)
     */
    fun customRequest(
        command: String,
        args: JsAny? = definedExternally,
    ): PromiseLike<JsAny?>

    /**
     * Maps a breakpoint in the editor to the corresponding Debug Adapter Protocol (DAP) breakpoint that is managed by the debug adapter of the debug session.
     * If no DAP breakpoint exists (either because the editor breakpoint was not yet registered or because the debug adapter is not interested in the breakpoint), the value `undefined` is returned.
     *
     * @param breakpoint A [Breakpoint] in the editor.
     * @returns A promise that resolves to the Debug Adapter Protocol breakpoint or `undefined`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugSession.getDebugProtocolBreakpoint)
     */
    fun getDebugProtocolBreakpoint(breakpoint: Breakpoint): PromiseLike<DebugProtocolBreakpoint?>
}
