// Generated by Karakum - do not modify it manually!

@file:JsModule("semver")

package semver

// import Range = require("../classes/range");

// import SemVer = require("../classes/semver");

// import semver = require("../index");

/**
 * Return true if the version is outside the bounds of the range in either the high or low direction.
 * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
 */
external fun outside(
    version: String,
    range: String,
    hilo: OutsideHilo,
): Boolean

/**
 * Return true if the version is outside the bounds of the range in either the high or low direction.
 * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
 */
external fun outside(
    version: String,
    range: String,
    hilo: OutsideHilo,
    optionsOrLoose: Boolean = definedExternally,
): Boolean

/**
 * Return true if the version is outside the bounds of the range in either the high or low direction.
 * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
 */
external fun outside(
    version: String,
    range: String,
    hilo: OutsideHilo,
    optionsOrLoose: RangeOptions = definedExternally,
): Boolean

/**
 * Return true if the version is outside the bounds of the range in either the high or low direction.
 * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
 */
external fun outside(
    version: String,
    range: Range,
    hilo: OutsideHilo,
): Boolean

/**
 * Return true if the version is outside the bounds of the range in either the high or low direction.
 * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
 */
external fun outside(
    version: String,
    range: Range,
    hilo: OutsideHilo,
    optionsOrLoose: Boolean = definedExternally,
): Boolean

/**
 * Return true if the version is outside the bounds of the range in either the high or low direction.
 * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
 */
external fun outside(
    version: String,
    range: Range,
    hilo: OutsideHilo,
    optionsOrLoose: RangeOptions = definedExternally,
): Boolean

/**
 * Return true if the version is outside the bounds of the range in either the high or low direction.
 * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
 */
external fun outside(
    version: SemVer,
    range: String,
    hilo: OutsideHilo,
): Boolean

/**
 * Return true if the version is outside the bounds of the range in either the high or low direction.
 * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
 */
external fun outside(
    version: SemVer,
    range: String,
    hilo: OutsideHilo,
    optionsOrLoose: Boolean = definedExternally,
): Boolean

/**
 * Return true if the version is outside the bounds of the range in either the high or low direction.
 * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
 */
external fun outside(
    version: SemVer,
    range: String,
    hilo: OutsideHilo,
    optionsOrLoose: RangeOptions = definedExternally,
): Boolean

/**
 * Return true if the version is outside the bounds of the range in either the high or low direction.
 * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
 */
external fun outside(
    version: SemVer,
    range: Range,
    hilo: OutsideHilo,
): Boolean

/**
 * Return true if the version is outside the bounds of the range in either the high or low direction.
 * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
 */
external fun outside(
    version: SemVer,
    range: Range,
    hilo: OutsideHilo,
    optionsOrLoose: Boolean = definedExternally,
): Boolean

/**
 * Return true if the version is outside the bounds of the range in either the high or low direction.
 * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
 */
external fun outside(
    version: SemVer,
    range: Range,
    hilo: OutsideHilo,
    optionsOrLoose: RangeOptions = definedExternally,
): Boolean

// export = outside;
