package kotlinx.js

external interface PropertyDescriptor<T> {
    var configurable: Boolean
    var enumerable: Boolean
    var value: T
    var writable: Boolean
    var get: () -> T
    var set: (v: T) -> Unit
}
