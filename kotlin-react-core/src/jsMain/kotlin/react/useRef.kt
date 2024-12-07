@file:JsModule("react")

package react

// Ref Hook (16.8+)
external fun <T : Any> useRef(
    initialValue: T? = definedExternally,
): MutableRefObject<T>
