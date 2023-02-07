// Automatically generated - do not modify!

@file:JsModule("node:vm")

package node.vm

/**
 * `vm.runInThisContext()` compiles `code`, runs it within the context of the
 * current `global` and returns the result. Running code does not have access to
 * local scope, but does have access to the current `global` object.
 *
 * If `options` is a string, then it specifies the filename.
 *
 * The following example illustrates using both `vm.runInThisContext()` and
 * the JavaScript [`eval()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/eval) function to run the same code:
 *
 * ```js
 * const vm = require('vm');
 * let localVar = 'initial value';
 *
 * const vmResult = vm.runInThisContext('localVar = "vm";');
 * console.log(`vmResult: '${vmResult}', localVar: '${localVar}'`);
 * // Prints: vmResult: 'vm', localVar: 'initial value'
 *
 * const evalResult = eval('localVar = "eval";');
 * console.log(`evalResult: '${evalResult}', localVar: '${localVar}'`);
 * // Prints: evalResult: 'eval', localVar: 'eval'
 * ```
 *
 * Because `vm.runInThisContext()` does not have access to the local scope,`localVar` is unchanged. In contrast,
 * [`eval()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/eval) _does_ have access to the
 * local scope, so the value `localVar` is changed. In this way`vm.runInThisContext()` is much like an [indirect `eval()` call](https://es5.github.io/#x10.4.2), e.g.`(0,eval)('code')`.
 *
 * ## Example: Running an HTTP server within a VM
 *
 * When using either `script.runInThisContext()` or {@link runInThisContext}, the code is executed within the current V8 global
 * context. The code passed to this VM context will have its own isolated scope.
 *
 * In order to run a simple web server using the `http` module the code passed to
 * the context must either call `require('http')` on its own, or have a reference
 * to the `http` module passed to it. For instance:
 *
 * ```js
 * 'use strict';
 * const vm = require('vm');
 *
 * const code = `
 * ((require) => {
 *   const http = require('http');
 *
 *   http.createServer((request, response) => {
 *     response.writeHead(200, { 'Content-Type': 'text/plain' });
 *     response.end('Hello World\\n');
 *   }).listen(8124);
 *
 *   console.log('Server running at http://127.0.0.1:8124/');
 * })`;
 *
 * vm.runInThisContext(code)(require);
 * ```
 *
 * The `require()` in the above case shares the state with the context it is
 * passed from. This may introduce risks when untrusted code is executed, e.g.
 * altering objects in the context in unwanted ways.
 * @since v0.3.1
 * @param code The JavaScript code to compile and run.
 * @return the result of the very last statement executed in the script.
 */
external fun runInThisContext(
    code: String,
    options: Any /* RunningScriptOptions | string */ = definedExternally,
): Any
