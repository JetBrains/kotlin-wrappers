package react

import kotlinext.js.assign

// Props
external interface RProps

val RProps.children: Any
    get() = asDynamic().children

var RProps.key: String
    @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        asDynamic().key = value
    }

var RProps.ref: RRef
    @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) {
        asDynamic().ref = value
    }

fun <T> RProps.ref(ref: (T?) -> Unit) {
    asDynamic().ref = ref
}

// State
external interface RState

class BoxedState<T>(var state: T) : RState

// Error info
external interface RErrorInfo

val RErrorInfo.componentStack: Any
    get() = asDynamic().componentStack

external interface RProviderProps<T> : RProps {
    var value: T
}

external interface RProvider<T> : RClass<RProviderProps<T>>

external interface RConsumerProps<T> : RProps {
    var children: (T) -> Any
}

external interface RConsumer<T> : RClass<RConsumerProps<T>>

// Context (16.3+)
external interface RContext<T> {
    val Provider: RProvider<T>
    val Consumer: RConsumer<T>
}

// Refs (16.3+)
external interface RRef

external interface RReadableRef<out T : Any> : RRef {
    val current: T?
}

fun <S : RState> Component<*, S>.setState(buildState: S.() -> Unit) =
    setState({ assign(it, buildState) })

