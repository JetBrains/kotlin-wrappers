// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.crypto

// language=JavaScript
@JsName("""(/*union*/{pem: 'pem', der: 'der', jwk: 'jwk'}/*union*/)""")
sealed external interface KeyFormat {
    object pem : KeyFormat
    object der : KeyFormat
    object jwk : KeyFormat
}
