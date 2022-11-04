// Automatically generated - do not modify!

package media

import kotlinx.js.ArrayBuffer
import web.events.Event
import web.events.EventInit

external interface MediaEncryptedEventInit : EventInit {
    var initData: ArrayBuffer?
    var initDataType: String?
}

open external class MediaEncryptedEvent(
    type: String,
    init: MediaEncryptedEventInit = definedExternally,
) : Event {
    val initData: ArrayBuffer?
    val initDataType: String

    companion object
}
