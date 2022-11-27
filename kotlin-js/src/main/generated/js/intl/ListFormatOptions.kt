// Automatically generated - do not modify!

package js.intl

sealed external interface ListFormatOptions {
    /** The locale matching algorithm to use. For information about this option, see [Intl page](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation). */
    var localeMatcher: ListFormatLocaleMatcher?

    /** The format of output message. */
    var type: ListFormatType?

    /** The length of the internationalized message. */
    var style: ListFormatStyle?
}
