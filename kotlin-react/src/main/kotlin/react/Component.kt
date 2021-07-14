@file:JsModule("react")
@file:JsNonModule

package react

abstract external class Component<P : RProps, S : RState>(
    props: P = definedExternally,
) {
    val props: P
    var state: S

    fun setState(partialState: S, callback: () -> Unit = definedExternally)
    fun setState(transformState: (S) -> S, callback: () -> Unit = definedExternally)

    fun forceUpdate(callback: () -> Unit = definedExternally)

    open fun componentWillMount()
    open fun UNSAFE_componentWillMount()

    open fun componentDidMount()

    open fun componentWillReceiveProps(nextProps: P)
    open fun UNSAFE_componentWillReceiveProps(nextProps: P)

    open fun shouldComponentUpdate(nextProps: P, nextState: S): Boolean

    open fun getSnapshotBeforeUpdate(prevProps: P, prevState: S): Any

    open fun componentWillUpdate(nextProps: P, nextState: S)
    open fun UNSAFE_componentWillUpdate(nextProps: P, nextState: S)

    open fun componentDidUpdate(prevProps: P, prevState: S, snapshot: Any)

    open fun componentWillUnmount()

    open fun componentDidCatch(error: Throwable, info: ErrorInfo)

    abstract fun render(): dynamic
}

external interface ErrorInfo {
    val componentStack: String
}