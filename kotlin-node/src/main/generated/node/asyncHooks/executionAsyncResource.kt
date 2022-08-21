// Automatically generated - do not modify!

@file:JsModule("node:async_hooks")
@file:JsNonModule

package node.asyncHooks

/**
 * Resource objects returned by `executionAsyncResource()` are most often internal
 * Node.js handle objects with undocumented APIs. Using any functions or properties
 * on the object is likely to crash your application and should be avoided.
 *
 * Using `executionAsyncResource()` in the top-level execution context will
 * return an empty object as there is no handle or request object to use,
 * but having an object representing the top-level can be helpful.
 *
 * ```js
 * import { open } from 'fs';
 * import { executionAsyncId, executionAsyncResource } from 'async_hooks';
 *
 * console.log(executionAsyncId(), executionAsyncResource());  // 1 {}
 * open(new URL(import.meta.url), 'r', (err, fd) => {
 *   console.log(executionAsyncId(), executionAsyncResource());  // 7 FSReqWrap
 * });
 * ```
 *
 * This can be used to implement continuation local storage without the
 * use of a tracking `Map` to store the metadata:
 *
 * ```js
 * import { createServer } from 'http';
 * import {
 *   executionAsyncId,
 *   executionAsyncResource,
 *   createHook
 * } from 'async_hooks';
 * const sym = Symbol('state'); // Private symbol to avoid pollution
 *
 * createHook({
 *   init(asyncId, type, triggerAsyncId, resource) {
 *     const cr = executionAsyncResource();
 *     if (cr) {
 *       resource[sym] = cr[sym];
 *     }
 *   }
 * }).enable();
 *
 * const server = createServer((req, res) => {
 *   executionAsyncResource()[sym] = { state: req.url };
 *   setTimeout(function() {
 *     res.end(JSON.stringify(executionAsyncResource()[sym]));
 *   }, 100);
 * }).listen(3000);
 * ```
 * @since v13.9.0, v12.17.0
 * @return The resource representing the current execution. Useful to store data within the resource.
 */
external fun executionAsyncResource(): Any
