plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinBrowser)

    commonMainApi(npm(jspkg.emotion.utils))
}
