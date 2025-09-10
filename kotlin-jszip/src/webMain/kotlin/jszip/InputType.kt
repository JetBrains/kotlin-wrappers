@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package jszip

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.core.JsString
import js.core.JsUByte
import js.reflect.unsafeCast
import js.typedarrays.Uint8Array
import web.blob.Blob
import kotlin.js.JsAny

sealed external interface InputType<T : JsAny> {
    companion object
}

inline val InputType.Companion.base64: InputType<JsString>
    get() = unsafeCast("base64")

inline val InputType.Companion.string: InputType<JsString>
    get() = unsafeCast("string")

inline val InputType.Companion.text: InputType<JsString>
    get() = unsafeCast("text")

inline val InputType.Companion.binarystring: InputType<JsString>
    get() = unsafeCast("binarystring")

inline val InputType.Companion.array: InputType<ReadonlyArray<JsUByte>>
    get() = unsafeCast("array")

inline val InputType.Companion.uint8array: InputType<Uint8Array<*>>
    get() = unsafeCast("uint8array")

inline val InputType.Companion.arraybuffer: InputType<ArrayBuffer>
    get() = unsafeCast("arraybuffer")

inline val InputType.Companion.blob: InputType<Blob>
    get() = unsafeCast("blob")
