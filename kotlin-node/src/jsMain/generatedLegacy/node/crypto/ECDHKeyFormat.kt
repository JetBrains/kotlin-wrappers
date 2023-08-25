// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.crypto

// language=JavaScript
@JsName("""(/*union*/{compressed: 'compressed', uncompressed: 'uncompressed', hybrid: 'hybrid'}/*union*/)""")
sealed external interface ECDHKeyFormat {
    companion object {
        val compressed: ECDHKeyFormat
        val uncompressed: ECDHKeyFormat
        val hybrid: ECDHKeyFormat
    }
}
