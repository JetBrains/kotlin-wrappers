package electron.core

inline val GlobalEvent.returnValue: Any?
    get() = asDynamic().returnValue
