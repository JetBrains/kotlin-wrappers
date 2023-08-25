// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.crypto

// language=JavaScript
@JsName("""(/*union*/{cbc: 'cbc', ccm: 'ccm', cfb: 'cfb', ctr: 'ctr', ecb: 'ecb', gcm: 'gcm', ocb: 'ocb', ofb: 'ofb', stream: 'stream', wrap: 'wrap', xts: 'xts'}/*union*/)""")
sealed external interface CipherMode {
    companion object {
        val cbc: CipherMode
        val ccm: CipherMode
        val cfb: CipherMode
        val ctr: CipherMode
        val ecb: CipherMode
        val gcm: CipherMode
        val ocb: CipherMode
        val ofb: CipherMode
        val stream: CipherMode
        val wrap: CipherMode
        val xts: CipherMode
    }
}
