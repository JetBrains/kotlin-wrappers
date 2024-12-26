package vercel.ncc

import js.objects.JsPlainObject
import node.buffer.Buffer

@JsPlainObject
external interface Asset {
    val source: Buffer<*>
    val permissions: Int?
}
