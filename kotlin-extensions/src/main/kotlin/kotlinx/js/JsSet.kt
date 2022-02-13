package kotlinx.js

@JsName("Set")
external class JsSet<T> {
    constructor()
    constructor(values: JsIterator<T>?)
    constructor(values: ReadonlyArray<T>?)

    val size: Int
    fun add(value: T): JsSet<T>
    fun clear()
    fun delete(value: T)
    fun entries(): JsIterator<JsPair<T, T>>
    fun has(value: T): Boolean
    fun forEach(action: (value: T, key: T) -> Unit)
    fun values(): JsIterator<T>
}
