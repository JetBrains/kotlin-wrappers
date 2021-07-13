package react

external interface RErrorInfo

val RErrorInfo.componentStack: Any
    get() = asDynamic().componentStack
