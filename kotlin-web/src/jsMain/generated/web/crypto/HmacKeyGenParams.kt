// Automatically generated - do not modify!

package web.crypto

sealed external interface HmacKeyGenParams :
    Algorithm {
    var hash: HashAlgorithmIdentifier
    var length: Int?
}
