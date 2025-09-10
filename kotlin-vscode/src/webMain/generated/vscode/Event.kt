// Automatically generated - do not modify!

package vscode

import kotlin.js.JsAny

/**
 * Represents a typed event.
 *
 * A function that represents an event to which you subscribe by calling it with
 * a listener function as argument.
 *
 * @example
 * item.onDidChange(function(event) { console.log("Event happened: " + event); });
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Event)
 */
external interface Event<T : JsAny?> {
    /**
     * A function that represents an event to which you subscribe by calling it with
     * a listener function as argument.
     *
     * @param listener The listener function will be called when the event happens.
     * @returns A disposable which unsubscribes the event listener.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Event)
     */
    operator fun invoke(
        listener: (e: T) -> Unit,
    ): Disposable
}
