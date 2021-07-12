@file:JsModule("react")
@file:JsNonModule

package react

// Refs (16.3+)
external interface RRef

external interface RReadableRef<out T : Any> : RRef {
    val current: T?
}

external interface RMutableRef<T : Any> : RReadableRef<T> {
    override var current: T?
}

external fun <T : Any> createRef(): RReadableRef<T>

// Ref Hook (16.8+)
external fun <T : Any> useRef(
    initialValue: T? = definedExternally,
): RMutableRef<T>
