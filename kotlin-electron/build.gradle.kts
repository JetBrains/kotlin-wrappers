plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinNode)
    commonMainApi(projects.kotlinBrowser)

    commonMainApi(npm(jspkg.electron))
}
