// Automatically generated - do not modify!

@file:JsModule("node:os")

package node.os

/**
 * Returns an estimate of the default amount of parallelism a program should use. Always returns a value greater than zero.
 *
 * This function is a small wrapper about libuv's [`uv_available_parallelism()`](https://docs.libuv.org/en/v1.x/misc.html#c.uv_available_parallelism).
 * @since 18.4.0
 */
external fun availableParallelism(): Number
