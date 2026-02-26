// Automatically generated - do not modify!

@file:JsModule("semver")

package semver

external class Range {
    constructor (range: String)

    constructor (range: String, optionsOrLoose: Boolean = definedExternally)

    constructor (range: String, optionsOrLoose: RangeOptions = definedExternally)

    constructor (range: Range)

    constructor (range: Range, optionsOrLoose: Boolean = definedExternally)

    constructor (range: Range, optionsOrLoose: RangeOptions = definedExternally)

    var range: String
    var raw: String
    var loose: Boolean
    var options: Options
    var includePrerelease: Boolean

    fun format(): String

    fun inspect(): String

    var set: js.array.ReadonlyArray<js.array.ReadonlyArray<Comparator>>

    fun parseRange(range: String): js.array.ReadonlyArray<Comparator>

    fun test(version: String): Boolean

    fun test(version: SemVer): Boolean

    fun intersects(range: Range): Boolean

    fun intersects(
        range: Range,
        optionsOrLoose: Boolean = definedExternally,
    ): Boolean

    fun intersects(
        range: Range,
        optionsOrLoose: Options = definedExternally,
    ): Boolean
}
