@file:Suppress("WRONG_JS_QUALIFIER")
// language=JavaScript
@file:JsQualifier(
    """({
    __type_plus_guard__: Object.setPrototypeOf({
        [Symbol.hasInstance](instance) {
            return typeof instance === 'symbol'
        }
    }, Symbol)
  })"""
)

package js.core

import seskar.js.JsPrimitive

@JsPrimitive
@JsExternalInheritorsOnly
@JsName("__type_plus_guard__")
open external class Symbol {
    val description: String?

    object asyncIterator : Symbol
    object hasInstance : Symbol
    object isConcatSpreadable : Symbol
    object iterator : Symbol
    object match : Symbol
    object matchAll : Symbol
    object replace : Symbol
    object search : Symbol
    object species : Symbol
    object split : Symbol
    object toPrimitive : Symbol
    object toStringTag : Symbol
    object unscopables : Symbol

    companion object {
        fun `for`(key: String): Symbol

        fun keyFor(symbol: Symbol): String?
    }
}
