// Automatically generated - do not modify!

package vscode

/**
 * Represents a typed event.
 *
 * A function that represents an event to which you subscribe by calling it with
 * a listener function as argument.
 *
 * @example
 * item.onDidChange(function(event) { console.log("Event happened: " + event); });
 */
external interface Event<T> {
    /**
     * A function that represents an event to which you subscribe by calling it with
     * a listener function as argument.
     *
     * @param listener The listener function will be called when the event happens.
     * @param thisArgs The `this`-argument which will be used when calling the event listener.
     * @param disposables An array to which a {@link Disposable} will be added.
     * @returns A disposable which unsubscribes the event listener.
     */
//  (listener: (e: T) => any, thisArgs?: any, disposables?: Disposable[]): Disposable
}
