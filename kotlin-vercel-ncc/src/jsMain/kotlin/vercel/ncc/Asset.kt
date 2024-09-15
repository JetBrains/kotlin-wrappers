package vercel.ncc

import kotlinx.js.JsPlainObject
import node.buffer.Buffer

@JsPlainObject
external interface Asset {
    val source: Buffer
    val permissions: Int?
}
