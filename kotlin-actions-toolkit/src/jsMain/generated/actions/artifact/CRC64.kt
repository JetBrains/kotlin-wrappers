// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.core.BigInt
import node.buffer.Buffer

external class CRC64 {
    constructor()

    fun update(data: Buffer)

    fun update(data: String)
    fun digest(encoding: CRC64DigestEncoding = definedExternally): Any /* String | Buffer */

    companion object {
        fun flip64Bits(n: BigInt): BigInt
    }
}
