// Automatically generated - do not modify!

@file:JsModule("semver")

package semver

/**
 * Return the highest version in the list that satisfies the range, or null if none of them do.
 */
external fun <T : Any /* string | SemVer */> maxSatisfying(versions: js.array.ReadonlyArray<T>, range: String): T?

/**
 * Return the highest version in the list that satisfies the range, or null if none of them do.
 */
external fun <T : Any /* string | SemVer */> maxSatisfying(
    versions: js.array.ReadonlyArray<T>,
    range: String,
    optionsOrLoose: Boolean = definedExternally,
): T?

/**
 * Return the highest version in the list that satisfies the range, or null if none of them do.
 */
external fun <T : Any /* string | SemVer */> maxSatisfying(
    versions: js.array.ReadonlyArray<T>,
    range: String,
    optionsOrLoose: RangeOptions = definedExternally,
): T?

/**
 * Return the highest version in the list that satisfies the range, or null if none of them do.
 */
external fun <T : Any /* string | SemVer */> maxSatisfying(versions: js.array.ReadonlyArray<T>, range: Range): T?

/**
 * Return the highest version in the list that satisfies the range, or null if none of them do.
 */
external fun <T : Any /* string | SemVer */> maxSatisfying(
    versions: js.array.ReadonlyArray<T>,
    range: Range,
    optionsOrLoose: Boolean = definedExternally,
): T?

/**
 * Return the highest version in the list that satisfies the range, or null if none of them do.
 */
external fun <T : Any /* string | SemVer */> maxSatisfying(
    versions: js.array.ReadonlyArray<T>,
    range: Range,
    optionsOrLoose: RangeOptions = definedExternally,
): T?
