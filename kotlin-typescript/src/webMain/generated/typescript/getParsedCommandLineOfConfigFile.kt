// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

/**
 * Reads the config file, reports errors if any and exits if the config file cannot be found
 */
external fun getParsedCommandLineOfConfigFile(
    configFileName: String,
    optionsToExtend: CompilerOptions?,
    host: ParseConfigFileHost,
    extendedConfigCache: js.collections.ReadonlyMap<String, ExtendedConfigCacheEntry> = definedExternally,
    watchOptionsToExtend: WatchOptions = definedExternally,
    extraFileExtensions: js.array.ReadonlyArray<FileExtensionInfo> = definedExternally,
): ParsedCommandLine?
