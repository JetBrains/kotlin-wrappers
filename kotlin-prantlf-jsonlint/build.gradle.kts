plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinJs)
    commonMainApi(npm(jspkg.prantlf.jsonlint))
}
