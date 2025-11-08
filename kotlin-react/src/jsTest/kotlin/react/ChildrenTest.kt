package react

import js.array.ReadonlyArray
import kotlin.test.*

private val Container = FC<PropsWithChildren> {}

private val Part = FC<Props> {}

class ChildrenTest {
    @Test
    fun `null for 0 children (invoke without block)`() {
        val element = Container.create()

        val children: Any? = element.props.children

        assertNull(children)
    }

    @Test
    fun `null for 0 children`() {
        val element = Container.create {}

        val children: Any? = element.props.children

        assertNull(children)
    }

    @Test
    fun `no array for 1 child`() {
        val element = Container.create {
            Part()
        }

        val children: Any? = element.props.children

        assertNotNull(children)
        assertIsNot<ReadonlyArray<*>>(children)
    }

    @Test
    fun `array for 2 children`() {
        val element = Container.create {
            Part()
            Part()
        }

        assertIs<ReadonlyArray<*>>(element.props.children)
    }

    @Test
    fun `array for 3 children`() {
        val element = Container.create {
            Part()
            Part()
            Part()
        }

        assertIs<ReadonlyArray<*>>(element.props.children)
    }

    @Test
    fun `array for 7 children`() {
        val element = Container.create {
            Part()
            Part()
            Part()
            Part()
            Part()
            Part()
            Part()
        }

        assertIs<ReadonlyArray<*>>(element.props.children)
    }
}
