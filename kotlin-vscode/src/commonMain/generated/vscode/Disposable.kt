// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents a type which can release resources, such
 * as event listening or a timer.
 */
open external class Disposable {
    /**
     * Combine many disposable-likes into one. You can use this method when having objects with
     * a dispose function which aren't instances of `Disposable`.
     *
     * @param disposableLikes Objects that have at least a `dispose`-function member. Note that asynchronous
     * dispose-functions aren't awaited.
     * @returns Returns a new disposable which, upon dispose, will
     * dispose all provided disposables.
     */
    /*
    static from(...disposableLikes: {
        /**
         * Function to clean up resources.
         */
        dispose: () => any;
    }[]): Disposable
    */

    /**
     * Creates a new disposable that calls the provided function
     * on dispose.
     *
     * *Note* that an asynchronous function is not awaited.
     *
     * @param callOnDispose Function that disposes something.
     */
    constructor(callOnDispose: () -> Unit)

    /**
     * Dispose this object.
     */
    fun dispose(): Any?
}
