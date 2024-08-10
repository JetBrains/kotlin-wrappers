plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainImplementation(kotlinx.coroutines.core)

    jsTestImplementation(kotlinx.coroutines.test)
    jsTestImplementation(kotlin("test-js"))
}
