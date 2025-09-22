package example.eventflow

import web.events.CHANGE
import web.events.Event
import web.events.EventInstance
import web.events.EventTarget

val EventTarget.changeEvent: EventInstance<Event, EventTarget, EventTarget>
    get() = EventInstance(this, Event.CHANGE)
