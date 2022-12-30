// Automatically generated - do not modify!

package web.media.key

import kotlin.js.Promise

sealed external class MediaKeySystemAccess {
    val keySystem: String
    fun createMediaKeys(): Promise<MediaKeys>
    fun getConfiguration(): MediaKeySystemConfiguration
}
