package kotlinx.js

@JsName("Set")
external class JsSet<T> {
    val size: Int
        get() = definedExternally
    fun add(value: T): JsSet<T>
    fun clear()
    fun delete(value: T)
    fun entries(): JsIterator<T>
    fun has(value: T): Boolean
    fun forEach(callback: (value: T, key: T, set: JsSet<T>) -> Unit)
    fun values(): JsIterator<T>
}
