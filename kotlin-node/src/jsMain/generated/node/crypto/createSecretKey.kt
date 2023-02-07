// Automatically generated - do not modify!

@file:JsModule("node:crypto")

package node.crypto

import js.buffer.ArrayBufferView

/**
 * Creates and returns a new key object containing a secret key for symmetric
 * encryption or `Hmac`.
 * @since v11.6.0
 * @param encoding The string encoding when `key` is a string.
 */
external fun createSecretKey(
    key: ArrayBufferView,
): KeyObject


/**
 * Creates and returns a new key object containing a secret key for symmetric
 * encryption or `Hmac`.
 * @since v11.6.0
 * @param encoding The string encoding when `key` is a string.
 */
external fun createSecretKey(
    key: String,
    encoding: node.buffer.BufferEncoding,
): KeyObject
