// Automatically generated - do not modify!

package js.intl

sealed external interface SegmenterOptions {
    /** The locale matching algorithm to use. For information about this option, see [Intl page](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation). */
    var localeMatcher: String /* "best fit" | "lookup" */?

    /** The type of input to be split */
    var granularity: String /* "grapheme" | "word" | "sentence" */?
}
