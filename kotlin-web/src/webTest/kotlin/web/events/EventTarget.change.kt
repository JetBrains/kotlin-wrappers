package web.events

val EventTarget.changeEvent: EventInstance<Event, EventTarget, EventTarget>
    get() = EventInstance(this, Event.CHANGE)
