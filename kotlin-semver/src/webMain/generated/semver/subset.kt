// Automatically generated - do not modify!

@file:JsModule("semver")

package semver

/**
 * Return true if the subRange range is entirely contained by the superRange range.
 */
external fun subset(
    sub: String,
    dom: String,
    options: RangeOptions = definedExternally,
): Boolean

/**
 * Return true if the subRange range is entirely contained by the superRange range.
 */
external fun subset(
    sub: String,
    dom: Range,
    options: RangeOptions = definedExternally,
): Boolean

/**
 * Return true if the subRange range is entirely contained by the superRange range.
 */
external fun subset(
    sub: Range,
    dom: String,
    options: RangeOptions = definedExternally,
): Boolean

/**
 * Return true if the subRange range is entirely contained by the superRange range.
 */
external fun subset(
    sub: Range,
    dom: Range,
    options: RangeOptions = definedExternally,
): Boolean
