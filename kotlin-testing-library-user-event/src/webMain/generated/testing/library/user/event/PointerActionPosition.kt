// Automatically generated - do not modify!

package testing.library.user.event

// unhandled import: PointerCoords from "../event"
// unhandled import: Instance from "../setup"
// unhandled import: pointerKey from "../system/pointer"

external interface PointerActionPosition {
    var target: web.dom.Element?
    var coords: PointerCoords?
    var node: web.dom.Node?

    /**
     * If `node` is set, this is the DOM offset.
     * Otherwise this is the `textContent`/`value` offset on the `target`.
     */
    var offset: Double?
}
