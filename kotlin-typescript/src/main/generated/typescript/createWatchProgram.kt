// Automatically generated - do not modify!

@file:JsModule("typescript")
@file:JsNonModule

package typescript

/**
 * Creates the watch from the host for root files and compiler options
 */
external fun <T : BuilderProgram> createWatchProgram(host: WatchCompilerHostOfFilesAndCompilerOptions<T>): WatchOfFilesAndCompilerOptions<T>

/**
 * Creates the watch from the host for config file
 */
external fun <T : BuilderProgram> createWatchProgram(host: WatchCompilerHostOfConfigFile<T>): WatchOfConfigFile<T>