import org.jetbrains.kotlin.gradle.targets.js.testing.KotlinJsTest

plugins {
    id("examplesbuild.kotlin-conventions")
}

kotlin {
    js {
        nodejs()
        compilations.named("test") {
            packageJson {
                customField(
                    "mocha",
                    mapOf(
                        "require" to arrayOf(
                            // configures coroutines default dispatcher to NodeDispatcher -- needed if using DefaultDispatcher instead of kotlinx-coroutines-test
                            projectDir.resolve("mocha-support/force-correct-default-coroutines-dispatcher.js").absolutePath,
                            // installs browser-like environment used by react-testing-library to run tests
                            "global-jsdom/register",
                        ),
                    ),
                )
            }
        }
    }
}

dependencies {
    webMainImplementation(kotlinWrappers.js)
    webMainImplementation(kotlinWrappers.react)
    webMainImplementation(kotlinWrappers.reactUse)
    webMainImplementation(kotlinWrappers.reactDom)
    webMainImplementation(kotlinWrappers.tanstack.reactRouter)
    jsTestImplementation(libs.kotlin.test)
    jsTestImplementation(libs.coroutines.test)
    jsTestImplementation(kotlinWrappers.testingLibraryUserEvent)
    jsTestImplementation(kotlinWrappers.testingLibraryReact)
    jsTestImplementation(kotlinWrappers.testingLibraryDom)
    jsTestImplementation(npm("global-jsdom", "28.0.0"))

    // WA for https://github.com/TanStack/router/issues/7472
    webMainImplementation(npm("@tanstack/router-core", "1.171.3"))
    webMainImplementation(npm("@tanstack/react-router", "1.170.5"))
}

tasks.named<KotlinJsTest>("jsNodeTest") {
    // required to make tanstack react router fire load events in mocha/node/jsdom tests
    environment("NODE_ENV", "test")
}
