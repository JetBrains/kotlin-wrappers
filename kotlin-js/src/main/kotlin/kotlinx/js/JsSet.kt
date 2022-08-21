package kotlinx.js

@JsName("Set")
external class JsSet<T> : ReadonlySet<T> {
    constructor()
    constructor(values: JsIterator<T>?)
    constructor(values: ReadonlyArray<T>?)

    override val size: Int
    fun add(value: T): JsSet<T>
    fun clear()
    fun delete(value: T)
    override fun entries(): JsIterable.Iterator<JsPair<T, T>>
    override fun has(value: T): Boolean
    override fun forEach(action: (value: T) -> Unit)
    override fun keys(): JsIterable.Iterator<T>
    override fun values(): JsIterable.Iterator<T>
}
