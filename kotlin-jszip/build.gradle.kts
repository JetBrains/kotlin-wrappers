plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinWeb)

    webMainImplementation(projects.kotlinJsPlainObject)

    webMainApi(npm(jspkg.jszip))
}
