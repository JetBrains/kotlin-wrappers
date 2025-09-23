package node

import node.assert.assert
import node.cluster.cluster
import node.events.EventEmitter
import node.module.Module
import node.path.path
import node.process.process
import node.stream.Stream
import node.test.test
import kotlin.test.Test
import kotlin.test.assertIs

class ModuleTest {
    @Test
    fun `should handle correctly default exports from modules`() {
        val assert: (Any?) -> Unit = ::assert
        assertIs<Function<*>>(assert)

        assertIs<Any>(cluster)

        assertIs<Function<*>>(EventEmitter::class.js)

        assertIs<Function<*>>(Module::class.js)

        assertIs<Any>(path)

        assertIs<Any>(process)

        assertIs<Function<*>>(Stream::class.js)

        val test: suspend () -> Unit = ::test
        assertIs<Function<*>>(test)
    }
}
