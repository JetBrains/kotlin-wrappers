@file:JsModule("react")
@file:JsNonModule

package react

@JsName("forwardRef")
external fun <T : Any, P : PropsWithRef<T>> rawForwardRef(
    forward: (props: P, ref: Ref<T>) -> ReactElement?,
): ComponentType<P>

// Effect Hook (16.8+)
@JsName("useEffect")
external fun rawUseEffect(
    effect: () -> Cleanup?,
    dependencies: Dependencies = definedExternally,
)

// Layout Effect Hook (16.8+)
@JsName("useLayoutEffect")
external fun rawUseLayoutEffect(
    effect: () -> Cleanup?,
    dependencies: Dependencies = definedExternally,
)

// Insertion Effect Hook (18.0+)
@JsName("useInsertionEffect")
external fun rawUseInsertionEffect(
    effect: () -> Cleanup?,
    dependencies: Dependencies = definedExternally,
)

// Callback Hook (16.8+)
@JsName("useCallback")
external fun <T : Function<*>> rawUseCallback(
    callback: T,
    dependencies: Dependencies,
): T

// Memo Hook (16.8+)
@JsName("useMemo")
external fun <T> rawUseMemo(
    callback: () -> T,
    dependencies: Dependencies,
): T

// Imperative Handle Hook (16.8+)
@JsName("useImperativeHandle")
external fun <T : Any> rawUseImperativeHandle(
    ref: Ref<T>?,
    init: () -> T?,
    dependencies: Dependencies,
)
