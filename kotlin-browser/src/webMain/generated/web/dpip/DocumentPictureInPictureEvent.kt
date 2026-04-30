// Automatically generated - do not modify!

package web.dpip

import web.events.Event
import web.events.EventType
import web.window.Window

/**
 * The **`DocumentPictureInPictureEvent`** interface of the Document Picture-in-Picture API is the event object for the enter event, which fires when the Picture-in-Picture window is opened.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentPictureInPictureEvent)
 */
open external class DocumentPictureInPictureEvent(
    override val type: EventType<DocumentPictureInPictureEvent>,
    init: DocumentPictureInPictureEventInit,
) : Event {
    /**
     * The **`window`** read-only property of the DocumentPictureInPictureEvent interface returns a Window instance representing the browsing context inside the DocumentPictureInPicture window the event was fired on.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentPictureInPictureEvent/window)
     */
    val window: Window

    companion object
}

inline val DocumentPictureInPictureEvent.Companion.ENTER: EventType<DocumentPictureInPictureEvent>
    get() = EventType("enter")
