// Automatically generated - do not modify!

@file:JsModule("node:vm")
@file:JsNonModule

package node.vm

import kotlin.js.Promise

/**
 * Measure the memory known to V8 and used by all contexts known to the
 * current V8 isolate, or the main context.
 *
 * The format of the object that the returned Promise may resolve with is
 * specific to the V8 engine and may change from one version of V8 to the next.
 *
 * The returned result is different from the statistics returned by`v8.getHeapSpaceStatistics()` in that `vm.measureMemory()` measure the
 * memory reachable by each V8 specific contexts in the current instance of
 * the V8 engine, while the result of `v8.getHeapSpaceStatistics()` measure
 * the memory occupied by each heap space in the current V8 instance.
 *
 * ```js
 * const vm = require('vm');
 * // Measure the memory used by the main context.
 * vm.measureMemory({ mode: 'summary' })
 *   // This is the same as vm.measureMemory()
 *   .then((result) => {
 *     // The current format is:
 *     // {
 *     //   total: {
 *     //      jsMemoryEstimate: 2418479, jsMemoryRange: [ 2418479, 2745799 ]
 *     //    }
 *     // }
 *     console.log(result);
 *   });
 *
 * const context = vm.createContext({ a: 1 });
 * vm.measureMemory({ mode: 'detailed', execution: 'eager' })
 *   .then((result) => {
 *     // Reference the context here so that it won't be GC'ed
 *     // until the measurement is complete.
 *     console.log(context.a);
 *     // {
 *     //   total: {
 *     //     jsMemoryEstimate: 2574732,
 *     //     jsMemoryRange: [ 2574732, 2904372 ]
 *     //   },
 *     //   current: {
 *     //     jsMemoryEstimate: 2438996,
 *     //     jsMemoryRange: [ 2438996, 2768636 ]
 *     //   },
 *     //   other: [
 *     //     {
 *     //       jsMemoryEstimate: 135736,
 *     //       jsMemoryRange: [ 135736, 465376 ]
 *     //     }
 *     //   ]
 *     // }
 *     console.log(result);
 *   });
 * ```
 * @since v13.10.0
 * @experimental
 */
@JsName("measureMemory")
external fun measureMemoryAsync(
    options: MeasureMemoryOptions = definedExternally,
): Promise<MemoryMeasurement>
