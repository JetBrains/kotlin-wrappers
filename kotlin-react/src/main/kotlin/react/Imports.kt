package react

// TODO replace with @file:JsModule once https://youtrack.jetbrains.com/issue/KT-17871 is fixed
@JsModule("react")
external object React {
    // See https://reactjs.org/docs/react-component.html

    fun <P : RProps> createElement(type: Any, props: P, vararg child: Any?): ReactElement
    fun <P : RProps> cloneElement(element: ReactElement, props: P, vararg child: Any?): ReactElement
    fun cloneElement(element: dynamic, props: dynamic, vararg child: Any?): ReactElement
    fun isValidElement(element: Any): Boolean

    object Children {
        fun <T> map(children: Any?, handler: (Child) -> T): Array<out T>?
        fun <T> map(children: Any?, handler: (Child) -> T, context: Any?): Array<out T>?
        fun forEach(children: Any?, handler: (Child) -> Unit)
        fun forEach(children: Any?, handler: (Child) -> Unit, context: Any?)
        fun count(children: Any?): Int
        fun only(children: Any?): ReactElement
        fun toArray(children: Any?): Array<out Child>
    }

    abstract class Component<P : RProps, S : RState>(
        props: RProps = definedExternally,
        context: RContext = definedExternally,
        updater: ReactUpdater = definedExternally
    ) {
        open val props: P
        var state: S
        val context: RContext

        fun setState(partialState: S, callback: () -> Unit = definedExternally)
        fun setState(transformState: (S) -> S, callback: () -> Unit = definedExternally)

        fun forceUpdate(callback: () -> Unit = definedExternally)

        open fun getChildContext(): RContext?

        open fun componentWillMount(): Unit
        open fun componentDidMount(): Unit

        open fun componentWillReceiveProps(nextProps: P): Unit

        open fun shouldComponentUpdate(nextProps: P, nextState: S): Boolean
        open fun componentWillUpdate(nextProps: P, nextState: S): Unit
        open fun componentDidUpdate(prevProps: P, prevState: S): Unit

        open fun componentWillUnmount(): Unit

        open fun componentDidCatch(error: String, info: RErrorInfo): Unit

        abstract fun render(): dynamic
    }

    abstract class PureComponent<P : RProps, S : RState>(
        props: RProps = definedExternally,
        context: RContext = definedExternally,
        updater: ReactUpdater = definedExternally
    ) : Component<P, S> {
        final override fun shouldComponentUpdate(nextProps: P, nextState: S): Boolean
    }

    val Fragment: RClass<RProps>?
}
