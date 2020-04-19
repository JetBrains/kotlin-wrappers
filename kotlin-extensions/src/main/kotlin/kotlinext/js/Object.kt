package kotlinext.js

external interface PropertyDescriptor<T> {
    var configurable: Boolean
    var enumerable: Boolean
    var value: T
    var writable: Boolean
    var get: () -> T
    var set: (v: T) -> Unit
}

fun Any.asJsObject(): Object = unsafeCast<Object>()

external class Object internal constructor() {
    fun toLocaleString(): String
    fun valueOf(): dynamic
    fun hasOwnProperty(v: String): Boolean
    fun isPrototypeOf(v: Any): Boolean
    fun propertyIsEnumerable(v: String): Boolean

    companion object {
        fun <P : Any, T : P> getPrototypeOf(o: T): P
        fun <T> getOwnPropertyDescriptor(o: Any, p: String): PropertyDescriptor<T>
        fun getOwnPropertyNames(o: Any): Array<String>
        fun <T : Any> create(o: T?, properties: dynamic = definedExternally): T
        fun <T : Any, P> defineProperty(o: T, p: String, attributes: PropertyDescriptor<P>): T
        fun <T : Any> defineProperties(o: T, properties: dynamic): T
        fun <T> seal(o: T): T
        fun <R, T : R> freeze(o: T): R
        fun <T> preventExtensions(o: T): T
        fun isSealed(o: Any): Boolean
        fun isFrozen(o: Any): Boolean
        fun isExtensible(o: Any): Boolean
        fun keys(o: Any): Array<String>
        fun <T : Any, R : T> assign(dest: R, vararg src: T?): R
    }
}

fun Any.getOwnPropertyNames(): Array<String> =
    Object.getOwnPropertyNames(this)
