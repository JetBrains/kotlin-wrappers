// Automatically generated - do not modify!

package web.media.key

import kotlin.js.Promise

sealed external class MediaKeySystemAccess {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/keySystem) */
    val keySystem: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/createMediaKeys) */
    fun createMediaKeys(): Promise<MediaKeys>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/getConfiguration) */
    fun getConfiguration(): MediaKeySystemConfiguration
}
