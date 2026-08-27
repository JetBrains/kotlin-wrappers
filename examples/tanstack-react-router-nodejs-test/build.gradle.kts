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

kotlin {
    sourceSets.webMain.dependencies {
        implementation(kotlinWrappers.js)
        implementation(kotlinWrappers.react)
        implementation(kotlinWrappers.reactUse)
        implementation(kotlinWrappers.reactDom)
        implementation(kotlinWrappers.tanstack.reactRouter)

        // WA for https://github.com/TanStack/router/issues/7472
        implementation(npm("@tanstack/router-core", "1.171.3"))
        implementation(npm("@tanstack/react-router", "1.170.5"))
    }

    sourceSets.webTest.dependencies {
        implementation(libs.kotlin.test)
        implementation(libs.coroutines.test)
        implementation(kotlinWrappers.testingLibraryUserEvent)
        implementation(kotlinWrappers.testingLibraryReact)
        implementation(kotlinWrappers.testingLibraryDom)
        implementation(npm("global-jsdom", "28.0.0"))
    }
}

tasks.named<KotlinJsTest>("jsNodeTest") {
    // required to make tanstack react router fire load events in mocha/node/jsdom tests
    environment("NODE_ENV", "test")
}
