// Automatically generated - do not modify!

package tauri.apps.api.core

/**
 * @since 2.0.0
 */
external interface InvokeOptions {
    /**
     * Headers to send along with the IPC request.
     *
     * They are readable on the Rust side through
     * [`tauri::ipc::Request::headers`](https://docs.rs/tauri/2/tauri/ipc/struct.Request.html#method.headers)
     * and are useful to pass metadata (such as a content type for a raw payload)
     * without adding it to the command arguments.
     *
     * @example
     * ```typescript
     * import { invoke } from '@tauri-apps/api/core';
     * await invoke('upload', new Uint8Array([1, 2, 3]), {
     *   headers: { 'x-file-name': 'image.png' }
     * });
     * ```
     */
    var headers: web.http.HeadersInit
}
