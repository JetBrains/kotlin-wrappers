plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinBrowser)

    webMainImplementation(projects.kotlinJsPlainObject)

    webMainApi(npm(jspkg.emotion.utils))
}
