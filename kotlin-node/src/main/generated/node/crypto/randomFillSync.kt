// Automatically generated - do not modify!

@file:JsModule("node:crypto")

package node.crypto

import js.buffer.ArrayBufferView

/**
 * Synchronous version of {@link randomFill}.
 *
 * ```js
 * import { Buffer } from 'buffer';
 * const { randomFillSync } = await import('crypto');
 *
 * const buf = Buffer.alloc(10);
 * console.log(randomFillSync(buf).toString('hex'));
 *
 * randomFillSync(buf, 5);
 * console.log(buf.toString('hex'));
 *
 * // The above is equivalent to the following:
 * randomFillSync(buf, 5, 5);
 * console.log(buf.toString('hex'));
 * ```
 *
 * Any `ArrayBuffer`, `TypedArray` or `DataView` instance may be passed as`buffer`.
 *
 * ```js
 * import { Buffer } from 'buffer';
 * const { randomFillSync } = await import('crypto');
 *
 * const a = new Uint32Array(10);
 * console.log(Buffer.from(randomFillSync(a).buffer,
 *                         a.byteOffset, a.byteLength).toString('hex'));
 *
 * const b = new DataView(new ArrayBuffer(10));
 * console.log(Buffer.from(randomFillSync(b).buffer,
 *                         b.byteOffset, b.byteLength).toString('hex'));
 *
 * const c = new ArrayBuffer(10);
 * console.log(Buffer.from(randomFillSync(c)).toString('hex'));
 * ```
 * @since v7.10.0, v6.13.0
 * @param buffer Must be supplied. The size of the provided `buffer` must not be larger than `2**31 - 1`.
 * @param [offset=0]
 * @param [size=buffer.length - offset]
 * @return The object passed as `buffer` argument.
 */
external fun <T : ArrayBufferView> randomFillSync(
    buffer: T,
    offset: Number = definedExternally,
    size: Number = definedExternally,
): T
