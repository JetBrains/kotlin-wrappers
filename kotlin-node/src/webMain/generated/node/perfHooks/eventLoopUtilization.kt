// Automatically generated - do not modify!

@file:JsModule("node:perf_hooks")

package node.perfHooks

/**
 * The `eventLoopUtilization()` function returns an object that contains the
 * cumulative duration of time the event loop has been both idle and active as a
 * high resolution milliseconds timer. The `utilization` value is the calculated
 * Event Loop Utilization (ELU).
 *
 * If bootstrapping has not yet finished on the main thread the properties have
 * the value of `0`. The ELU is immediately available on
 * [Worker threads](https://nodejs.org/docs/latest-v24.x/api/worker_threads.html#worker-threads)
 * since bootstrap happens within the event loop.
 *
 * Both `utilization1` and `utilization2` are optional parameters.
 *
 * If `utilization1` is passed, then the delta between the current call's `active`
 * and `idle` times, as well as the corresponding `utilization` value are
 * calculated and returned (similar to `process.hrtime()`).
 *
 * If `utilization1` and `utilization2` are both passed, then the delta is
 * calculated between the two arguments. This is a convenience option because,
 * unlike `process.hrtime()`, calculating the ELU is more complex than a
 * single subtraction.
 *
 * ELU is similar to CPU utilization, except that it only measures event loop
 * statistics and not CPU usage. It represents the percentage of time the event
 * loop has spent outside the event loop's event provider (e.g. `epoll_wait`).
 * No other CPU idle time is taken into consideration. The following is an example
 * of how a mostly idle process will have a high ELU.
 *
 * ```js
 * import { eventLoopUtilization } from 'node:perf_hooks';
 * import { spawnSync } from 'node:child_process';
 *
 * setImmediate(() => {
 *   const elu = eventLoopUtilization();
 *   spawnSync('sleep', ['5']);
 *   console.log(eventLoopUtilization(elu).utilization);
 * });
 * ```
 *
 * Although the CPU is mostly idle while running this script, the value of `utilization`
 * is `1`. This is because the call to `child_process.spawnSync()` blocks the event loop
 * from proceeding.
 *
 * Passing in a user-defined object instead of the result of a previous call to
 * `eventLoopUtilization()` will lead to undefined behavior. The return values are not
 * guaranteed to reflect any correct state of the event loop.
 * @since v24.12.0
 * @param utilization1 The result of a previous call to `eventLoopUtilization()`.
 * @param utilization2 The result of a previous call to `eventLoopUtilization()` prior to `utilization1`.
 */
external fun eventLoopUtilization(
    utilization1: EventLoopUtilization = definedExternally,
    utilization2: EventLoopUtilization = definedExternally,
): EventLoopUtilization
