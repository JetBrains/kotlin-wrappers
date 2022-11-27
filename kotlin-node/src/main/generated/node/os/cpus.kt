// Automatically generated - do not modify!

@file:JsModule("node:os")
@file:JsNonModule

package node.os

import js.core.ReadonlyArray

/**
 * Returns an array of objects containing information about each logical CPU core.
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
 *       irq: 0
 *     }
 *   },
 *   {
 *     model: 'Intel(R) Core(TM) i7 CPU         860  @ 2.80GHz',
 *     speed: 2926,
 *     times: {
 *       user: 306960,
 *       nice: 0,
 *       sys: 26980,
 *       idle: 1071569080,
 *       irq: 0
 *     }
 *   },
 *   {
 *     model: 'Intel(R) Core(TM) i7 CPU         860  @ 2.80GHz',
 *     speed: 2926,
 *     times: {
 *       user: 248450,
 *       nice: 0,
 *       sys: 21750,
 *       idle: 1070919370,
 *       irq: 0
 *     }
 *   },
 *   {
 *     model: 'Intel(R) Core(TM) i7 CPU         860  @ 2.80GHz',
 *     speed: 2926,
 *     times: {
 *       user: 256880,
 *       nice: 0,
 *       sys: 19430,
 *       idle: 1070905480,
 *       irq: 20
 *     }
 *   },
 * ]
 * ```
 *
 * `nice` values are POSIX-only. On Windows, the `nice` values of all processors
 * are always 0.
 * @since v0.3.3
 */
external fun cpus(): ReadonlyArray<CpuInfo>
