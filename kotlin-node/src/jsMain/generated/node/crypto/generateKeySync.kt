@file:JsModule("node:crypto")

package node.crypto


/**
 * Synchronously generates a new random secret key of the given `length`. The`type` will determine which validations will be performed on the `length`.
 *
 * ```js
 * const {
 *   generateKeySync
 * } = await import('crypto');
 *
 * const key = generateKeySync('hmac', { length: 64 });
 * console.log(key.export().toString('hex'));  // e89..........41e
 * ```
 * @since v15.0.0
 * @param type The intended use of the generated secret key. Currently accepted values are `'hmac'` and `'aes'`.
 */
external fun generateKeySync(type: GenerateKeySyncType, options: GenerateKeySyncOptions): KeyObject
