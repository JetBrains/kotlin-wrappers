// Automatically generated - do not modify!

package web.crypto

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface HmacImportParams :
    Algorithm {
    var hash: HashAlgorithmIdentifier
    var length: Int?
}
