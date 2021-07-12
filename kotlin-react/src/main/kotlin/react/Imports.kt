@file:JsModule("react")
@file:JsNonModule

package react

// See https://reactjs.org/docs/react-component.html

external fun <P : RProps> createElement(type: String, props: P, vararg child: Any?): ReactElement
external fun <P : RProps> createElement(type: ComponentType<P>, props: P, vararg child: Any?): ReactElement

external fun <P : RProps> cloneElement(element: ReactElement, props: P, vararg child: Any?): ReactElement
external fun cloneElement(element: dynamic, props: dynamic, vararg child: Any?): ReactElement

external fun isValidElement(element: Any): Boolean

@JsName("forwardRef")
external fun <P : RProps> rawForwardRef(forward: (props: P, ref: RRef) -> Any): RClass<P>

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
