// Automatically generated - do not modify!

package web.media.key

import js.buffer.BufferSource
import js.core.EpochTimeStamp
import js.core.Void
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.Promise

sealed external class MediaKeySession :
    EventTarget {
    val closed: Promise<MediaKeySessionClosedReason>
    val expiration: EpochTimeStamp
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
