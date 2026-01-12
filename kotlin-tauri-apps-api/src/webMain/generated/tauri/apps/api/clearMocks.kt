// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api

// unhandled import: InvokeArgs from "./core"

/**
 * Clears mocked functions/data injected by the other functions in this module.
 * When using a test runner that doesn't provide a fresh window object for each test, calling this function will reset tauri specific properties.
 *
 * # Example
 *
 * ```js
 * import { mockWindows, clearMocks } from "@tauri-apps/api/mocks"
 *
 * afterEach(() => {
 *    clearMocks()
 * })
 *
 * test("mocked windows", () => {
 *    mockWindows("main", "second", "third");
 *
 *    expect(window.__TAURI_INTERNALS__).toHaveProperty("metadata")
 * })
 *
 * test("no mocked windows", () => {
 *    expect(window.__TAURI_INTERNALS__).not.toHaveProperty("metadata")
 * })
 * ```
 *
 * @since 1.0.0
 */
external fun clearMocks()
