// Automatically generated - do not modify!

package typescript.sync

/**
 * Interface extending ParseConfigHost to support ParseConfigFile that reads config file and reports errors
 */
external interface ParseConfigFileHost :
    ParseConfigHost,
    ConfigFileDiagnosticsReporter {
    fun getCurrentDirectory(): String
}
