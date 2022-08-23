// Automatically generated - do not modify!

@file:JsModule("node:crypto")
@file:JsNonModule

package node.crypto

import org.khronos.webgl.ArrayBufferView

/**
 * This function is based on a constant-time algorithm.
 * Returns true if `a` is equal to `b`, without leaking timing information that
 * would allow an attacker to guess one of the values. This is suitable for
 * comparing HMAC digests or secret values like authentication cookies or [capability urls](https://www.w3.org/TR/capability-urls/).
 *
 * `a` and `b` must both be `Buffer`s, `TypedArray`s, or `DataView`s, and they
 * must have the same byte length. An error is thrown if `a` and `b` have
 * different byte lengths.
 *
 * If at least one of `a` and `b` is a `TypedArray` with more than one byte per
 * entry, such as `Uint16Array`, the result will be computed using the platform
 * byte order.
 *
 * Use of `crypto.timingSafeEqual` does not guarantee that the _surrounding_ code
 * is timing-safe. Care should be taken to ensure that the surrounding code does
 * not introduce timing vulnerabilities.
 * @since v6.6.0
 */
external fun timingSafeEqual(
    a: ArrayBufferView,
    b: ArrayBufferView,
): Boolean
