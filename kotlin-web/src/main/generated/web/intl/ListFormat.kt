// Automatically generated - do not modify!

package web.intl

import kotlinx.js.JsIterable
import kotlinx.js.ReadonlyArray

sealed external interface ListFormat {
    /**
     * Returns a string with a language-specific representation of the list.
     *
     * @param list - An iterable object, such as an [Array](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array).
     *
     * @throws `TypeError` if `list` includes something other than the possible values.
     *
     * @returns {string} A language-specific formatted string representing the elements of the list.
     *
     * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/format).
     */
    fun format(list: JsIterable<String>): String

    /**
     * Returns an Array of objects representing the different components that can be used to format a list of values in a locale-aware fashion.
     *
     * @param list - An iterable object, such as an [Array](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array), to be formatted according to a locale.
     *
     * @throws `TypeError` if `list` includes something other than the possible values.
     *
     * @returns {{ type: "element" | "literal", value: string; }[]} An Array of components which contains the formatted parts from the list.
     *
     * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/formatToParts).
     */
    fun formatToParts(list: JsIterable<String>): ReadonlyArray<dynamic /* { type; value; } */>
}
