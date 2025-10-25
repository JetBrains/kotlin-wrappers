package web.dpip

import web.events.Event
import web.events.EventType
import web.experimental.ExperimentalWebApi
import web.window.Window
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentPictureInPictureEvent)
 */
@ExperimentalWebApi
open external class DocumentPictureInPictureEvent(
    override val type: EventType<DocumentPictureInPictureEvent>,
    init: DocumentPictureInPictureEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentPictureInPictureEvent/data)
     */
    val window: Window
}
