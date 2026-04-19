// Automatically generated - do not modify!

package node.zlib

@kotlinx.js.JsPlainObject
external interface BrotliOptions {
    /**
     * @default constants.BROTLI_OPERATION_PROCESS
     */
    var flush: Double?

    /**
     * @default constants.BROTLI_OPERATION_FINISH
     */
    var finishFlush: Double?

    /**
     * @default 16*1024
     */
    var chunkSize: Double?
    var params: (js.objects.ReadonlyRecord<Number, Any /* boolean | number */>)?

    /**
     * Limits output size when using [convenience methods](https://nodejs.org/docs/latest-v24.x/api/zlib.html#convenience-methods).
     * @default buffer.kMaxLength
     */
    var maxOutputLength: Double?

    /**
     * If `true`, returns an object with `buffer` and `engine`.
     */
    var info: Boolean?
}
