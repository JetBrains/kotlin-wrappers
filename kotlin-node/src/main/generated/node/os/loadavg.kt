// Automatically generated - do not modify!

@file:JsModule("node:os")
@file:JsNonModule

package node.os

import kotlinx.js.ReadonlyArray

/**
 * Returns an array containing the 1, 5, and 15 minute load averages.
 *
 * The load average is a measure of system activity calculated by the operating
 * system and expressed as a fractional number.
 *
 * The load average is a Unix-specific concept. On Windows, the return value is
 * always `[0, 0, 0]`.
 * @since v0.3.3
 */
external fun loadavg(): ReadonlyArray<Number>
