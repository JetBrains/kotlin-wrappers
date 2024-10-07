package js.reflect

import js.array.ReadonlyArray
import js.objects.PropertyKey
import js.objects.TypedPropertyDescriptor
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ProxyHandler<in T : Any> {
    val apply: ((target: T, thisArg: Any, argArray: ReadonlyArray<Any>) -> Any)?
    val construct: ((target: T, argArray: ReadonlyArray<Any>, newTarget: Function<*>) -> Any)?
    val defineProperty: ((target: T, p: PropertyKey, attributes: TypedPropertyDescriptor<*>) -> Boolean)?
    val deleteProperty: ((target: T, p: PropertyKey) -> Boolean)?
    val get: ((target: T, p: PropertyKey, receiver: Any) -> Any)?
    val getOwnPropertyDescriptor: ((target: T, p: PropertyKey) -> TypedPropertyDescriptor<*>)?
    val getPrototypeOf: ((target: T) -> Any?)?
    val has: ((target: T, p: PropertyKey) -> Boolean)?
    val isExtensible: ((target: T) -> Boolean)?
    val ownKeys: ((target: T) -> ReadonlyArray<PropertyKey>)?
    val preventExtensions: ((target: T) -> Boolean)?
    val set: ((target: T, p: PropertyKey, value: Any, receiver: Any) -> Boolean)?
    val setPrototypeOf: ((target: T, v: Any?) -> Boolean)?
}
