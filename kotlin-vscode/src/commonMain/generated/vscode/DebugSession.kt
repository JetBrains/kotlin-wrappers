// Automatically generated - do not modify!

package vscode

/**
 * A debug session.
 */
external interface DebugSession {
    /**
     * The unique ID of this debug session.
     */
//  readonly id: string;

    /**
     * The debug session's type from the {@link DebugConfiguration debug configuration}.
     */
//  readonly type: string;

    /**
     * The parent session of this debug session, if it was created as a child.
     * @see DebugSessionOptions.parentSession
     */
//  readonly parentSession?: DebugSession;

    /**
     * The debug session's name is initially taken from the {@link DebugConfiguration debug configuration}.
     * Any changes will be properly reflected in the UI.
     */
//  name: string;

    /**
     * The workspace folder of this session or `undefined` for a folderless setup.
     */
//  readonly workspaceFolder: WorkspaceFolder | undefined;

    /**
     * The "resolved" {@link DebugConfiguration debug configuration} of this session.
     * "Resolved" means that
     * - all variables have been substituted and
     * - platform specific attribute sections have been "flattened" for the matching platform and removed for non-matching platforms.
     */
//  readonly configuration: DebugConfiguration;

    /**
     * Send a custom request to the debug adapter.
     */
//  customRequest(command: string, args?: any): Thenable<any>;

    /**
     * Maps a breakpoint in the editor to the corresponding Debug Adapter Protocol (DAP) breakpoint that is managed by the debug adapter of the debug session.
     * If no DAP breakpoint exists (either because the editor breakpoint was not yet registered or because the debug adapter is not interested in the breakpoint), the value `undefined` is returned.
     *
     * @param breakpoint A {@link Breakpoint} in the editor.
     * @returns A promise that resolves to the Debug Adapter Protocol breakpoint or `undefined`.
     */
//  getDebugProtocolBreakpoint(breakpoint: Breakpoint): Thenable<DebugProtocolBreakpoint | undefined>;
}
