package react

import kotlinext.js.*

// Props
external interface RProps

val RProps.children: Any get() = asDynamic().children
var RProps.key: String
    get() = error("key cannot be read from props")
    set(value) {
        asDynamic().key = value
    }
var RProps.ref: (dynamic) -> Unit
    get() = error("ref cannot be read from props")
    set(value) {
        asDynamic().ref = value
    }

// State
external interface RState

class BoxedState<T>(var state: T) : RState

// Context
external interface RContext

// Error info
external interface RErrorInfo

val RErrorInfo.componentStack: Any get() = asDynamic().componentStack

external interface RClass<in P : RProps> {
    var displayName: String?
}

external interface ReactUpdater {
    fun enqueueSetState(dest: Any, state: Any?)
    fun enqueueReplaceState(dest: Any, state: Any?)
    fun enqueueCallback(dest: Any, callback: Any, method: String)
}

fun <S : RState> Component<*, S>.setState(buildState: S.() -> Unit) =
    setState({ assign(it, buildState) })

inline fun <P : RProps> rFunction(
    displayName: String,
    crossinline render: RBuilder.(P) -> Unit
): RClass<P> {
    val fn = { props: P -> buildElements { render(props) } } as RClass<P>
    fn.displayName = displayName
    return fn
}

abstract class RComponent<P : RProps, S : RState> : Component<P, S> {
    constructor() : super() {
        state = jsObject { init() }
    }

    constructor(props: P) : super(props) {
        state = jsObject { init(props) }
    }

    open fun S.init() {}
    // if you use this method, don't forget to pass props to the constructor first
    open fun S.init(props: P) {}

    fun RBuilder.children() {
        props.children()
    }

    abstract fun RBuilder.render()

    override fun render() = buildElements { render() }
}
