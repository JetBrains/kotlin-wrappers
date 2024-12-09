package js.objects

@JsPlainObject
external interface TypedPropertyDescriptor<T> {
    val configurable: Boolean?
    val enumerable: Boolean?
    val value: T?
    val writable: Boolean?
    val get: (() -> T)?
    val set: ((v: T) -> Unit)?
}
