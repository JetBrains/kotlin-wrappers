// Automatically generated - do not modify!

@file:JsModule("node:crypto")
@file:JsNonModule

package node.crypto

import org.khronos.webgl.ArrayBufferView

/**
 * This function is similar to {@link randomBytes} but requires the first
 * argument to be a `Buffer` that will be filled. It also
 * requires that a callback is passed in.
 *
 * If the `callback` function is not provided, an error will be thrown.
 *
 * ```js
 * import { Buffer } from 'buffer';
 * const { randomFill } = await import('crypto');
 *
 * const buf = Buffer.alloc(10);
 * randomFill(buf, (err, buf) => {
 *   if (err) throw err;
 *   console.log(buf.toString('hex'));
 * });
 *
 * randomFill(buf, 5, (err, buf) => {
 *   if (err) throw err;
 *   console.log(buf.toString('hex'));
 * });
 *
 * // The above is equivalent to the following:
 * randomFill(buf, 5, 5, (err, buf) => {
 *   if (err) throw err;
 *   console.log(buf.toString('hex'));
 * });
 * ```
 *
 * Any `ArrayBuffer`, `TypedArray`, or `DataView` instance may be passed as`buffer`.
 *
 * While this includes instances of `Float32Array` and `Float64Array`, this
 * function should not be used to generate random floating-point numbers. The
 * result may contain `+Infinity`, `-Infinity`, and `NaN`, and even if the array
 * contains finite numbers only, they are not drawn from a uniform random
 * distribution and have no meaningful lower or upper bounds.
 *
 * ```js
 * import { Buffer } from 'buffer';
 * const { randomFill } = await import('crypto');
 *
 * const a = new Uint32Array(10);
 * randomFill(a, (err, buf) => {
 *   if (err) throw err;
 *   console.log(Buffer.from(buf.buffer, buf.byteOffset, buf.byteLength)
 *     .toString('hex'));
 * });
 *
 * const b = new DataView(new ArrayBuffer(10));
 * randomFill(b, (err, buf) => {
 *   if (err) throw err;
 *   console.log(Buffer.from(buf.buffer, buf.byteOffset, buf.byteLength)
 *     .toString('hex'));
 * });
 *
 * const c = new ArrayBuffer(10);
 * randomFill(c, (err, buf) => {
 *   if (err) throw err;
 *   console.log(Buffer.from(buf).toString('hex'));
 * });
 * ```
 *
 * This API uses libuv's threadpool, which can have surprising and
 * negative performance implications for some applications; see the `UV_THREADPOOL_SIZE` documentation for more information.
 *
 * The asynchronous version of `crypto.randomFill()` is carried out in a single
 * threadpool request. To minimize threadpool task length variation, partition
 * large `randomFill` requests when doing so as part of fulfilling a client
 * request.
 * @since v7.10.0, v6.13.0
 * @param buffer Must be supplied. The size of the provided `buffer` must not be larger than `2**31 - 1`.
 * @param [offset=0]
 * @param [size=buffer.length - offset]
 * @param callback `function(err, buf) {}`.
 */
external fun <T : ArrayBufferView> randomFill(
    buffer: T,
    callback: (
        error: Error?,
        buf: T,
    ) -> Unit,
)


