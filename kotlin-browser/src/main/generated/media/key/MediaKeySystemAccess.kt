// Automatically generated - do not modify!

package media.key

import kotlin.js.Promise

sealed external class MediaKeySystemAccess {
    val keySystem: String
    fun createMediaKeys(): Promise<MediaKeys>
    fun getConfiguration(): MediaKeySystemConfiguration
}
