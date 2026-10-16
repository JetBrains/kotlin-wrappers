// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/mocks")

package tauri.apps.api.mocks

/**
 * Test helpers that stand in for the Tauri backend.
 *
 * Importing any other module of this package in a plain Node/browser test
 * environment fails, because there is no `window.__TAURI_INTERNALS__` to talk to.
 * The functions here install a fake one: {@linkcode mockIPC} intercepts `invoke`
 * calls, {@linkcode mockWindows} makes the window/webview APIs believe a set of
 * windows exists, and {@linkcode mockConvertFileSrc} makes `convertFileSrc` return
 * the URL shape of a given platform.
 *
 * Call {@linkcode clearMocks} after each test when your runner reuses the same
 * `window` object between tests.
 *
 * @example
 * ```typescript
 * import { beforeEach, afterEach, expect, test } from 'vitest';
 * import { mockIPC, clearMocks } from '@tauri-apps/api/mocks';
 * import { invoke } from '@tauri-apps/api/core';
 *
 * afterEach(() => {
 *   clearMocks();
 * });
 *
 * test('greet', async () => {
 *   mockIPC((cmd, args) => {
 *     if (cmd === 'greet') {
 *       return `Hello, ${(args as { name: string }).name}!`;
 *     }
 *   });
 *
 *   await expect(invoke('greet', { name: 'tauri' })).resolves.toBe('Hello, tauri!');
 * });
 * ```
 *
 * This package is also accessible with `window.__TAURI__.mocks` when [`app.withGlobalTauri`](https://v2.tauri.app/reference/config/#withglobaltauri) in `tauri.conf.json` is set to `true`.
 *
 * @module
 */
