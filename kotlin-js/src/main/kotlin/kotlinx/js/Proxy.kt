package kotlinx.js

external interface ProxyHandler<T : Any> {
    interface PropertyName /* string | symbol */

    var apply: ((target: T, thisArg: Any, argArray: ReadonlyArray<Any>) -> Any)?
    var construct: ((target: T, argArray: ReadonlyArray<Any>, newTarget: Function<*>) -> Any)?
    var defineProperty: ((target: T, p: PropertyName, attributes: PropertyDescriptor<*>) -> Boolean)?
    var deleteProperty: ((target: T, p: PropertyName) -> Boolean)?
    var get: ((target: T, p: PropertyName, receiver: Any) -> Any)?
    var getOwnPropertyDescriptor: ((target: T, p: PropertyName) -> PropertyDescriptor<*>)?
    var getPrototypeOf: ((target: T) -> Any?)?
    var has: ((target: T, p: PropertyName) -> Boolean)?
    var isExtensible: ((target: T) -> Boolean)?
    var ownKeys: ((target: T) -> ReadonlyArray<PropertyName>)?
    var preventExtensions: ((target: T) -> Boolean)?
    var set: ((target: T, p: PropertyName, value: Any, receiver: Any) -> Boolean)?
    var setPrototypeOf: ((target: T, v: Any?) -> Boolean)?
}

external class Proxy<T : Any>(
    target: T,
    handler: ProxyHandler<T>,
) {
    interface Revocable<T : Any> {
        val proxy: T
        fun revoke()
    }

    companion object {
        fun <T : Any> revocable(
            target: T,
            handler: ProxyHandler<T>,
        ): Revocable<T>
    }
}
