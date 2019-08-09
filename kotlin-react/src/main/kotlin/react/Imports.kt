@file:JsModule("react")

package react

import kotlin.js.*

// See https://reactjs.org/docs/react-component.html

external fun <P : RProps> createElement(type: Any, props: P, vararg child: Any?): ReactElement
external fun <P : RProps> cloneElement(element: ReactElement, props: P, vararg child: Any?): ReactElement
external fun cloneElement(element: dynamic, props: dynamic, vararg child: Any?): ReactElement
external fun isValidElement(element: Any): Boolean

external object Children {
    fun <T> map(children: Any?, handler: (Child) -> T): Array<out T>?
    fun <T> map(children: Any?, handler: (Child) -> T, context: Any?): Array<out T>?
    fun forEach(children: Any?, handler: (Child) -> Unit)
    fun forEach(children: Any?, handler: (Child) -> Unit, context: Any?)
    fun count(children: Any?): Int
    fun only(children: Any?): ReactElement
    fun toArray(children: Any?): Array<out Child>
}

abstract external class Component<P : RProps, S : RState>(
    props: RProps = definedExternally
) {
    open val props: P
    var state: S

    fun setState(partialState: S, callback: () -> Unit = definedExternally)
    fun setState(transformState: (S) -> S, callback: () -> Unit = definedExternally)

    fun forceUpdate(callback: () -> Unit = definedExternally)

    open fun componentWillMount(): Unit
    open fun UNSAFE_componentWillMount(): Unit

    open fun componentDidMount(): Unit

    open fun componentWillReceiveProps(nextProps: P): Unit
    open fun UNSAFE_componentWillReceiveProps(nextProps: P): Unit

    open fun shouldComponentUpdate(nextProps: P, nextState: S): Boolean

    open fun getSnapshotBeforeUpdate(prevProps: P, prevState: S): Any

    open fun componentWillUpdate(nextProps: P, nextState: S): Unit
    open fun UNSAFE_componentWillUpdate(nextProps: P, nextState: S): Unit

    open fun componentDidUpdate(prevProps: P, prevState: S, snapshot: Any): Unit

    open fun componentWillUnmount(): Unit

    open fun componentDidCatch(error: Throwable, info: RErrorInfo): Unit

    abstract fun render(): dynamic
}

abstract external class PureComponent<P : RProps, S : RState>(
    props: RProps = definedExternally
) : Component<P, S> {
    final override fun shouldComponentUpdate(nextProps: P, nextState: S): Boolean
}

// Fragment (16+)
external val Fragment: RClass<RProps>

// Context (16.3+)
external fun <T> createContext(defaultValue: T = definedExternally): RContext<T>

// Refs (16.3+)
external fun <T> createRef(): RReadableRef<T>

@JsName("forwardRef")
external fun <P : RProps> rawForwardRef(forward: (props: P, ref: RRef) -> Any): RClass<P>

// StrictMode (16.3+)
external val StrictMode: RClass<RProps>

// Memo (16.6+)
external val memo: HOC<*, *>

// Lazy (16.6+)
external fun <P : RProps> lazy(loadComponent: () -> Promise<RClass<P>>): RClass<P>

// Suspense (16.6+)
external interface SuspenseProps : RProps

external val Suspense: RClass<SuspenseProps>

// Profiler (16.9+)
external interface ProfilerProps : RProps {
    var id: String
    var onRender: (id: String, phase: String, actualDuration: Number, baseDuration: Number, startTime: Number, commitTime: Number, interactions: dynamic) -> Unit
}

external val Profiler : RClass<ProfilerProps>

// State Hook (16.8+)
@JsName("useState")
external fun <T> rawUseState(initValue: T): RDependenciesArray

// Reducer Hook (16.8+)
@JsName("useReducer")
external fun <S, A> rawUseReducer(reducer: RReducer<S, A>, initialState: S): RDependenciesArray

@JsName("useReducer")
external fun <S, A> rawUseReducer(reducer: RReducer<S, A>, initialState: S, initialAction: A): RDependenciesArray

// Effect Hook (16.8+)
@JsName("useEffect")
external fun rawUseEffect(effect: () -> dynamic, dependencies: RDependenciesArray)

@JsName("useEffect")
external fun rawUseEffect(effect: () -> dynamic)

// Layout Effect Hook (16.8+)
@JsName("useLayoutEffect")
external fun rawUseLayoutEffect(effect: () -> dynamic, dependencies: RDependenciesArray)

@JsName("useLayoutEffect")
external fun rawUseLayoutEffect(effect: () -> dynamic)

// Context Hook (16.8+)
external fun <T> useContext(context: RContext<T>): T

// Callback Hook (16.8+)
external fun useCallback(callback: () -> Unit, dependencies: RDependenciesArray): () -> Unit

// Memo Hook (16.8+)
external fun <T> useMemo(callback: () -> T, dependencies: RDependenciesArray): T

// Ref Hook (16.8+)
external interface RMutableRef<T> : RRef {
    var current: T
}

external fun <T> useRef(initialValue: T): RMutableRef<T>

// Imperative Methods Hook (16.8+)
external fun useImperativeHandle(ref: RRef, createInstance: () -> dynamic, inputs: RDependenciesArray): Unit

// Debug Value Hook (16.8+)
external fun useDebugValue(value: Any)

external fun <T> useDebugValue(value: T, format: (value: T) -> Any)
