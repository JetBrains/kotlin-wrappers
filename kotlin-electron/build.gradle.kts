plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinNode)
    webMainApi(projects.kotlinBrowser)

    webMainApi(npm(jspkg.electron))
}
