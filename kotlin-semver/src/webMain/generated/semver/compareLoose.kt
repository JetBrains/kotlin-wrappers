// Automatically generated - do not modify!

@file:JsModule("semver")

package semver

// import SemVer = require("../classes/semver");

/**
 * Short for compare(v1, v2, { loose: true })
 */
external fun compareLoose(
    v1: String,
    v2: String,
): Int

/**
 * Short for compare(v1, v2, { loose: true })
 */
external fun compareLoose(
    v1: String,
    v2: SemVer,
): Int

/**
 * Short for compare(v1, v2, { loose: true })
 */
external fun compareLoose(
    v1: SemVer,
    v2: String,
): Int

/**
 * Short for compare(v1, v2, { loose: true })
 */
external fun compareLoose(
    v1: SemVer,
    v2: SemVer,
): Int

// export = compareLoose;
