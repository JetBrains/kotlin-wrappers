// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * Renderer messaging is used to communicate with a single renderer. It's returned from {@link notebooks.createRendererMessaging}.
*/
export interface NotebookRendererMessaging {
/**
 * An event that fires when a message is received from a renderer.
*/
readonly onDidReceiveMessage: Event<{
/**
 * The {@link NotebookEditor editor} that sent the message.
*/
readonly editor: NotebookEditor;
/**
 * The actual message.
*/
readonly message: any;
}>;

/**
 * Send a message to one or all renderer.
 *
 * @param message Message to send
 * @param editor Editor to target with the message. If not provided, the
 * message is sent to all renderers.
 * @returns a boolean indicating whether the message was successfully
 * delivered to any renderer.
*/
postMessage(message: any, editor?: NotebookEditor): Thenable<boolean>;
}

// ORIGINAL SOURCE
 **/
