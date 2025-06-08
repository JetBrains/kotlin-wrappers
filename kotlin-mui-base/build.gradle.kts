plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinMuiSystem)
    jsMainApi(projects.kotlinPopperjsCore)

    commonMainApi(npm(jspkg.mui.base))
}
