// Automatically generated - do not modify!

package web.intl

sealed external interface LocaleOptions {
    /** A string containing the language, and the script and region if available. */
    var baseName: String?
        get() = definedExternally
        set(value) = definedExternally

    /** The part of the Locale that indicates the locale's calendar era. */
    var calendar: String?
        get() = definedExternally
        set(value) = definedExternally

    /** Flag that defines whether case is taken into account for the locale's collation rules. */
    var caseFirst: LocaleCollationCaseFirst?
        get() = definedExternally
        set(value) = definedExternally

    /** The collation type used for sorting */
    var collation: String?
        get() = definedExternally
        set(value) = definedExternally

    /** The time keeping format convention used by the locale. */
    var hourCycle: LocaleHourCycleKey?
        get() = definedExternally
        set(value) = definedExternally

    /** The primary language subtag associated with the locale. */
    var language: String?
        get() = definedExternally
        set(value) = definedExternally

    /** The numeral system used by the locale. */
    var numberingSystem: String?
        get() = definedExternally
        set(value) = definedExternally

    /** Flag that defines whether the locale has special collation handling for numeric characters. */
    var numeric: Boolean?
        get() = definedExternally
        set(value) = definedExternally

    /** The region of the world (usually a country) associated with the locale. Possible values are region codes as defined by ISO 3166-1. */
    var region: String?
        get() = definedExternally
        set(value) = definedExternally

    /** The script used for writing the particular language used in the locale. Possible values are script codes as defined by ISO 15924. */
    var script: String?
        get() = definedExternally
        set(value) = definedExternally
}
