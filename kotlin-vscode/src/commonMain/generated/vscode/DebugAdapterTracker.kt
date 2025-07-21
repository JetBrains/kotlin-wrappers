// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * A Debug Adapter Tracker is a means to track the communication between the editor and a Debug Adapter.
*/
export interface DebugAdapterTracker {
/**
 * A session with the debug adapter is about to be started.
*/
onWillStartSession?(): void;
/**
 * The debug adapter is about to receive a Debug Adapter Protocol message from the editor.
*/
onWillReceiveMessage?(message: any): void;
/**
 * The debug adapter has sent a Debug Adapter Protocol message to the editor.
*/
onDidSendMessage?(message: any): void;
/**
 * The debug adapter session is about to be stopped.
*/
onWillStopSession?(): void;
/**
 * An error with the debug adapter has occurred.
*/
onError?(error: Error): void;
/**
 * The debug adapter has exited with the given exit code or signal.
*/
onExit?(code: number | undefined, signal: string | undefined): void;
}

// ORIGINAL SOURCE
 **/
