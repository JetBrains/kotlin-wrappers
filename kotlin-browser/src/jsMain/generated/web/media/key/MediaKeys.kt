// Automatically generated - do not modify!

package web.media.key

import js.buffer.BufferSource
import kotlin.js.Promise

sealed external class MediaKeys {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys/createSession) */
    fun createSession(sessionType: MediaKeySessionType = definedExternally): MediaKeySession

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys/setServerCertificate) */
    fun setServerCertificate(serverCertificate: BufferSource): Promise<Boolean>
}
