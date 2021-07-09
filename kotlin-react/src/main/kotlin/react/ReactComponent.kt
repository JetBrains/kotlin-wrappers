package react

import kotlinext.js.*

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

// TODO: Should extend RComponentClassStatics, but has problems with generic params
external interface RClass<in P : RProps> : RComponentClassStatics<RProps, RState, RContext<Any>?>

external interface RClassModule<in P : RProps> {
    val default: RClass<P>
}

external interface RComponentClassStatics<P : RProps, S : RState, C : RContext<Any>?> {
    var displayName: String?

    var defaultProps: P?

    var contextType: C

    var getDerivedStateFromProps: ((P, S) -> S?)?

    var getDerivedStateFromError: ((Throwable) -> S?)?
}

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

    fun <T> RBuilder.children(value: T) {
        props.children(value)
    }

    abstract fun RBuilder.render()

    override fun render() = buildElements { render() }
}

abstract class RPureComponent<P : RProps, S : RState> : PureComponent<P, S> {
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

    fun <T> RBuilder.children(value: T) {
        props.children(value)
    }

    abstract fun RBuilder.render()

    override fun render() = buildElements { render() }
}
