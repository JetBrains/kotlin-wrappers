// Automatically generated - do not modify!

package js.intl

sealed external interface CollatorOptions {
    var usage: String /* "sort" | "search" */?
    var localeMatcher: String /* "lookup" | "best fit" */?
    var numeric: Boolean?
    var caseFirst: String /* "upper" | "lower" | "false" */?
    var sensitivity: Sensitivity?
    var collation: Collation?
    var ignorePunctuation: Boolean?
}
