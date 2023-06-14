// Automatically generated - do not modify!

package js.intl

sealed external interface CollatorOptions {
    var usage: String /* "sort" | "search" */?
    var localeMatcher: String /* "lookup" | "best fit" */?
    var numeric: Boolean?
    var caseFirst: String /* "upper" | "lower" | "false" */?
    var sensitivity: String /* "base" | "accent" | "case" | "variant" */?
    var collation: String /* "big5han" | "compat" | "dict" | "direct" | "ducet" | "emoji" | "eor" | "gb2312" | "phonebk" | "phonetic" | "pinyin" | "reformed" | "searchjl" | "stroke" | "trad" | "unihan" | "zhuyin" */?
    var ignorePunctuation: Boolean?
}
