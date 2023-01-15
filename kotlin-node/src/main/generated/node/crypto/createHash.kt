// Automatically generated - do not modify!

@file:JsModule("node:crypto")

package node.crypto

/**
 * Creates and returns a `Hash` object that can be used to generate hash digests
 * using the given `algorithm`. Optional `options` argument controls stream
 * behavior. For XOF hash functions such as `'shake256'`, the `outputLength` option
 * can be used to specify the desired output length in bytes.
 *
 * The `algorithm` is dependent on the available algorithms supported by the
 * version of OpenSSL on the platform. Examples are `'sha256'`, `'sha512'`, etc.
 * On recent releases of OpenSSL, `openssl list -digest-algorithms` will
 * display the available digest algorithms.
 *
 * Example: generating the sha256 sum of a file
 *
 * ```js
 * import {
 *   createReadStream
 * } from 'fs';
 * import { argv } from 'process';
 * const {
 *   createHash
 * } = await import('crypto');
 *
 * const filename = argv[2];
 *
 * const hash = createHash('sha256');
 *
 * const input = createReadStream(filename);
 * input.on('readable', () => {
 *   // Only one element is going to be produced by the
 *   // hash stream.
 *   const data = input.read();
 *   if (data)
 *     hash.update(data);
 *   else {
 *     console.log(`${hash.digest('hex')} ${filename}`);
 *   }
 * });
 * ```
 * @since v0.1.92
 * @param options `stream.transform` options
 */
external fun createHash(
    algorithm: String,
    options: HashOptions = definedExternally,
): Hash
