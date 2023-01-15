// Automatically generated - do not modify!

@file:JsModule("node:crypto")

package node.crypto

/**
 * Return a random integer `n` such that `min <= n < max`.  This
 * implementation avoids [modulo bias](https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle#Modulo_bias).
 *
 * The range (`max - min`) must be less than 2^48. `min` and `max` must
 * be [safe integers](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isSafeInteger).
 *
 * If the `callback` function is not provided, the random integer is
 * generated synchronously.
 *
 * ```js
 * // Asynchronous
 * const {
 *   randomInt
 * } = await import('crypto');
 *
 * randomInt(3, (err, n) => {
 *   if (err) throw err;
 *   console.log(`Random number chosen from (0, 1, 2): ${n}`);
 * });
 * ```
 *
 * ```js
 * // Synchronous
 * const {
 *   randomInt
 * } = await import('crypto');
 *
 * const n = randomInt(3);
 * console.log(`Random number chosen from (0, 1, 2): ${n}`);
 * ```
 *
 * ```js
 * // With `min` argument
 * const {
 *   randomInt
 * } = await import('crypto');
 *
 * const n = randomInt(1, 7);
 * console.log(`The dice rolled: ${n}`);
 * ```
 * @since v14.10.0, v12.19.0
 * @param [min=0] Start of random range (inclusive).
 * @param max End of random range (exclusive).
 * @param callback `function(err, n) {}`.
 */
external fun randomInt(
    max: Number,
): Number


/**
 * Return a random integer `n` such that `min <= n < max`.  This
 * implementation avoids [modulo bias](https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle#Modulo_bias).
 *
 * The range (`max - min`) must be less than 2^48. `min` and `max` must
 * be [safe integers](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isSafeInteger).
 *
 * If the `callback` function is not provided, the random integer is
 * generated synchronously.
 *
 * ```js
 * // Asynchronous
 * const {
 *   randomInt
 * } = await import('crypto');
 *
 * randomInt(3, (err, n) => {
 *   if (err) throw err;
 *   console.log(`Random number chosen from (0, 1, 2): ${n}`);
 * });
 * ```
 *
 * ```js
 * // Synchronous
 * const {
 *   randomInt
 * } = await import('crypto');
 *
 * const n = randomInt(3);
 * console.log(`Random number chosen from (0, 1, 2): ${n}`);
 * ```
 *
 * ```js
 * // With `min` argument
 * const {
 *   randomInt
 * } = await import('crypto');
 *
 * const n = randomInt(1, 7);
 * console.log(`The dice rolled: ${n}`);
 * ```
 * @since v14.10.0, v12.19.0
 * @param [min=0] Start of random range (inclusive).
 * @param max End of random range (exclusive).
 * @param callback `function(err, n) {}`.
 */
external fun randomInt(
    min: Number,
    max: Number,
): Number


/**
 * Return a random integer `n` such that `min <= n < max`.  This
 * implementation avoids [modulo bias](https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle#Modulo_bias).
 *
 * The range (`max - min`) must be less than 2^48. `min` and `max` must
 * be [safe integers](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isSafeInteger).
 *
 * If the `callback` function is not provided, the random integer is
 * generated synchronously.
 *
 * ```js
 * // Asynchronous
 * const {
 *   randomInt
 * } = await import('crypto');
 *
 * randomInt(3, (err, n) => {
 *   if (err) throw err;
 *   console.log(`Random number chosen from (0, 1, 2): ${n}`);
 * });
 * ```
 *
 * ```js
 * // Synchronous
 * const {
 *   randomInt
 * } = await import('crypto');
 *
 * const n = randomInt(3);
 * console.log(`Random number chosen from (0, 1, 2): ${n}`);
 * ```
 *
 * ```js
 * // With `min` argument
 * const {
 *   randomInt
 * } = await import('crypto');
 *
 * const n = randomInt(1, 7);
 * console.log(`The dice rolled: ${n}`);
 * ```
 * @since v14.10.0, v12.19.0
 * @param [min=0] Start of random range (inclusive).
 * @param max End of random range (exclusive).
 * @param callback `function(err, n) {}`.
 */
external fun randomInt(
    max: Number,
    callback: (
        error: Error?,
        value: Number,
    ) -> Unit,
)


/**
 * Return a random integer `n` such that `min <= n < max`.  This
 * implementation avoids [modulo bias](https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle#Modulo_bias).
 *
 * The range (`max - min`) must be less than 2^48. `min` and `max` must
 * be [safe integers](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isSafeInteger).
 *
 * If the `callback` function is not provided, the random integer is
 * generated synchronously.
 *
 * ```js
 * // Asynchronous
 * const {
 *   randomInt
 * } = await import('crypto');
 *
 * randomInt(3, (err, n) => {
 *   if (err) throw err;
 *   console.log(`Random number chosen from (0, 1, 2): ${n}`);
 * });
 * ```
 *
 * ```js
 * // Synchronous
 * const {
 *   randomInt
 * } = await import('crypto');
 *
 * const n = randomInt(3);
 * console.log(`Random number chosen from (0, 1, 2): ${n}`);
 * ```
 *
 * ```js
 * // With `min` argument
 * const {
 *   randomInt
 * } = await import('crypto');
 *
 * const n = randomInt(1, 7);
 * console.log(`The dice rolled: ${n}`);
 * ```
 * @since v14.10.0, v12.19.0
 * @param [min=0] Start of random range (inclusive).
 * @param max End of random range (exclusive).
 * @param callback `function(err, n) {}`.
 */
external fun randomInt(
    min: Number,
    max: Number,
    callback: (
        error: Error?,
        value: Number,
    ) -> Unit,
)
