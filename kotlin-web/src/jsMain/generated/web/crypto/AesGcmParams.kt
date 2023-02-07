// Automatically generated - do not modify!

package web.crypto

import js.buffer.BufferSource

sealed external interface AesGcmParams :
    Algorithm {
    var additionalData: BufferSource?
    var iv: BufferSource
    var tagLength: Int?
}