/**
 * This function is similar to {@link randomBytes} but requires the first
 * argument to be a `Buffer` that will be filled. It also
 * requires that a callback is passed in.
 *
 * If the `callback` function is not provided, an error will be thrown.
 *
 * ```js
 * import { Buffer } from 'buffer';
 * const { randomFill } = await import('crypto');
 *
 * const buf = Buffer.alloc(10);
 * randomFill(buf, (err, buf) => {
 *   if (err) throw err;
 *   console.log(buf.toString('hex'));
 * });
 *
 * randomFill(buf, 5, (err, buf) => {
 *   if (err) throw err;
 *   console.log(buf.toString('hex'));
 * });
 *
 * // The above is equivalent to the following:
 * randomFill(buf, 5, 5, (err, buf) => {
 *   if (err) throw err;
 *   console.log(buf.toString('hex'));
 * });
 * ```
 *
 * Any `ArrayBuffer`, `TypedArray`, or `DataView` instance may be passed as`buffer`.
 *
 * While this includes instances of `Float32Array` and `Float64Array`, this
 * function should not be used to generate random floating-point numbers. The
 * result may contain `+Infinity`, `-Infinity`, and `NaN`, and even if the array
 * contains finite numbers only, they are not drawn from a uniform random
 * distribution and have no meaningful lower or upper bounds.
 *
 * ```js
 * import { Buffer } from 'buffer';
 * const { randomFill } = await import('crypto');
 *
 * const a = new Uint32Array(10);
 * randomFill(a, (err, buf) => {
 *   if (err) throw err;
 *   console.log(Buffer.from(buf.buffer, buf.byteOffset, buf.byteLength)
 *     .toString('hex'));
 * });
 *
 * const b = new DataView(new ArrayBuffer(10));
 * randomFill(b, (err, buf) => {
 *   if (err) throw err;
 *   console.log(Buffer.from(buf.buffer, buf.byteOffset, buf.byteLength)
 *     .toString('hex'));
 * });
 *
 * const c = new ArrayBuffer(10);
 * randomFill(c, (err, buf) => {
 *   if (err) throw err;
 *   console.log(Buffer.from(buf).toString('hex'));
 * });
 * ```
 *
 * This API uses libuv's threadpool, which can have surprising and
 * negative performance implications for some applications; see the `UV_THREADPOOL_SIZE` documentation for more information.
 *
 * The asynchronous version of `crypto.randomFill()` is carried out in a single
 * threadpool request. To minimize threadpool task length variation, partition
 * large `randomFill` requests when doing so as part of fulfilling a client
 * request.
 * @since v7.10.0, v6.13.0
 * @param buffer Must be supplied. The size of the provided `buffer` must not be larger than `2**31 - 1`.
 * @param [offset=0]
 * @param [size=buffer.length - offset]
 * @param callback `function(err, buf) {}`.
 */
external fun <T : ArrayBufferView> randomFill(
    buffer: T,
    offset: Number,
    callback: (
        error: Error?,
        buf: T,
    ) -> Unit,
)


/**
 * This function is similar to {@link randomBytes} but requires the first
 * argument to be a `Buffer` that will be filled. It also
 * requires that a callback is passed in.
 *
 * If the `callback` function is not provided, an error will be thrown.
 *
 * ```js
 * import { Buffer } from 'buffer';
 * const { randomFill } = await import('crypto');
 *
 * const buf = Buffer.alloc(10);
 * randomFill(buf, (err, buf) => {
 *   if (err) throw err;
 *   console.log(buf.toString('hex'));
 * });
 *
 * randomFill(buf, 5, (err, buf) => {
 *   if (err) throw err;
 *   console.log(buf.toString('hex'));
 * });
 *
 * // The above is equivalent to the following:
 * randomFill(buf, 5, 5, (err, buf) => {
 *   if (err) throw err;
 *   console.log(buf.toString('hex'));
 * });
 * ```
 *
 * Any `ArrayBuffer`, `TypedArray`, or `DataView` instance may be passed as`buffer`.
 *
 * While this includes instances of `Float32Array` and `Float64Array`, this
 * function should not be used to generate random floating-point numbers. The
 * result may contain `+Infinity`, `-Infinity`, and `NaN`, and even if the array
 * contains finite numbers only, they are not drawn from a uniform random
 * distribution and have no meaningful lower or upper bounds.
 *
 * ```js
 * import { Buffer } from 'buffer';
 * const { randomFill } = await import('crypto');
 *
 * const a = new Uint32Array(10);
 * randomFill(a, (err, buf) => {
 *   if (err) throw err;
 *   console.log(Buffer.from(buf.buffer, buf.byteOffset, buf.byteLength)
 *     .toString('hex'));
 * });
 *
 * const b = new DataView(new ArrayBuffer(10));
 * randomFill(b, (err, buf) => {
 *   if (err) throw err;
 *   console.log(Buffer.from(buf.buffer, buf.byteOffset, buf.byteLength)
 *     .toString('hex'));
 * });
 *
 * const c = new ArrayBuffer(10);
 * randomFill(c, (err, buf) => {
 *   if (err) throw err;
 *   console.log(Buffer.from(buf).toString('hex'));
 * });
 * ```
 *
 * This API uses libuv's threadpool, which can have surprising and
 * negative performance implications for some applications; see the `UV_THREADPOOL_SIZE` documentation for more information.
 *
 * The asynchronous version of `crypto.randomFill()` is carried out in a single
 * threadpool request. To minimize threadpool task length variation, partition
 * large `randomFill` requests when doing so as part of fulfilling a client
 * request.
 * @since v7.10.0, v6.13.0
 * @param buffer Must be supplied. The size of the provided `buffer` must not be larger than `2**31 - 1`.
 * @param [offset=0]
 * @param [size=buffer.length - offset]
 * @param callback `function(err, buf) {}`.
 */
external fun <T : ArrayBufferView> randomFill(
    buffer: T,
    offset: Number,
    size: Number,
    callback: (
        error: Error?,
        buf: T,
    ) -> Unit,
)
