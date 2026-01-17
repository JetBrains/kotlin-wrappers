// Automatically generated - do not modify!

@file:JsModule("semver")

package semver

/**
 * Return the parsed version as a `SemVer` object.
 *
 * In case `version` is invalid, the function will
 * - throw if `throwErrors` is `true`.
 * - return `null` otherwise.
 */
external fun parse(): SemVer?

/**
 * Return the parsed version as a `SemVer` object.
 *
 * In case `version` is invalid, the function will
 * - throw if `throwErrors` is `true`.
 * - return `null` otherwise.
 */
external fun parse(version: String? = definedExternally): SemVer?

/**
 * Return the parsed version as a `SemVer` object.
 *
 * In case `version` is invalid, the function will
 * - throw if `throwErrors` is `true`.
 * - return `null` otherwise.
 */
external fun parse(version: SemVer? = definedExternally): SemVer?

external fun parse(
    version: String?,
    optionsOrLoose: Boolean,
    throwErrors: Boolean = definedExternally,
): SemVer?

external fun parse(
    version: String?,
    optionsOrLoose: Options,
    throwErrors: Boolean = definedExternally,
): SemVer?

external fun parse(
    version: SemVer?,
    optionsOrLoose: Boolean,
    throwErrors: Boolean = definedExternally,
): SemVer?

external fun parse(
    version: SemVer?,
    optionsOrLoose: Options,
    throwErrors: Boolean = definedExternally,
): SemVer?
