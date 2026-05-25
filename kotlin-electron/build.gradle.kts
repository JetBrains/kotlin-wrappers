plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinNode)
    webMainApi(projects.kotlinBrowser)

    webMainApi(npm(jspkg.electron))
}
