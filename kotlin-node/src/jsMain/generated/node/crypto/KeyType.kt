// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.crypto

// language=JavaScript
@JsName("""(/*union*/{rsa: 'rsa', rsaPss: 'rsa-pss', dsa: 'dsa', ec: 'ec', ed25519: 'ed25519', ed448: 'ed448', x25519: 'x25519', x448: 'x448'}/*union*/)""")
sealed external interface KeyType {
    object rsa : KeyType
    object rsaPss : KeyType
    object dsa : KeyType
    object ec : KeyType
    object ed25519 : KeyType
    object ed448 : KeyType
    object x25519 : KeyType
    object x448 : KeyType
}
