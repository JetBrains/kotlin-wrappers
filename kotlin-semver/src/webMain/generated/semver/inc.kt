// Automatically generated - do not modify!

@file:JsModule("semver")

package semver

/**
 * Return the version incremented by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if it's not valid.
 */
external fun inc(
    version: String,
    release: ReleaseType,
): String?

/**
 * Return the version incremented by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if it's not valid.
 */
external fun inc(
    version: String,
    release: ReleaseType,
    optionsOrLoose: Boolean = definedExternally,
    identifier: String = definedExternally,
    identifierBase: IdentifierBase = definedExternally,
): String?

/**
 * Return the version incremented by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if it's not valid.
 */
external fun inc(
    version: String,
    release: ReleaseType,
    optionsOrLoose: Options = definedExternally,
    identifier: String = definedExternally,
    identifierBase: IdentifierBase = definedExternally,
): String?

/**
 * Return the version incremented by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if it's not valid.
 */
external fun inc(
    version: SemVer,
    release: ReleaseType,
): String?

/**
 * Return the version incremented by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if it's not valid.
 */
external fun inc(
    version: SemVer,
    release: ReleaseType,
    optionsOrLoose: Boolean = definedExternally,
    identifier: String = definedExternally,
    identifierBase: IdentifierBase = definedExternally,
): String?

/**
 * Return the version incremented by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if it's not valid.
 */
external fun inc(
    version: SemVer,
    release: ReleaseType,
    optionsOrLoose: Options = definedExternally,
    identifier: String = definedExternally,
    identifierBase: IdentifierBase = definedExternally,
): String?

external fun inc(
    version: String,
    release: ReleaseType,
    identifier: String,
    identifierBase: IdentifierBase = definedExternally,
): String?

external fun inc(
    version: SemVer,
    release: ReleaseType,
    identifier: String,
    identifierBase: IdentifierBase = definedExternally,
): String?
