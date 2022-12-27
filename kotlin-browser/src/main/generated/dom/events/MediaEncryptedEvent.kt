// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package dom.events

import js.buffer.ArrayBuffer
import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface MediaEncryptedEventInit : EventInit {
    var initData: ArrayBuffer?
    var initDataType: String?
}

open external class MediaEncryptedEvent(
    override val type: EventType<MediaEncryptedEvent>,
    init: MediaEncryptedEventInit = definedExternally,
) : Event {
    val initData: ArrayBuffer?
    val initDataType: String

    companion object
}
