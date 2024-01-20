// Generated by Karakum - do not modify it manually!

@file:JsModule("node:test")

package node.test


/**
 * **Note:**`shard` is used to horizontally parallelize test running across
 * machines or processes, ideal for large-scale executions across varied
 * environments. It's incompatible with `watch` mode, tailored for rapid
 * code iteration by automatically rerunning tests on file changes.
 *
 * ```js
 * import { tap } from 'node:test/reporters';
 * import { run } from 'node:test';
 * import process from 'node:process';
 * import path from 'node:path';
 *
 * run({ files: [path.resolve('./tests/test.js')] })
 *   .compose(tap)
 *   .pipe(process.stdout);
 * ```
 * @since v18.9.0, v16.19.0
 * @param options Configuration options for running tests. The following properties are supported:
 */
external fun run(options: RunOptions = definedExternally): TestsStream