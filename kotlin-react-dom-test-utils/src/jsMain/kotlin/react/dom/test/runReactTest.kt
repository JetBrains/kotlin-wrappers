package react.dom.test

import js.globals.globalThis
import kotlinx.coroutines.test.TestResult
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.runTest
import react.FC
import react.Props
import web.dom.document
import web.html.HTML.div
import web.html.HTMLElement

fun runReactTest(
    testBody: suspend TestScope.(container: HTMLElement) -> Unit,
): TestResult {
    globalThis["IS_REACT_ACT_ENVIRONMENT"] = true

    return runTest {
        val container = document.createElement(div)
        document.body.appendChild(container)

        testBody(container)
    }
}

fun runReactTest(
    component: FC<Props>,
    testBody: suspend TestScope.(container: HTMLElement) -> Unit,
): TestResult =
    runReactTest { container ->
        val root = createRoot(container, component)

        testBody(container)

        unmount(root)
    }
