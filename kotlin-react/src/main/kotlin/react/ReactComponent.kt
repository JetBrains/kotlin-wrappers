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

fun <S : RState> Component<*, S>.setState(buildState: S.() -> Unit) =
    setState({ assign(it, buildState) })

