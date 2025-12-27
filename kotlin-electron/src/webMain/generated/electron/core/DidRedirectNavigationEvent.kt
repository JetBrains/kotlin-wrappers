// Automatically generated - do not modify!

package electron.core

@Suppress("INTERFACE_WITH_SUPERCLASS")
external interface DidRedirectNavigationEvent : DOMEvent {
    var url: String
    var isInPlace: Boolean
    var isMainFrame: Boolean
    var frameProcessId: Double
    var frameRoutingId: Double
}
