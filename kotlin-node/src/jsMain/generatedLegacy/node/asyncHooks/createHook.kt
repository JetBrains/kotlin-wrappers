// Automatically generated - do not modify!

@file:JsModule("node:async_hooks")

package node.asyncHooks

/**
 * Registers functions to be called for different lifetime events of each async
 * operation.
 *
 * The callbacks `init()`/`before()`/`after()`/`destroy()` are called for the
 * respective asynchronous event during a resource's lifetime.
 *
 * All callbacks are optional. For example, if only resource cleanup needs to
 * be tracked, then only the `destroy` callback needs to be passed. The
 * specifics of all functions that can be passed to `callbacks` is in the `Hook Callbacks` section.
 *
 * ```js
 * import { createHook } from 'async_hooks';
 *
 * const asyncHook = createHook({
 *   init(asyncId, type, triggerAsyncId, resource) { },
 *   destroy(asyncId) { }
 * });
 * ```
 *
 * The callbacks will be inherited via the prototype chain:
 *
 * ```js
 * class MyAsyncCallbacks {
 *   init(asyncId, type, triggerAsyncId, resource) { }
 *   destroy(asyncId) {}
 * }
 *
 * class MyAddedCallbacks extends MyAsyncCallbacks {
 *   before(asyncId) { }
 *   after(asyncId) { }
 * }
 *
 * const asyncHook = async_hooks.createHook(new MyAddedCallbacks());
 * ```
 *
 * Because promises are asynchronous resources whose lifecycle is tracked
 * via the async hooks mechanism, the `init()`, `before()`, `after()`, and`destroy()` callbacks _must not_ be async functions that return promises.
 * @since v8.1.0
 * @param callbacks The `Hook Callbacks` to register
 * @return Instance used for disabling and enabling hooks
 */
external fun createHook(
    callbacks: HookCallbacks,
): AsyncHook
