// Automatically generated - do not modify!

@file:JsModule("node:os")

package node.os

/**
 * Attempts to set the scheduling priority for the process specified by `pid`. If`pid` is not provided or is `0`, the process ID of the current process is used.
 *
 * The `priority` input must be an integer between `-20` (high priority) and `19`(low priority). Due to differences between Unix priority levels and Windows
 * priority classes, `priority` is mapped to one of six priority constants in`os.constants.priority`. When retrieving a process priority level, this range
 * mapping may cause the return value to be slightly different on Windows. To avoid
 * confusion, set `priority` to one of the priority constants.
 *
 * On Windows, setting priority to `PRIORITY_HIGHEST` requires elevated user
 * privileges. Otherwise the set priority will be silently reduced to`PRIORITY_HIGH`.
 * @since v10.10.0
 * @param [pid=0] The process ID to set scheduling priority for.
 * @param priority The scheduling priority to assign to the process.
 */
external fun setPriority(
    priority: Number,
)


/**
 * Attempts to set the scheduling priority for the process specified by `pid`. If`pid` is not provided or is `0`, the process ID of the current process is used.
 *
 * The `priority` input must be an integer between `-20` (high priority) and `19`(low priority). Due to differences between Unix priority levels and Windows
 * priority classes, `priority` is mapped to one of six priority constants in`os.constants.priority`. When retrieving a process priority level, this range
 * mapping may cause the return value to be slightly different on Windows. To avoid
 * confusion, set `priority` to one of the priority constants.
 *
 * On Windows, setting priority to `PRIORITY_HIGHEST` requires elevated user
 * privileges. Otherwise the set priority will be silently reduced to`PRIORITY_HIGH`.
 * @since v10.10.0
 * @param [pid=0] The process ID to set scheduling priority for.
 * @param priority The scheduling priority to assign to the process.
 */
external fun setPriority(
    pid: Number,
    priority: Number,
)
