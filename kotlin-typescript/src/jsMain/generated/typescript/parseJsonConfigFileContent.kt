// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import js.core.ReadonlyArray

/**
 * Parse the contents of a config file (tsconfig.json).
 * @param json The contents of the config file to parse
 * @param host Instance of ParseConfigHost used to enumerate files in folder.
 * @param basePath A root directory to resolve relative path entries in the config
 *    file to. e.g. outDir
 */
external fun parseJsonConfigFileContent(
    json: Any,
    host: ParseConfigHost,
    basePath: String,
    existingOptions: CompilerOptions = definedExternally,
    configFileName: String = definedExternally,
    resolutionStack: ReadonlyArray<Path> = definedExternally,
    extraFileExtensions: ReadonlyArray<FileExtensionInfo> = definedExternally,
    extendedConfigCache: Map<ExtendedConfigCacheEntry> = definedExternally,
    existingWatchOptions: WatchOptions = definedExternally,
): ParsedCommandLine
