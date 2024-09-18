// Generated by Karakum - do not modify it manually!

@file:JsModule("semver/functions/parse")

package semver

/* import SemVer = require("../classes/semver"); */

/* import semver = require("../index"); */

/**
 * Return the parsed version as a SemVer object, or null if it's not valid.
 */
external fun parse(version: String?): SemVer?

/**
 * Return the parsed version as a SemVer object, or null if it's not valid.
 */
external fun parse(version: String?, optionsOrLoose: Boolean = definedExternally): SemVer?

/**
 * Return the parsed version as a SemVer object, or null if it's not valid.
 */
external fun parse(version: String?, optionsOrLoose: semver.Options = definedExternally): SemVer?

/**
 * Return the parsed version as a SemVer object, or null if it's not valid.
 */
external fun parse(version: SemVer?): SemVer?

/**
 * Return the parsed version as a SemVer object, or null if it's not valid.
 */
external fun parse(version: SemVer?, optionsOrLoose: Boolean = definedExternally): SemVer?

/**
 * Return the parsed version as a SemVer object, or null if it's not valid.
 */
external fun parse(version: SemVer?, optionsOrLoose: semver.Options = definedExternally): SemVer?

/* export = parse; */
