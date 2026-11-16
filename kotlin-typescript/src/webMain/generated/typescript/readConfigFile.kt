// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.sync.ReadConfigFileResult

/**
 * Read tsconfig.json file
 * @param fileName The path to the config file
 */
external fun readConfigFile(
    fileName: String,
    readFile: (path: String) -> String?,
): ReadConfigFileResult
