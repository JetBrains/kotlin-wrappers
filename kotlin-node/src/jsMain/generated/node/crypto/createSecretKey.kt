@file:JsModule("node:crypto")

package node.crypto

import node.buffer.BufferEncoding

/**
 * Creates and returns a new key object containing a secret key for symmetric
 * encryption or `Hmac`.
 * @since v11.6.0
 * @param encoding The string encoding when `key` is a string.
 */
external fun createSecretKey(key: js.buffer.ArrayBufferView): KeyObject

external fun createSecretKey(key: String, encoding: BufferEncoding): KeyObject
