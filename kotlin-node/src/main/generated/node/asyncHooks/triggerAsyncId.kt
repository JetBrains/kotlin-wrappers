// Automatically generated - do not modify!

@file:JsModule("node:async_hooks")
@file:JsNonModule

package node.asyncHooks

/**
 * ```js
 * const server = net.createServer((conn) => {
 *   // The resource that caused (or triggered) this callback to be called
 *   // was that of the new connection. Thus the return value of triggerAsyncId()
 *   // is the asyncId of "conn".
 *   async_hooks.triggerAsyncId();
 *
 * }).listen(port, () => {
 *   // Even though all callbacks passed to .listen() are wrapped in a nextTick()
 *   // the callback itself exists because the call to the server's .listen()
 *   // was made. So the return value would be the ID of the server.
 *   async_hooks.triggerAsyncId();
 * });
 * ```
 *
 * Promise contexts may not get valid `triggerAsyncId`s by default. See
 * the section on `promise execution tracking`.
 * @return The ID of the resource responsible for calling the callback that is currently being executed.
 */
external fun triggerAsyncId(): Number
