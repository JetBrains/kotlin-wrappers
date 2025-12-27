// Automatically generated - do not modify!

package node.zlib

sealed external interface ZstdOptions {
    /**
     * @default constants.ZSTD_e_continue
     */
    var flush: Double?

    /**
     * @default constants.ZSTD_e_end
     */
    var finishFlush: Double?

    /**
     * @default 16 * 1024
     */
    var chunkSize: Double?

    /**
     * Key-value object containing indexed
     * [Zstd parameters](https://nodejs.org/docs/latest-v24.x/api/zlib.html#zstd-constants).
     */
    var params: (ZstdOptionsParams)?

    /**
     * Limits output size when using
     * [convenience methods](https://nodejs.org/docs/latest-v24.x/api/zlib.html#convenience-methods).
     * @default buffer.kMaxLength
     */
    var maxOutputLength: Double?

    /**
     * If `true`, returns an object with `buffer` and `engine`.
     */
    var info: Boolean?

    /**
     * Optional dictionary used to improve compression efficiency when compressing or decompressing data that
     * shares common patterns with the dictionary.
     * @since v24.6.0
     */
    var dictionary: js.buffer.ArrayBufferView<*>?
}
