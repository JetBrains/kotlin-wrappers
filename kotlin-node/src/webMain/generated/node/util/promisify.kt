// Automatically generated - do not modify!

@file:JsModule("node:util")

package node.util

import js.promise.Promise

/**
 * Takes a function following the common error-first callback style, i.e. taking
 * an `(err, value) => ...` callback as the last argument, and returns a version
 * that returns promises.
 *
 * ```js
 * import { promisify } from 'node:util';
 * import { stat } from 'node:fs';
 *
 * const promisifiedStat = promisify(stat);
 * promisifiedStat('.').then((stats) => {
 *   // Do something with `stats`
 * }).catch((error) => {
 *   // Handle the error.
 * });
 * ```
 *
 * Or, equivalently using `async function`s:
 *
 * ```js
 * import { promisify } from 'node:util';
 * import { stat } from 'node:fs';
 *
 * const promisifiedStat = promisify(stat);
 *
 * async function callStat() {
 *   const stats = await promisifiedStat('.');
 *   console.log(`This directory is owned by ${stats.uid}`);
 * }
 *
 * callStat();
 * ```
 *
 * If there is an `original[util.promisify.custom]` property present, `promisify`
 * will return its value, see [Custom promisified functions](https://nodejs.org/docs/latest-v24.x/api/util.html#custom-promisified-functions).
 *
 * `promisify()` assumes that `original` is a function taking a callback as its
 * final argument in all cases. If `original` is not a function, `promisify()`
 * will throw an error. If `original` is a function but its last argument is not
 * an error-first callback, it will still be passed an error-first
 * callback as its last argument.
 *
 * Using `promisify()` on class methods or other methods that use `this` may not
 * work as expected unless handled specially:
 *
 * ```js
 * import { promisify } from 'node:util';
 *
 * class Foo {
 *   constructor() {
 *     this.a = 42;
 *   }
 *
 *   bar(callback) {
 *     callback(null, this.a);
 *   }
 * }
 *
 * const foo = new Foo();
 *
 * const naiveBar = promisify(foo.bar);
 * // TypeError: Cannot read properties of undefined (reading 'a')
 * // naiveBar().then(a => console.log(a));
 *
 * naiveBar.call(foo).then((a) => console.log(a)); // '42'
 *
 * const bindBar = naiveBar.bind(foo);
 * bindBar().then((a) => console.log(a)); // '42'
 * ```
 * @since v8.0.0
 */
external fun <TCustom : Function<*>> promisify(fn: CustomPromisify<TCustom>): TCustom

external fun <TResult> promisify(fn: (callback: (err: Any?, result: TResult) -> Unit) -> Unit): () -> Promise<TResult>

external fun promisify(fn: (callback: (err: Any? /* use undefined for default */) -> Unit) -> Unit): () -> Promise<js.core.Void>

external fun <T1, TResult> promisify(
    fn: (arg1: T1, callback: (err: Any?, result: TResult) -> Unit) -> Unit,
): (arg1: T1) -> Promise<TResult>

external fun <T1> promisify(fn: (arg1: T1, callback: (err: Any? /* use undefined for default */) -> Unit) -> Unit): (arg1: T1) -> Promise<js.core.Void>

external fun <T1, T2, TResult> promisify(
    fn: (arg1: T1, arg2: T2, callback: (err: Any?, result: TResult) -> Unit) -> Unit,
): (arg1: T1, arg2: T2) -> Promise<TResult>

external fun <T1, T2> promisify(fn: (arg1: T1, arg2: T2, callback: (err: Any? /* use undefined for default */) -> Unit) -> Unit): (arg1: T1, arg2: T2) -> Promise<js.core.Void>

external fun <T1, T2, T3, TResult> promisify(
    fn: (arg1: T1, arg2: T2, arg3: T3, callback: (err: Any?, result: TResult) -> Unit) -> Unit,
): (arg1: T1, arg2: T2, arg3: T3) -> Promise<TResult>

external fun <T1, T2, T3> promisify(fn: (arg1: T1, arg2: T2, arg3: T3, callback: (err: Any? /* use undefined for default */) -> Unit) -> Unit): (arg1: T1, arg2: T2, arg3: T3) -> Promise<js.core.Void>

external fun <T1, T2, T3, T4, TResult> promisify(
    fn: (arg1: T1, arg2: T2, arg3: T3, arg4: T4, callback: (err: Any?, result: TResult) -> Unit) -> Unit,
): (arg1: T1, arg2: T2, arg3: T3, arg4: T4) -> Promise<TResult>

external fun <T1, T2, T3, T4> promisify(fn: (arg1: T1, arg2: T2, arg3: T3, arg4: T4, callback: (err: Any? /* use undefined for default */) -> Unit) -> Unit): (arg1: T1, arg2: T2, arg3: T3, arg4: T4) -> Promise<js.core.Void>

external fun <T1, T2, T3, T4, T5, TResult> promisify(
    fn: (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, callback: (err: Any?, result: TResult) -> Unit) -> Unit,
): (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5) -> Promise<TResult>

external fun <T1, T2, T3, T4, T5> promisify(
    fn: (
        arg1: T1,
        arg2: T2,
        arg3: T3,
        arg4: T4,
        arg5: T5,
        callback: (err: Any? /* use undefined for default */) -> Unit,
    ) -> Unit,
): (arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5) -> Promise<js.core.Void>

external fun promisify(fn: Function<*>): Function<*>

external object promisify {
    /**
     * That can be used to declare custom promisified variants of functions.
     */
    val custom: /* unique */ js.symbol.Symbol
}
