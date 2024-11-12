package node.assert

import js.promise.Promise
import kotlinx.coroutines.test.runTest
import kotlin.test.Test

class JsAsyncTest {
    @Test
    fun checkJsAsyncForDoesNotReject() = runTest {
        doesNotReject(Promise.resolve())
    }
}
