// Automatically generated - do not modify!

package node.test

import node.events.EventType

sealed external interface TapStream : node.ReadableStream {
    fun addListener(
        event: TestEvent.DIAGNOSTIC,
        listener: (message: String) -> Unit,
    ) /* : this */

    fun addListener(
        event: TestEvent.FAIL,
        listener: (data: TestFail) -> Unit,
    ) /* : this */

    fun addListener(
        event: TestEvent.PASS,
        listener: (data: TestPass) -> Unit,
    ) /* : this */

    override fun addListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    fun emit(
        event: TestEvent.DIAGNOSTIC,
        message: String,
    ): Boolean

    fun emit(
        event: TestEvent.FAIL,
        data: TestFail,
    ): Boolean

    fun emit(
        event: TestEvent.PASS,
        data: TestPass,
    ): Boolean

    override fun emit(
        event: EventType,
        vararg args: Any,
    ): Boolean

    fun on(
        event: TestEvent.DIAGNOSTIC,
        listener: (message: String) -> Unit,
    ) /* : this */

    fun on(
        event: TestEvent.FAIL,
        listener: (data: TestFail) -> Unit,
    ) /* : this */

    fun on(
        event: TestEvent.PASS,
        listener: (data: TestPass) -> Unit,
    ) /* : this */

    override fun on(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    fun once(
        event: TestEvent.DIAGNOSTIC,
        listener: (message: String) -> Unit,
    ) /* : this */

    fun once(
        event: TestEvent.FAIL,
        listener: (data: TestFail) -> Unit,
    ) /* : this */

    fun once(
        event: TestEvent.PASS,
        listener: (data: TestPass) -> Unit,
    ) /* : this */

    override fun once(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    fun prependListener(
        event: TestEvent.DIAGNOSTIC,
        listener: (message: String) -> Unit,
    ) /* : this */

    fun prependListener(
        event: TestEvent.FAIL,
        listener: (data: TestFail) -> Unit,
    ) /* : this */

    fun prependListener(
        event: TestEvent.PASS,
        listener: (data: TestPass) -> Unit,
    ) /* : this */

    override fun prependListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    fun prependOnceListener(
        event: TestEvent.DIAGNOSTIC,
        listener: (message: String) -> Unit,
    ) /* : this */

    fun prependOnceListener(
        event: TestEvent.FAIL,
        listener: (data: TestFail) -> Unit,
    ) /* : this */

    fun prependOnceListener(
        event: TestEvent.PASS,
        listener: (data: TestPass) -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */
}
