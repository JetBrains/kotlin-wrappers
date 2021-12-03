@file:JsModule("react")
@file:JsNonModule

package react

// Refs (16.3+)
external interface Ref<T : Any>

external interface RefObject<out T : Any> : Ref<T> {
    val current: T?
}

external interface MutableRefObject<T : Any> : RefObject<T> {
    override var current: T?
}

external fun <T : Any> createRef(): RefObject<T>

// Ref Hook (16.8+)
external fun <T : Any> useRef(
    initialValue: T? = definedExternally,
): MutableRefObject<T>
