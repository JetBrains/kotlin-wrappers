package kotlinext.js

external interface PropertyDescriptor<T> {
    var configurable: Boolean
    var enumerable: Boolean
    var value: T
    var writable: Boolean
    var get: () -> T
    var set: (v: T) -> Unit
}

external interface JsObject {
    fun toLocaleString(): String
    fun valueOf(): dynamic
    fun hasOwnProperty(v: String): Boolean
    fun isPrototypeOf(v: Any): Boolean
    fun propertyIsEnumerable(v: String): Boolean
}

fun Any.asJsObject() = this as JsObject

external object Object {
    fun <P, T : P> getPrototypeOf(o: T): P?
    fun <T> getOwnPropertyDescriptor(o: Any, p: String): PropertyDescriptor<T>
    fun getOwnPropertyNames(o: Any): Array<String>
    fun create(o: Nothing?, properties: dynamic = definedExternally): Any
    fun <T> create(o: T, properties: dynamic = definedExternally): T
    fun <T, P> defineProperty(o: T, p: String, attributes: PropertyDescriptor<P>): T
    fun <T> defineProperties(o: T, properties: dynamic): T
    fun <T> seal(o: T): T
    fun <R, T : R> freeze(o: T): R
    fun <T> preventExtensions(o: T): T
    fun isSealed(o: Any): Boolean
    fun isFrozen(o: Any): Boolean
    fun isExtensible(o: Any): Boolean
    fun keys(o: Any): Array<String>
}

@JsModule("core-js/library/fn/object/assign")
external fun <T, R : T> assign(dest: R, src: T): R
