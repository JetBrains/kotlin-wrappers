// Automatically generated - do not modify!

package remoteplayback

import kotlinx.js.Void
import web.events.EventTarget
import kotlin.js.Promise

sealed external class RemotePlayback :
    EventTarget {
    val state: RemotePlaybackState
    fun cancelWatchAvailability(id: Number = definedExternally): Promise<Void>
    fun prompt(): Promise<Void>
    fun watchAvailability(callback: RemotePlaybackAvailabilityCallback): Promise<Number>
}
