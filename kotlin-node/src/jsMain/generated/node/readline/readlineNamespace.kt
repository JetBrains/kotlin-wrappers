@file:JsModule("node:readline")

package node.readline


/**
 * The `readline` module provides an interface for reading data from a `Readable` stream (such as `process.stdin`) one line at a time.
 *
 * To use the promise-based APIs:
 *
 * ```js
 * import * as readline from 'node:readline/promises';
 * ```
 *
 * To use the callback and sync APIs:
 *
 * ```js
 * import * as readline from 'node:readline';
 * ```
 *
 * The following simple example illustrates the basic use of the `readline` module.
 *
 * ```js
 * import * as readline from 'node:readline/promises';
 * import { stdin as input, stdout as output } from 'node:process';
 *
 * const rl = readline.createInterface({ input, output });
 *
 * const answer = await rl.question('What do you think of Node.js? ');
 *
 * console.log(`Thank you for your valuable feedback: ${answer}`);
 *
 * rl.close();
 * ```
 *
 * Once this code is invoked, the Node.js application will not terminate until the`readline.Interface` is closed because the interface waits for data to be
 * received on the `input` stream.
 * @see [source](https://github.com/nodejs/node/blob/v18.0.0/lib/readline.js)
 */
