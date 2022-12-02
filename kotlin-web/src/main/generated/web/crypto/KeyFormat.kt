// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.crypto

// language=JavaScript
@JsName("""(/*union*/{jwk: 'jwk', pkcs8: 'pkcs8', raw: 'raw', spki: 'spki'}/*union*/)""")
sealed external interface KeyFormat {
    object jwk : KeyFormat
    object pkcs8 : KeyFormat
    object raw : KeyFormat
    object spki : KeyFormat
}
