// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/core")

package tauri.apps.api.core

/**
 * A rust-backed resource stored through `tauri::Manager::resources_table` API.
 *
 * The resource lives in the main process and does not exist
 * in the Javascript world, and thus will not be cleaned up automatically
 * except on application exit. If you want to clean it up early, call {@linkcode Resource.close} or use [Explicit Resource Management].
 *
 * Several API types are resources and inherit this behavior, among them `Menu`,
 * `TrayIcon`, `Image`, `Webview` and the menu item classes.
 *
 * To support older browsers with [Explicit Resource Management], use a supported compiler (e.g. tsc) or bundler (e.g. rollup).
 *
 * @example
 * ```typescript
 * import { Resource, invoke } from '@tauri-apps/api/core';
 *
 * export class DatabaseHandle extends Resource {
 *   static async open(path: string): Promise<DatabaseHandle> {
 *     const rid: number = await invoke('open_db', { path });
 *     return new DatabaseHandle(rid);
 *   }
 *
 *   async execute(sql: string): Promise<void> {
 *     await invoke('execute_sql', { rid: this.rid, sql });
 *   }
 * }
 * ```
 *
 * Only asynchronous disposal is implemented (`Symbol.asyncDispose`), because closing
 * a resource is an IPC call. Use `await using`; the synchronous `using` form does
 * **not** work with resources.
 *
 * @example
 * ```
 * await using db = await DatabaseHandle.open('test.db');
 * await db.execute('SELECT *');
 * // `db` is closed here, by awaiting `db[Symbol.asyncDispose]()`
 * ```
 *
 * To support older browsers, add the following to the globals (e.g. adding to the HTML file):
 *
 * ```javascript
 * Symbol.asyncDispose ??= Symbol("Symbol.asyncDispose");
 * ```
 *
 * And for the compiler, for example `tsc`, `rollup`, `vite`, add the following to `tsconfig.json`:
 *
 * ```json
 * {
 *   "compilerOptions": {
 *     "target": "es2022",
 *     "lib": ["es2022", "esnext.disposable", "dom"]
 *   }
 * }
 * ```
 *
 * [Explicit Resource Management]: https://github.com/tc39/proposal-explicit-resource-management
 */
open external class Resource {
    constructor (rid: Double)

    val rid: Double

    /**
     * Destroys and cleans up this resource from memory.
     * **You should not call any method on this object anymore and should drop any reference to it.**
     *
     * @remarks Uses the `core:resources:allow-close` permission, which is part of
     * the `core:resources:default` permission set enabled by default.
     */
    fun close(): js.promise.Promise<js.void.Void>
}
