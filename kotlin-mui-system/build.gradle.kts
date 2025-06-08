plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinReactDom)

    commonMainApi(npm(jspkg.mui.system))
}
