// Automatically generated - do not modify!

package typescript

sealed external interface CompletionEntryDataAutoImport {
    /**
     * The name of the property or export in the module's symbol table. Differs from the completion name
     * in the case of InternalSymbolName.ExportEquals and InternalSymbolName.Default.
     */
    var exportName: String
    var moduleSpecifier: String?

    /** The file name declaring the export's module symbol, if it was an external module */
    var fileName: String?

    /** The module name (with quotes stripped) of the export's module symbol, if it was an ambient module */
    var ambientModuleName: String?

    /** True if the export was found in the package.json AutoImportProvider */
    var isPackageJsonImport: Boolean? /* true */
}
