// Generated by Karakum - do not modify it manually!

@file:JsModule("node:os")

package node.os

/**
 * Returns an array of objects containing information about each logical CPU core.
 * The array will be empty if no CPU information is available, such as if the `/proc` file system is unavailable.
 *
 * The properties included on each object include:
 *
 * ```js
 * [
 *   {
 *     model: 'Intel(R) Core(TM) i7 CPU         860  @ 2.80GHz',
 *     speed: 2926,
 *     times: {
 *       user: 252020,
 *       nice: 0,
 *       sys: 30340,
 *       idle: 1070356870,
 *       irq: 0,
 *     },
 *   },
 *   {
 *     model: 'Intel(R) Core(TM) i7 CPU         860  @ 2.80GHz',
 *     speed: 2926,
 *     times: {
 *       user: 306960,
 *       nice: 0,
 *       sys: 26980,
 *       idle: 1071569080,
 *       irq: 0,
 *     },
 *   },
 *   {
 *     model: 'Intel(R) Core(TM) i7 CPU         860  @ 2.80GHz',
 *     speed: 2926,
 *     times: {
 *       user: 248450,
 *       nice: 0,
 *       sys: 21750,
 *       idle: 1070919370,
 *       irq: 0,
 *     },
 *   },
 *   {
 *     model: 'Intel(R) Core(TM) i7 CPU         860  @ 2.80GHz',
 *     speed: 2926,
 *     times: {
 *       user: 256880,
 *       nice: 0,
 *       sys: 19430,
 *       idle: 1070905480,
 *       irq: 20,
 *     },
 *   },
 * ]
 * ```
 *
 * `nice` values are POSIX-only. On Windows, the `nice` values of all processors
 * are always 0.
 *
 * `os.cpus().length` should not be used to calculate the amount of parallelism
 * available to an application. Use {@link availableParallelism} for this purpose.
 * @since v0.3.3
 */
external fun cpus(): js.array.ReadonlyArray<CpuInfo>
