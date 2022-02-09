// Automatically generated - do not modify!

@file:JsModule("typescript")
@file:JsNonModule

package typescript

import kotlinx.js.ReadonlyArray

/**
 * Reads the config file, reports errors if any and exits if the config file cannot be found
 */
external fun getParsedCommandLineOfConfigFile(
    configFileName: String,
    optionsToExtend: CompilerOptions?,
    host: ParseConfigFileHost,
    extendedConfigCache: Map<ExtendedConfigCacheEntry> = definedExternally,
    watchOptionsToExtend: WatchOptions = definedExternally,
    extraFileExtensions: ReadonlyArray<FileExtensionInfo> = definedExternally,
): ParsedCommandLine?
