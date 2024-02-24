package electron.core

inline val GlobalEvent.returnValue: Any?
    get() = asDynamic().returnValue

inline fun GlobalEvent.asEvent(): web.events.Event<*> = asDynamic()
