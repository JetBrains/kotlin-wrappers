// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * Represents a type which can release resources, such
 * as event listening or a timer.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Disposable)
 */
open external class Disposable :
    DisposableLike {
    /**
     * Creates a new disposable that calls the provided function
     * on dispose.
     *
     * *Note* that an asynchronous function is not awaited.
     *
     * @param callOnDispose Function that disposes something.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Disposable.constructor)
     */
    constructor(callOnDispose: () -> Unit)

    /**
     * Dispose this object.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Disposable.dispose)
     */
    override fun dispose()

    companion object {
        /**
         * Combine many disposable-likes into one. You can use this method when having objects with
         * a dispose function which aren't instances of `Disposable`.
         *
         * @param disposableLikes Objects that have at least a `dispose`-function member. Note that asynchronous
         * dispose-functions aren't awaited.
         * @returns Returns a new disposable which, upon dispose, will
         * dispose all provided disposables.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Disposable.from)
         */
        fun from(vararg disposableLikes: DisposableLike): Disposable
    }
}
