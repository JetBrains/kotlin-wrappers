plugins {
    id("examplesbuild.kotlin-conventions")
}

kotlin {
    js(IR) {
        nodejs { }
        compilations.named("test") {
            packageJson { customField("mocha", mapOf("require" to arrayOf(
                // configures coroutines default dispatcher to NodeDispatcher -- needed if using DefaultDispatcher instead of kotlinx-coroutines-test
                projectDir.resolve("mocha-support/append-jsdom-to-user-agent-name.js").absolutePath,
                // installs browser-like environment used by react-testing-library to run tests
                "global-jsdom/register"
            )))}
        }
    }
}

dependencies {
    jsMainImplementation(kotlinWrappers.js)
    jsMainImplementation(kotlinWrappers.react)
    jsMainImplementation(kotlinWrappers.reactUse)
    jsMainImplementation(kotlinWrappers.reactDom)
    jsMainImplementation(kotlinWrappers.tanstack.reactRouter)
    jsTestImplementation(libs.kotlin.test)
    jsTestImplementation(libs.coroutines.test)
    jsTestImplementation(kotlinWrappers.testingLibraryUserEvent)
    jsTestImplementation(kotlinWrappers.testingLibraryReact)
    jsTestImplementation(kotlinWrappers.testingLibraryDom)
    jsTestImplementation(npm("global-jsdom", "latest"))
}

tasks.named<org.jetbrains.kotlin.gradle.targets.js.testing.KotlinJsTest>("jsNodeTest") {
    // required to make tanstack react router fire load events in mocha/node/jsdom tests
    environment("NODE_ENV", "test")
}
