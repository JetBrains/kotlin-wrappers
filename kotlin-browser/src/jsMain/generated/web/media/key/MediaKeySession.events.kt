// Automatically generated - do not modify!

package web.media.key

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/keystatuseschange_event)
 */
inline val <C : MediaKeySession> C.keyStatusesChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.KEY_STATUSES_CHANGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/message_event)
 */
inline val <C : MediaKeySession> C.messageEvent: EventInstance<MediaKeyMessageEvent, C, C>
    get() = EventInstance(this, MediaKeyMessageEvent.MESSAGE)
