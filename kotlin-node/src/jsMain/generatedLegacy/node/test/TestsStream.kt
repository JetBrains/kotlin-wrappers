// Automatically generated - do not modify!

package node.test

import node.events.EventType

sealed external interface TestsStream : node.ReadableStream {
    fun addListener(
        event: TestEvent.DIAGNOSTIC,
        listener: (data: DiagnosticData) -> Unit,
    ) /* : this */

    fun addListener(
        event: TestEvent.FAIL,
        listener: (data: TestFail) -> Unit,
    ) /* : this */

    fun addListener(
        event: TestEvent.PASS,
        listener: (data: TestPass) -> Unit,
    ) /* : this */

    fun addListener(
        event: TestEvent.PLAN,
        listener: (data: TestPlan) -> Unit,
    ) /* : this */

    fun addListener(
        event: TestEvent.START,
        listener: (data: TestStart) -> Unit,
    ) /* : this */

    override fun addListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    fun emit(
        event: TestEvent.DIAGNOSTIC,
        data: DiagnosticData,
    ): Boolean

    fun emit(
        event: TestEvent.FAIL,
        data: TestFail,
    ): Boolean

    fun emit(
        event: TestEvent.PASS,
        data: TestPass,
    ): Boolean

    fun emit(
        event: TestEvent.PLAN,
        data: TestPlan,
    ): Boolean

    fun emit(
        event: TestEvent.START,
        data: TestStart,
    ): Boolean

    override fun emit(
        event: EventType,
        vararg args: Any,
    ): Boolean

    fun on(
        event: TestEvent.DIAGNOSTIC,
        listener: (data: DiagnosticData) -> Unit,
    ) /* : this */

    fun on(
        event: TestEvent.FAIL,
        listener: (data: TestFail) -> Unit,
    ) /* : this */

    fun on(
        event: TestEvent.PASS,
        listener: (data: TestPass) -> Unit,
    ) /* : this */

    fun on(
        event: TestEvent.PLAN,
        listener: (data: TestPlan) -> Unit,
    ) /* : this */

    fun on(
        event: TestEvent.START,
        listener: (data: TestStart) -> Unit,
    ) /* : this */

    override fun on(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    fun once(
        event: TestEvent.DIAGNOSTIC,
        listener: (data: DiagnosticData) -> Unit,
    ) /* : this */

    fun once(
        event: TestEvent.FAIL,
        listener: (data: TestFail) -> Unit,
    ) /* : this */

    fun once(
        event: TestEvent.PASS,
        listener: (data: TestPass) -> Unit,
    ) /* : this */

    fun once(
        event: TestEvent.PLAN,
        listener: (data: TestPlan) -> Unit,
    ) /* : this */

    fun once(
        event: TestEvent.START,
        listener: (data: TestStart) -> Unit,
    ) /* : this */

    override fun once(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    fun prependListener(
        event: TestEvent.DIAGNOSTIC,
        listener: (data: DiagnosticData) -> Unit,
    ) /* : this */

    fun prependListener(
        event: TestEvent.FAIL,
        listener: (data: TestFail) -> Unit,
    ) /* : this */

    fun prependListener(
        event: TestEvent.PASS,
        listener: (data: TestPass) -> Unit,
    ) /* : this */

    fun prependListener(
        event: TestEvent.PLAN,
        listener: (data: TestPlan) -> Unit,
    ) /* : this */

    fun prependListener(
        event: TestEvent.START,
        listener: (data: TestStart) -> Unit,
    ) /* : this */

    override fun prependListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */

    fun prependOnceListener(
        event: TestEvent.DIAGNOSTIC,
        listener: (data: DiagnosticData) -> Unit,
    ) /* : this */

    fun prependOnceListener(
        event: TestEvent.FAIL,
        listener: (data: TestFail) -> Unit,
    ) /* : this */

    fun prependOnceListener(
        event: TestEvent.PASS,
        listener: (data: TestPass) -> Unit,
    ) /* : this */

    fun prependOnceListener(
        event: TestEvent.PLAN,
        listener: (data: TestPlan) -> Unit,
    ) /* : this */

    fun prependOnceListener(
        event: TestEvent.START,
        listener: (data: TestStart) -> Unit,
    ) /* : this */

    override fun prependOnceListener(
        event: EventType,
        listener: Function<Unit>,
    ) /* : this */
}
