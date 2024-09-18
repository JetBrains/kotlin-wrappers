// Generated by Karakum - do not modify it manually!

@file:JsModule("semver/ranges/subset")

package semver

/* import Range = require("../classes/range"); */

/* import semver = require("../index"); */

/**
 * Return true if the subRange range is entirely contained by the superRange range.
 */
external fun subset(sub: String, dom: String, options: semver.RangeOptions = definedExternally): Boolean

/**
 * Return true if the subRange range is entirely contained by the superRange range.
 */
external fun subset(sub: String, dom: Range, options: semver.RangeOptions = definedExternally): Boolean

/**
 * Return true if the subRange range is entirely contained by the superRange range.
 */
external fun subset(sub: Range, dom: String, options: semver.RangeOptions = definedExternally): Boolean

/**
 * Return true if the subRange range is entirely contained by the superRange range.
 */
external fun subset(sub: Range, dom: Range, options: semver.RangeOptions = definedExternally): Boolean

/* export = subset; */
