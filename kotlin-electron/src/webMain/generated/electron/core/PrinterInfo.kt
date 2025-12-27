// Automatically generated - do not modify!

package electron.core

external interface PrinterInfo {
// Docs: https://electronjs.org/docs/api/structures/printer-info
    /**
     * a longer description of the printer's type.
     */
    var description: String

    /**
     * the name of the printer as shown in Print Preview.
     */
    var displayName: String

    /**
     * the name of the printer as understood by the OS.
     */
    var name: String

    /**
     * an object containing a variable number of platform-specific printer information.
     */
    var options: Options
}
