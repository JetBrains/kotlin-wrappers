@file:JsModule("react")

package react

import js.array.ReadonlyArray

@JsName("forwardRef")
external fun <T : Any, P : PropsWithRef<T>> rawForwardRef(
    render: (props: P, forwardedRef: Ref<T>?) -> ReactElement<*>?,
): ForwardRefExoticComponent<P>

// Effect Hook (16.8+)
@JsName("useEffect")
external fun rawUseEffect(
    effect: () -> Cleanup?,
    dependencies: ReadonlyArray<Any?> = definedExternally,
)

// Layout Effect Hook (16.8+)
@JsName("useLayoutEffect")
external fun rawUseLayoutEffect(
    effect: () -> Cleanup?,
    dependencies: ReadonlyArray<Any?> = definedExternally,
)

// Insertion Effect Hook (18.0+)
@JsName("useInsertionEffect")
external fun rawUseInsertionEffect(
    effect: () -> Cleanup?,
    dependencies: ReadonlyArray<Any?> = definedExternally,
)

// Callback Hook (16.8+)
@JsName("useCallback")
external fun <T : Function<*>> rawUseCallback(
    callback: T,
    dependencies: ReadonlyArray<Any?>,
): T

// Memo Hook (16.8+)
@JsName("useMemo")
external fun <T> rawUseMemo(
    callback: () -> T,
    dependencies: ReadonlyArray<Any?>,
): T

// Imperative Handle Hook (16.8+)
@JsName("useImperativeHandle")
external fun <T : Any> rawUseImperativeHandle(
    ref: Ref<T>?,
    init: () -> T?,
    dependencies: ReadonlyArray<Any?>,
)
