// Automatically generated - do not modify!

package vscode

/**
 * Options for {@link debug.startDebugging starting a debug session}.
 */
external interface DebugSessionOptions {
    /**
    // ORIGINAL SOURCE


    /**
     * When specified the newly created debug session is registered as a "child" session of this
     * "parent" debug session.
    */
    parentSession?: DebugSession;

    /**
     * Controls whether lifecycle requests like 'restart' are sent to the newly created session or its parent session.
     * By default (if the property is false or missing), lifecycle requests are sent to the new session.
     * This property is ignored if the session has no parent session.
    */
    lifecycleManagedByParent?: boolean;

    /**
     * Controls whether this session should have a separate debug console or share it
     * with the parent session. Has no effect for sessions which do not have a parent session.
     * Defaults to Separate.
    */
    consoleMode?: DebugConsoleMode;

    /**
     * Controls whether this session should run without debugging, thus ignoring breakpoints.
     * When this property is not specified, the value from the parent session (if there is one) is used.
    */
    noDebug?: boolean;

    /**
     * Controls if the debug session's parent session is shown in the CALL STACK view even if it has only a single child.
     * By default, the debug session will never hide its parent.
     * If compact is true, debug sessions with a single child are hidden in the CALL STACK view to make the tree more compact.
    */
    compact?: boolean;

    /**
     * When true, a save will not be triggered for open editors when starting a debug session, regardless of the value of the `debug.saveBeforeStart` setting.
    */
    suppressSaveBeforeStart?: boolean;

    /**
     * When true, the debug toolbar will not be shown for this session.
    */
    suppressDebugToolbar?: boolean;

    /**
     * When true, the window statusbar color will not be changed for this session.
    */
    suppressDebugStatusbar?: boolean;

    /**
     * When true, the debug viewlet will not be automatically revealed for this session.
    */
    suppressDebugView?: boolean;

    /**
     * Signals to the editor that the debug session was started from a test run
     * request. This is used to link the lifecycle of the debug session and
     * test run in UI actions.
    */
    testRun?: TestRun;

    // ORIGINAL SOURCE
     **/
}
