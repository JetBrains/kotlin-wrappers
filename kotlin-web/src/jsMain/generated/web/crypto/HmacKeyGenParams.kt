// Automatically generated - do not modify!

package web.crypto

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface HmacKeyGenParams :
    Algorithm {
    var hash: HashAlgorithmIdentifier
    var length: Int?
}
