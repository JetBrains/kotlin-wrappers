// Automatically generated - do not modify!

package tauri.apps.api.event

/**
 * The target of an event, used to filter which listeners receive it and which
 * listeners a given emit reaches.
 *
 * - `Any`: matches every target (the default).
 * - `AnyLabel`: matches any window, webview or webview window with the given label.
 * - `App`: the application itself, i.e. listeners registered with `app.listen` on the Rust side.
 * - `Window` / `Webview` / `WebviewWindow`: the specific target with that label.
 *
 * @since 2.0.0
 */
typealias EventTarget = Any /* {
    kind: 'Any';
} | {
    kind: 'AnyLabel';
    label: string;
} | {
    kind: 'App';
} | {
    kind: 'Window';
    label: string;
} | {
    kind: 'Webview';
    label: string;
} | {
    kind: 'WebviewWindow';
    label: string;
} */
