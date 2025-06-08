plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinJs)
    commonMainApi(projects.kotlinBrowser)

    commonMainApi(npm(jspkg.popperjs.core))
}
