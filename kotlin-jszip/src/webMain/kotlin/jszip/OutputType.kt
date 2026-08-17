package jszip

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.numbers.JsUByte
import js.reflect.unsafeCast
import js.typedarrays.Uint8Array
import js.union.JsUnion
import web.blob.Blob

@JsUnion
sealed /* union */
external interface OutputType<T : JsAny>

inline val OutputType.Companion.base64: OutputType<JsString>
    get() = unsafeCast("base64")

inline val OutputType.Companion.text: OutputType<JsString>
    get() = unsafeCast("text")

inline val OutputType.Companion.binarystring: OutputType<JsString>
    get() = unsafeCast("binarystring")

inline val OutputType.Companion.array: OutputType<ReadonlyArray<JsUByte>>
    get() = unsafeCast("array")

inline val OutputType.Companion.uint8array: OutputType<Uint8Array<ArrayBuffer>>
    get() = unsafeCast("uint8array")

inline val OutputType.Companion.arraybuffer: OutputType<ArrayBuffer>
    get() = unsafeCast("arraybuffer")

inline val OutputType.Companion.blob: OutputType<Blob>
    get() = unsafeCast("blob")
