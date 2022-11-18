// Automatically generated - do not modify!

package media.key

import kotlinx.js.BufferSource
import kotlinx.js.Void
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.Promise

sealed external class MediaKeySession :
    EventTarget {
    val closed: Promise<MediaKeySessionClosedReason>
    val expiration: Number
    val keyStatuses: MediaKeyStatusMap
    var onkeystatuseschange: EventHandler<Event>?
    var onmessage: EventHandler<MediaKeyMessageEvent>?
    val sessionId: String
    fun close(): Promise<Void>
    fun generateRequest(
        initDataType: String,
        initData: BufferSource,
    ): Promise<Void>

    fun load(sessionId: String): Promise<Boolean>
    fun remove(): Promise<Void>
    fun update(response: BufferSource): Promise<Void>
}
