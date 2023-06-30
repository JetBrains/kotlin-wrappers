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
     * whether or not a given printer is set as the default printer on the OS.
     */
    var isDefault: Boolean

    /**
     * the name of the printer as understood by the OS.
     */
    var name: String

    /**
     * an object containing a variable number of platform-specific printer information.
     */
    var options: Options

    /**
     * the current status of the printer.
     */
    var status: Double
}
