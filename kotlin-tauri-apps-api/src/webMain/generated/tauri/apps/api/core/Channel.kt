// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/core")

package tauri.apps.api.core

/**
 * A message channel used to stream values from Rust to the frontend.
 *
 * A `Channel` is the JavaScript counterpart of [`tauri::ipc::Channel`](https://docs.rs/tauri/2/tauri/ipc/struct.Channel.html).
 * Pass an instance as a command argument and the Rust command can declare a
 * `tauri::ipc::Channel<T>` parameter with the same name; every value sent from
 * Rust is then delivered to {@linkcode Channel.onmessage}. Messages are delivered
 * in the order they were sent, even when they arrive out of order.
 *
 * The channel stays alive until the Rust `Channel` is dropped, so it can be used
 * for long-running work such as download progress or log streaming.
 *
 * Raw byte payloads are delivered to the frontend as an `ArrayBuffer` rather than
 * a JSON value, so declare the channel as `Channel<ArrayBuffer>` when the Rust
 * side sends `tauri::ipc::InvokeResponseBody::Raw` — for example through a
 * `Channel<tauri::ipc::Response>` whose values are built with
 * `tauri::ipc::Response::new(bytes)`.
 *
 * @example
 * ```typescript
 * import { Channel, invoke } from '@tauri-apps/api/core';
 *
 * const onEvent = new Channel<string>();
 * onEvent.onmessage = (message) => {
 *   console.log(`got download event ${message}`);
 * };
 *
 * await invoke('download', { url: 'https://tauri.app', onEvent });
 * ```
 *
 * The matching Rust command:
 * ```rust
 * #[tauri::command]
 * async fn download(url: String, on_event: tauri::ipc::Channel<String>) -> tauri::Result<()> {
 *   on_event.send("started".to_string())?;
 *   on_event.send("finished".to_string())?;
 *   Ok(())
 * }
 * ```
 *
 * @since 2.0.0
 */
external class Channel<T /* default is Any? */> {
    constructor (onmessage: (response: T) -> Unit = definedExternally)

    /**
     * The callback id returned from {@linkcode transformCallback}.
     *
     * This is the value sent across the IPC, it is used by the Rust side to
     * address this channel and should not be changed.
     */
    var id: Double

    /**
     * The handler called for every message sent by the Rust side of this channel.
     *
     * Assigning a new handler replaces the previous one; messages that arrived
     * before a handler was set are not replayed, so set it (or pass it to the
     * constructor) before sending the channel to the backend.
     */
    var onmessage: (response: T) -> Unit

    fun toJSON(): String
}
