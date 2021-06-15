@file:JsModule("react")
@file:JsNonModule

package react

import kotlin.js.Promise

// See https://reactjs.org/docs/react-component.html

external fun <P : RProps> createElement(type: Any, props: P, vararg child: Any?): ReactElement
external fun <P : RProps> cloneElement(element: ReactElement, props: P, vararg child: Any?): ReactElement
external fun cloneElement(element: dynamic, props: dynamic, vararg child: Any?): ReactElement
external fun isValidElement(element: Any): Boolean

external object Children {
    fun <T> map(children: Any?, handler: (Child) -> T): Array<out T>?
    fun forEach(children: Any?, handler: (Child) -> Unit)
    fun count(children: Any?): Int
    fun only(children: Any?): ReactElement
    fun toArray(children: Any?): Array<out Child>
}

abstract external class Component<P : RProps, S : RState>(
    props: P = definedExternally
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

    open fun componentDidCatch(error: Throwable, info: RErrorInfo)

    abstract fun render(): dynamic
}

abstract external class PureComponent<P : RProps, S : RState>(
    props: P = definedExternally
) : Component<P, S> {
    final override fun shouldComponentUpdate(nextProps: P, nextState: S): Boolean
}

// Fragment (16+)
external val Fragment: RClass<RProps>

// Context (16.3+)
external fun <T> createContext(defaultValue: T = definedExternally): RContext<T>

// Refs (16.3+)
external fun <T : Any> createRef(): RReadableRef<T>

@JsName("forwardRef")
external fun <P : RProps> rawForwardRef(forward: (props: P, ref: RRef) -> Any): RClass<P>

// StrictMode (16.3+)
external val StrictMode: RClass<RProps>

// Memo (16.6+)
external fun <P : RProps> memo(fc: FunctionalComponent<P>): FunctionalComponent<P>

external fun <P : RProps> memo(fc: FunctionalComponent<P>, areEqual: (P, P) -> Boolean): FunctionalComponent<P>

// Lazy (16.6+)
external fun <P : RProps> lazy(
    factory: () -> Promise<RClassModule<P>>
): RClass<P>

// Suspense (16.6+)
external interface SuspenseProps : RProps

external val Suspense: RClass<SuspenseProps>

// Profiler (16.9+)
external interface ProfilerProps : RProps {
    var id: String
    var onRender: (
        id: String,
        phase: String,
        actualDuration: Number,
        baseDuration: Number,
        startTime: Number,
        commitTime: Number,
        interactions: dynamic,
    ) -> Unit
}

external val Profiler: RClass<ProfilerProps>

// State Hook (16.8+)
external fun <T : Any> useState(): StateInstance<T?>

external fun <T> useState(
    initialValue: T,
): StateInstance<T>

external fun <T> useState(
    initializer: () -> T,
): StateInstance<T>

// Reducer Hook (16.8+)
external fun <S, A, I> useReducer(
    reducer: RReducer<S, A>,
    initializerArg: I,
    initializer: (I) -> S,
): ReducerInstance<S, A>

external fun <S, A> useReducer(
    reducer: RReducer<S, A>,
    initialState: S,
): ReducerInstance<S, A>

external fun <S : Any, A> useReducer(
    reducer: RReducer<S?, A>,
): ReducerInstance<S?, A>

// Effect Hook (16.8+)
@JsName("useEffect")
external fun rawUseEffect(
    effect: () -> dynamic,
    dependencies: RDependenciesArray = definedExternally,
)

// Layout Effect Hook (16.8+)
@JsName("useLayoutEffect")
external fun rawUseLayoutEffect(
    effect: () -> dynamic,
    dependencies: RDependenciesArray = definedExternally,
)

// Context Hook (16.8+)
external fun <T> useContext(context: RContext<T>): T

// Callback Hook (16.8+)
@JsName("useCallback")
external fun <T : Function<*>> rawUseCallback(
    callback: T,
    dependencies: RDependenciesArray,
): T

// Memo Hook (16.8+)
@JsName("useMemo")
external fun <T> rawUseMemo(
    callback: () -> T,
    dependencies: RDependenciesArray,
): T

// Ref Hook (16.8+)
external interface RMutableRef<T : Any> : RReadableRef<T> {
    override var current: T?
}

external fun <T : Any> useRef(initialValue: T? = definedExternally): RMutableRef<T>

// Imperative Methods Hook (16.8+)
external fun useImperativeHandle(ref: RRef, createInstance: () -> dynamic, inputs: RDependenciesArray)

// Debug Value Hook (16.8+)
external fun <T : Any> useDebugValue(
    value: T,
    format: (value: T) -> Any = definedExternally,
)

// Transitions (18.0+)
external fun startTransition(scope: TransitionFunction)

external fun useTransition(
    config: SuspenseConfig = definedExternally,
): TransitionInstance
