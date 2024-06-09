// Automatically generated - do not modify!

package web.crypto

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface RsaKeyAlgorithm :
    KeyAlgorithm {
    var modulusLength: Int
    var publicExponent: BigInteger
}
