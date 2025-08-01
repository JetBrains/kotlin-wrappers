// Automatically generated - do not modify!

package tanstack.table.core

import js.objects.ReadonlyRecord
import js.reflect.unsafeCast

sealed external interface ExpandedState /* true | Record<string, boolean> */

inline fun ExpandedState(
    source: Boolean, /* true */
): ExpandedState =
    unsafeCast(source)

inline fun ExpandedState(
    source: ReadonlyRecord<String, Boolean>,
): ExpandedState =
    unsafeCast(source)
