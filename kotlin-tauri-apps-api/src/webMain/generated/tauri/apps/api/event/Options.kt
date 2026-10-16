// Automatically generated - do not modify!

package tauri.apps.api.event

external interface Options {
    /**
     * The event target to listen to, defaults to `{ kind: 'Any' }`, see {@link EventTarget}.
     *
     * If a string is provided, it is used as the label of an `AnyLabel` target,
     * i.e. `{ kind: 'AnyLabel', label: <the string> }`.
     */
    var target: (Any /* string | EventTarget */)?
}
