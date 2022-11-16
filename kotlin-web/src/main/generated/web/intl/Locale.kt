// Automatically generated - do not modify!

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package web.intl

sealed external interface Locale :
    LocaleOptions {
    /** A string containing the language, and the script and region if available. */
    var baseName: String

    /** The primary language subtag associated with the locale. */
    var language: String

    /** Gets the most likely values for the language, script, and region of the locale based on existing values. */
    fun maximize(): Locale

    /** Attempts to remove information about the locale that would be added by calling `Locale.maximize()`. */
    fun minimize(): Locale
}
