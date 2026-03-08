package testing.library.user.event

import js.globals.globalThis
import kotlinx.coroutines.test.runTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertIs

class ModuleTest {
    @BeforeTest
    fun setup() {
        // mock window
        globalThis["window"] = globalThis
    }

    @Test
    fun `should handle correctly classes exports`() = runTest {
        assertIs<Function<*>>(System::class.js)
        assertIs<Function<*>>(KeyboardHost::class.js)
        assertIs<Function<*>>(PointerHost::class.js)
    }

    @Test
    fun `should handle correctly constants exports`() {
        assertIs<Any>(PointerEventsCheckLevel)
        assertIs<Any>(DOM_KEY_LOCATION)
        assertIs<Any>(MouseButtonConstants)
    }

    @Test
    fun `should handle correctly API exports`() {
        assertIs<Any>(userEvent)
        assertIs<Any>(userEventApi)
    }
}
