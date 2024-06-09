package js.reflect

import js.array.ReadonlyArray
import js.objects.PropertyKey
import js.objects.TypedPropertyDescriptor
import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface ProxyHandler<T : Any> {
    var apply: ((target: T, thisArg: Any, argArray: ReadonlyArray<Any>) -> Any)?
    var construct: ((target: T, argArray: ReadonlyArray<Any>, newTarget: Function<*>) -> Any)?
    var defineProperty: ((target: T, p: PropertyKey, attributes: TypedPropertyDescriptor<*>) -> Boolean)?
    var deleteProperty: ((target: T, p: PropertyKey) -> Boolean)?
    var get: ((target: T, p: PropertyKey, receiver: Any) -> Any)?
    var getOwnPropertyDescriptor: ((target: T, p: PropertyKey) -> TypedPropertyDescriptor<*>)?
    var getPrototypeOf: ((target: T) -> Any?)?
    var has: ((target: T, p: PropertyKey) -> Boolean)?
    var isExtensible: ((target: T) -> Boolean)?
    var ownKeys: ((target: T) -> ReadonlyArray<PropertyKey>)?
    var preventExtensions: ((target: T) -> Boolean)?
    var set: ((target: T, p: PropertyKey, value: Any, receiver: Any) -> Boolean)?
    var setPrototypeOf: ((target: T, v: Any?) -> Boolean)?
}
