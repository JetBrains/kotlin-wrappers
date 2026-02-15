// Automatically generated - do not modify!

package js.intl

import js.array.ReadonlyArray
import js.core.JsUInt

external interface WeekInfo {
    /**
     * An integer between 1 (Monday) and 7 (Sunday) indicating the first day of the week for the locale. Commonly 1, 5, 6, or 7.
     *
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Locale/getWeekInfo#firstday)
     */
    var firstDay: Int

    /**
     * An array of integers between 1 and 7 indicating the weekend days for the locale.
     *
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Locale/getWeekInfo#weekend)
     */
    var weekend: ReadonlyArray<JsUInt>
}
