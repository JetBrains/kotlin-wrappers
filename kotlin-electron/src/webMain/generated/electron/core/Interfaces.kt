// Automatically generated - do not modify!

package electron.core

external interface Interfaces {
    /**
     * the interface number of this interface.
     */
    var interfaceNumber: Double

    /**
     * the currently selected alternative configuration of this interface.
     */
    var alternate: Alternate

    /**
     * an array containing instances of the USBAlternateInterface interface describing
     * each of the alternative configurations possible for this interface.
     */
    var alternates: js.array.ReadonlyArray<Alternates>
}
