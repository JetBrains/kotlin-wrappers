package js.symbol

import js.core.JsPrimitive
import js.objects.PropertyKey

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol)
 */
@JsPrimitive("symbol")
open external class Symbol
private constructor() :
    PropertyKey {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/description)
     */
    val description: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/asyncDispose)
     */
    object asyncDispose : Symbol

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/asyncIterator)
     */
    object asyncIterator : Symbol

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/dispose)
     */
    object dispose : Symbol

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/hasInstance)
     */
    object hasInstance : Symbol

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/isConcatSpreadable)
     */
    object isConcatSpreadable : Symbol

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/iterator)
     */
    object iterator : Symbol

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/match)
     */
    object match : Symbol

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/matchAll)
     */
    object matchAll : Symbol

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/metadata)
     */
    object metadata : Symbol

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/replace)
     */
    object replace : Symbol

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/search)
     */
    object search : Symbol

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/species)
     */
    object species : Symbol

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/split)
     */
    object split : Symbol

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/toPrimitive)
     */
    object toPrimitive : Symbol

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/toStringTag)
     */
    object toStringTag : Symbol

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/unscopables)
     */
    object unscopables : Symbol

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/for)
         */
        fun `for`(key: String): Symbol

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/keyFor)
         */
        fun keyFor(symbol: Symbol): String?
    }
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/Symbol)
 */
external fun Symbol(
    description: String = definedExternally,
): Symbol
