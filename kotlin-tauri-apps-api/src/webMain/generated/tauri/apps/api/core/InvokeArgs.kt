// Automatically generated - do not modify!

package tauri.apps.api.core

/**
 * Command arguments.
 *
 * An object is the usual form: each key becomes a command parameter, serialized
 * as JSON (`application/octet-stream` is used instead when a value implements
 * {@linkcode SERIALIZE_TO_IPC_FN}, see its documentation).
 *
 * The `ArrayBuffer`, `Uint8Array` and `number[]` variants are a *raw payload*:
 * the whole request body is sent as `application/octet-stream` instead of JSON,
 * which avoids the cost of base64/array encoding for large binary data. The
 * command then has a single [`tauri::ipc::Request`](https://docs.rs/tauri/2/tauri/ipc/struct.Request.html)
 * parameter and reads the bytes from it:
 *
 * ```rust
 * #[tauri::command]
 * fn upload(request: tauri::ipc::Request<'_>) -> Result<(), String> {
 *   let tauri::ipc::InvokeBody::Raw(bytes) = request.body() else {
 *     return Err("expected a raw body".into());
 *   };
 *   println!("got {} bytes", bytes.len());
 *   Ok(())
 * }
 * ```
 *
 * ```typescript
 * import { invoke } from '@tauri-apps/api/core';
 * await invoke('upload', new Uint8Array([1, 2, 3]));
 * ```
 *
 * A command that returns [`tauri::ipc::Response`](https://docs.rs/tauri/2/tauri/ipc/struct.Response.html)
 * likewise resolves to an `ArrayBuffer` on the frontend instead of a JSON value.
 *
 * @since 1.0.0
 */
typealias InvokeArgs = Any /* Record<string, unknown> | number[] | ArrayBuffer | Uint8Array */
