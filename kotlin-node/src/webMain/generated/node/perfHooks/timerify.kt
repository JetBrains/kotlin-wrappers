// Automatically generated - do not modify!

@file:JsModule("node:perf_hooks")

package node.perfHooks

/**
 * _This property is an extension by Node.js. It is not available in Web browsers._
 *
 * Wraps a function within a new function that measures the running time of the
 * wrapped function. A `PerformanceObserver` must be subscribed to the `'function'`
 * event type in order for the timing details to be accessed.
 *
 * ```js
 * import { timerify, performance, PerformanceObserver } from 'node:perf_hooks';
 *
 * function someFunction() {
 *   console.log('hello world');
 * }
 *
 * const wrapped = timerify(someFunction);
 *
 * const obs = new PerformanceObserver((list) => {
 *   console.log(list.getEntries()[0].duration);
 *
 *   performance.clearMarks();
 *   performance.clearMeasures();
 *   obs.disconnect();
 * });
 * obs.observe({ entryTypes: ['function'] });
 *
 * // A performance timeline entry will be created
 * wrapped();
 * ```
 *
 * If the wrapped function returns a promise, a finally handler will be attached
 * to the promise and the duration will be reported once the finally handler is invoked.
 * @since v24.12.0
 */
external fun <T : Function<Any?> /* (...params: any[]) => any */> timerify(
    fn: T,
    options: TimerifyOptions = definedExternally,
): T
