// Automatically generated - do not modify!

@file:JsModule("node:os")

package node.os

/**
 * Returns the scheduling priority for the process specified by `pid`. If `pid` is
 * not provided or is `0`, the priority of the current process is returned.
 * @since v10.10.0
 * @param [pid=0] The process ID to retrieve scheduling priority for.
 */
external fun getPriority(
    pid: Number = definedExternally,
): Number
