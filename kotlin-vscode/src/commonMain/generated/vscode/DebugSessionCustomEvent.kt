// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * A custom Debug Adapter Protocol event received from a {@link DebugSession debug session}.
*/
export interface DebugSessionCustomEvent {
/**
 * The {@link DebugSession debug session} for which the custom event was received.
*/
readonly session: DebugSession;

/**
 * Type of event.
*/
readonly event: string;

/**
 * Event specific information.
*/
readonly body: any;
}

// ORIGINAL SOURCE
 **/
