// Automatically generated - do not modify!

@file:JsModule("typescript")
@file:JsNonModule

package typescript

import kotlinx.js.ReadonlyArray

/**
 * Given a set of options, returns the set of type directive names
 *   that should be included for this program automatically.
 * This list could either come from the config file,
 *   or from enumerating the types root + initial secondary types lookup location.
 * More type directives might appear in the program later as a result of loading actual source files;
 *   this list is only the set of defaults that are implicitly included.
 */
external fun getAutomaticTypeDirectiveNames(
    options: CompilerOptions,
    host: ModuleResolutionHost,
): ReadonlyArray<String>
