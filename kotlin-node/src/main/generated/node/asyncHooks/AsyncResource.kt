// Automatically generated - do not modify!

@file:JsModule("node:async_hooks")
@file:JsNonModule

package node.asyncHooks

import kotlinx.js.ReadonlyArray

external class AsyncResource {
    /**
     * AsyncResource() is meant to be extended. Instantiating a
     * new AsyncResource() also triggers init. If triggerAsyncId is omitted then
     * async_hook.executionAsyncId() is used.
     * @param type The type of async event.
     * @param triggerAsyncId The ID of the execution context that created
     *   this async event (default: `executionAsyncId()`), or an
     *   AsyncResourceOptions object (since v9.3.0)
     */
    constructor(
        type: String,
        triggerAsyncId: Any /* number | AsyncResourceOptions */ = definedExternally,
    )
    /**
     * Binds the given function to the current execution context.
     *
     * The returned function will have an `asyncResource` property referencing
     * the `AsyncResource` to which the function is bound.
     * @since v14.8.0, v12.19.0
     * @param fn The function to bind to the current execution context.
     * @param type An optional name to associate with the underlying `AsyncResource`.
     */

    // HIDDEN METHOD START
    /*
    static bind<Func extends (this: ThisArg, ...args: any[]) => any, ThisArg>(
        fn: Func,
        type?: string,
        thisArg?: ThisArg
    ): Func & {
        asyncResource: AsyncResource;
    }
    */
    // HIDDEN METHOD END

    /**
     * Binds the given function to execute to this `AsyncResource`'s scope.
     *
     * The returned function will have an `asyncResource` property referencing
     * the `AsyncResource` to which the function is bound.
     * @since v14.8.0, v12.19.0
     * @param fn The function to bind to the current `AsyncResource`.
     */

    // HIDDEN METHOD START
    /*
    bind<Func extends (...args: any[]) => any>(
        fn: Func
    ): Func & {
        asyncResource: AsyncResource;
    }
    */
    // HIDDEN METHOD END

    /**
     * Call the provided function with the provided arguments in the execution context
     * of the async resource. This will establish the context, trigger the AsyncHooks
     * before callbacks, call the function, trigger the AsyncHooks after callbacks, and
     * then restore the original execution context.
     * @since v9.6.0
     * @param fn The function to call in the execution context of this async resource.
     * @param thisArg The receiver to be used for the function call.
     * @param args Optional arguments to pass to the function.
     */
    fun <This, Result> runInAsyncScope(
        fn: Function<Result>, /* this: This */
        thisArg: This = definedExternally,
        vararg args: ReadonlyArray<Any>,
    ): Result

    /**
     * Call all `destroy` hooks. This should only ever be called once. An error will
     * be thrown if it is called more than once. This **must** be manually called. If
     * the resource is left to be collected by the GC then the `destroy` hooks will
     * never be called.
     * @return A reference to `asyncResource`.
     */
    fun emitDestroy(): AsyncResource

    /**
     * @return The unique `asyncId` assigned to the resource.
     */
    fun asyncId(): Number

    /**
     *
     * @return The same `triggerAsyncId` that is passed to the `AsyncResource` constructor.
     */
    fun triggerAsyncId(): Number
}
