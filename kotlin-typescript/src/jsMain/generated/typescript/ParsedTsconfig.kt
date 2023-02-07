// Automatically generated - do not modify!

package typescript

sealed external interface ParsedTsconfig {
    var raw: Any
    var options: CompilerOptions?
    var watchOptions: WatchOptions?
    var typeAcquisition: TypeAcquisition?

    /**
     * Note that the case of the config path has not yet been normalized, as no files have been imported into the project yet
     */
    var extendedConfigPath: String?
}
