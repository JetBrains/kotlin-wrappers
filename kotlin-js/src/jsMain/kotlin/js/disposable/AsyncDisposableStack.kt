package js.disposable

import js.core.Void
import js.promise.Promise
import js.promise.PromiseLike
import seskar.js.JsAsync

open external class AsyncDisposableStack :
    AsyncDisposable {
    /**
     * Returns a value indicating whether this stack has been disposed.
     */
    val disposed: Boolean

    /**
     * Disposes each resource in the stack in the reverse order that they were added.
     */
    @JsAsync
    suspend fun dispose()

    /**
     * Disposes each resource in the stack in the reverse order that they were added.
     */
    fun disposeAsync(): Promise<Void>

    /**
     * Adds a disposable resource to the stack, returning the resource.
     * @param value The resource to add. `null` and `undefined` will not be added, but will be returned.
     * @returns The provided {@link value}.
     */
    fun <T : Disposable?> use(value: T): T
    fun <T : AsyncDisposable?> use(value: T): T

    /**
     * Adds a value and associated disposal callback as a resource to the stack.
     * @param value The value to add.
     * @param onDisposeAsync The callback to use in place of a `[Symbol.asyncDispose]()` method. Will be invoked with `value`
     * as the first parameter.
     * @returns The provided {@link value}.
     */
    fun <T> adopt(value: T, onDisposeAsync: (value: T) -> PromiseLike<Void>?): T

    /**
     * Adds a callback to be invoked when the stack is disposed.
     */
    fun defer(onDisposeAsync: () -> PromiseLike<Void>?)

    /**
     * Move all resources out of this stack and into a new `DisposableStack`, and marks this stack as disposed.
     * @example
     * ```ts
     * class C {
     *   #res1: Disposable;
     *   #res2: Disposable;
     *   #disposables: DisposableStack;
     *   constructor() {
     *     // stack will be disposed when exiting constructor for any reason
     *     using stack = new DisposableStack();
     *
     *     // get first resource
     *     this.#res1 = stack.use(getResource1());
     *
     *     // get second resource. If this fails, both `stack` and `#res1` will be disposed.
     *     this.#res2 = stack.use(getResource2());
     *
     *     // all operations succeeded, move resources out of `stack` so that they aren't disposed
     *     // when constructor exits
     *     this.#disposables = stack.move();
     *   }
     *
     *   [Symbol.dispose]() {
     *     this.#disposables.dispose();
     *   }
     * }
     * ```
     */
    fun move(): AsyncDisposableStack
}
