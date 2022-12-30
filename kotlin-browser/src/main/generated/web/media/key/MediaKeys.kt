// Automatically generated - do not modify!

package web.media.key

import js.buffer.BufferSource
import kotlin.js.Promise

sealed external class MediaKeys {
    fun createSession(sessionType: MediaKeySessionType = definedExternally): MediaKeySession
    fun setServerCertificate(serverCertificate: BufferSource): Promise<Boolean>
}
