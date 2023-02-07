@file:JsModule("react")
@file:JsNonModule

package react

external fun <T : Any> createRef(): RefObject<T>

// Ref Hook (16.8+)
external fun <T : Any> useRef(
    initialValue: T? = definedExternally,
): MutableRefObject<T>
