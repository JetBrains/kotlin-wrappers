// Automatically generated - do not modify!

package tauri.apps.api


/**
 * Options for `mockIPC`.
 *
 * # Options
 * `shouldMockEvents`: If true, the `listen` and `emit` functions will be mocked, allowing you to test event handling without a real backend.
 * **This will consume any events emitted with the `plugin:event` prefix.**
 *
 * @since 2.7.0
 */
external interface MockIPCOptions {
    var shouldMockEvents: Boolean?
}
