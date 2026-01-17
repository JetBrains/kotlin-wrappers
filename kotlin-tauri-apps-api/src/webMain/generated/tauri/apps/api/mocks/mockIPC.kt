// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/mocks")

package tauri.apps.api.mocks

import tauri.apps.api.core.InvokeArgs

/**
 * Intercepts all IPC requests with the given mock handler.
 *
 * This function can be used when testing tauri frontend applications or when running the frontend in a Node.js context during static site generation.
 *
 * # Examples
 *
 * Testing setup using Vitest:
 * ```ts
 * import { mockIPC, clearMocks } from "@tauri-apps/api/mocks"
 * import { invoke } from "@tauri-apps/api/core"
 *
 * afterEach(() => {
 *    clearMocks()
 * })
 *
 * test("mocked command", () => {
 *  mockIPC((cmd, payload) => {
 *   switch (cmd) {
 *     case "add":
 *       return (payload.a as number) + (payload.b as number);
 *     default:
 *       break;
 *     }
 *  });
 *
 *  expect(invoke('add', { a: 12, b: 15 })).resolves.toBe(27);
 * })
 * ```
 *
 * The callback function can also return a Promise:
 * ```js
 * import { mockIPC, clearMocks } from "@tauri-apps/api/mocks"
 * import { invoke } from "@tauri-apps/api/core"
 *
 * afterEach(() => {
 *    clearMocks()
 * })
 *
 * test("mocked command", () => {
 *  mockIPC((cmd, payload) => {
 *   if(cmd === "get_data") {
 *    return fetch("https://example.com/data.json")
 *      .then((response) => response.json())
 *   }
 *  });
 *
 *  expect(invoke('get_data')).resolves.toBe({ foo: 'bar' });
 * })
 * ```
 *
 * `listen` can also be mocked with direct calls to the `emit` function. This functionality is opt-in via the `shouldMockEvents` option:
 * ```js
 * import { mockIPC, clearMocks } from "@tauri-apps/api/mocks"
 * import { emit, listen } from "@tauri-apps/api/event"
 *
 * afterEach(() => {
 *    clearMocks()
 * })
 *
 * test("mocked event", () => {
 *  mockIPC(() => {}, { shouldMockEvents: true }); // enable event mocking
 *
 *  const eventHandler = vi.fn();
 *  listen('test-event', eventHandler); // typically in component setup or similar
 *
 *  emit('test-event', { foo: 'bar' });
 *  expect(eventHandler).toHaveBeenCalledWith({
 *    event: 'test-event',
 *    payload: { foo: 'bar' }
 *  });
 * })
 * ```
 * `emitTo` is currently **not** supported by this mock implementation.
 *
 * @since 1.0.0
 */
external fun mockIPC(
    cb: (cmd: String, payload: InvokeArgs? /* use undefined for default */) -> Any?,
    options: MockIPCOptions = definedExternally,
)
