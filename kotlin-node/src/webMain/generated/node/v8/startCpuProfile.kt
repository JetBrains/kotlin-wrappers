// Automatically generated - do not modify!

@file:JsModule("node:v8")

package node.v8

/**
 * Starting a CPU profile then return a `SyncCPUProfileHandle` object. This API supports `using` syntax.
 *
 * ```js
 * const handle = v8.startCpuProfile();
 * const profile = handle.stop();
 * console.log(profile);
 * ```
 * @since v24.12.0
 */
external fun startCpuProfile(): SyncCPUProfileHandle
