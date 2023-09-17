package node.crypto


sealed external interface JsonWebKey {
    var crv: String?
    var d: String?
    var dp: String?
    var dq: String?
    var e: String?
    var k: String?
    var kty: String?
    var n: String?
    var p: String?
    var q: String?
    var qi: String?
    var x: String?
    var y: String?


    @Suppress(
        "DEPRECATION",
        "NATIVE_INDEXER_KEY_SHOULD_BE_STRING_OR_NUMBER",
    )
    @nativeGetter
    operator fun get(key: String): Any?


    @Suppress(
        "DEPRECATION",
        "NATIVE_INDEXER_KEY_SHOULD_BE_STRING_OR_NUMBER",
    )
    @nativeSetter
    operator fun set(key: String, value: Any?)


}
